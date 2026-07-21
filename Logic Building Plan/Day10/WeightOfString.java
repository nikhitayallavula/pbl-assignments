

public class WeightOfString {
    public static void main(String[] args) {

        String str="abc";

        int weight=0;

        for(int i=0;i<str.length();i++) {
            weight=weight+(str.charAt(i)-96);
        }

        System.out.println(weight);
    }
}