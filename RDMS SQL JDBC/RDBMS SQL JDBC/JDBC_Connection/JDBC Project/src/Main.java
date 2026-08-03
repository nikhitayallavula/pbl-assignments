public class Main {

    public static void main(String args[]) {

        UserDAO dao = new UserDAO();

        String[] names = dao.getNames();

        for(String name : names) {

            System.out.println(name);

        }

    }

}