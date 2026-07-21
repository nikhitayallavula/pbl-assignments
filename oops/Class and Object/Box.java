import java.util.Scanner;
public class Box{
    int width;
    int height;
    int depth;
    Box(int w1,int h1,int d1){
        width=w1;
        height=h1;
        depth=d1;
    }
    int volume(){
        return width*depth*height;
    }
}
class Main{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Box obj = new Box(a,b,c);
        System.out.println("Volume: "+obj.volume());
        sc.close();
    }
}
