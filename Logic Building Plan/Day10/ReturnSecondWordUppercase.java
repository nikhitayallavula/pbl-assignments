

public class ReturnSecondWordUppercase {
    public static void main(String[] args) {

        String str = "Java Programming Language";

        String words[] = str.split(" ");

        if(words.length >= 2) {
            System.out.println(words[1].toUpperCase());
        }
        else {
            System.out.println("Second word not available");
        }
    }
}