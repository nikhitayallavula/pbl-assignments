import java.util.Scanner;
class Video {

    private String videoName;
    private boolean checkout;
    private int rating;

    // Constructor
    public Video(String name) {
        videoName = name;
        checkout = false;
        rating = 0;
    }

    // Returns video name
    public String getName() {
        return videoName;
    }

    // Checkout the video
    public void doCheckout() {
        checkout = true;
    }

    // Return the video
    public void doReturn() {
        checkout = false;
    }

    // Receive rating
    public void receiveRating(int rating) {
        this.rating = rating;
    }

    // Return rating
    public int getRating() {
        return rating;
    }

    // Return checkout status
    public boolean getCheckout() {
        return checkout;
    }
}
class VideoStore {

    private Video[] store;
    private int count;

    // Constructor
    public VideoStore() {
        store = new Video[10]; // Can store 10 videos
        count = 0;
    }

    // Add a video
    public void addVideo(String name) {
        store[count] = new Video(name);
        count++;
        System.out.println("Video \"" + name + "\" added successfully.");
    }

    // Checkout a video
    public void doCheckout(String name) {

        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].doCheckout();
                System.out.println("Video \"" + name + "\" checked out successfully.");
                return;
            }
        }

        System.out.println("Video not found.");
    }

    // Return a video
    public void doReturn(String name) {

        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].doReturn();
                System.out.println("Video \"" + name + "\" returned successfully.");
                return;
            }
        }

        System.out.println("Video not found.");
    }

    // Receive rating
    public void receiveRating(String name, int rating) {

        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].receiveRating(rating);
                System.out.println("Rating \"" + rating +
                        "\" has been mapped to the Video \"" + name + "\".");
                return;
            }
        }

        System.out.println("Video not found.");
    }

    // Display inventory
    public void listInventory() {

        System.out.println("-----------------------------------------------");
        System.out.printf("%-20s %-18s %-10s%n",
                "Video Name", "Checkout Status", "Rating");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-20s %-18b %-10d%n",
                    store[i].getName(),
                    store[i].getCheckout(),
                    store[i].getRating());
        }

        System.out.println("-----------------------------------------------");
    }
}

public class VideoLauncher {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VideoStore store = new VideoStore();

        int choice;

        do {
            System.out.println("\n========== Video Rental Inventory ==========");
            System.out.println("1. Add Video");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Video Name: ");
                    String addVideo = sc.nextLine();
                    store.addVideo(addVideo);
                    break;

                case 2:
                    System.out.print("Enter Video Name to Checkout: ");
                    String checkout = sc.nextLine();
                    store.doCheckout(checkout);
                    break;

                case 3:
                    System.out.print("Enter Video Name to Return: ");
                    String ret = sc.nextLine();
                    store.doReturn(ret);
                    break;

                case 4:
                    System.out.print("Enter Video Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Rating (1-10): ");
                    int rating = sc.nextInt();

                    store.receiveRating(name, rating);
                    break;

                case 5:
                    store.listInventory();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}