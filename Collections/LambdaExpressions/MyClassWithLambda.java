package Collections.LambdaExpressions;

public class MyClassWithLambda {

    public static void main(String[] args) {

        WordCount wc=str->{

            if(str.trim().isEmpty())
                return 0;

            return str.trim().split("\\s+").length;
        };

        String s="Java is a programming language";

        System.out.println("Sentence : "+s);
        System.out.println("Word Count : "+wc.count(s));
    }
}