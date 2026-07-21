

public class IsMultiple{

    public static boolean isMultiple(int n,int m){

        if(m==0){
            return false;
        }

        return n%m==0;
    }

    public static void main(String[]args){

        int n=20;
        int m=5;

        if(isMultiple(n,m)){
            System.out.println(n+" is an exact multiple of "+m);
        }else{
            System.out.println(n+" is not an exact multiple of "+m);
        }
    }
}