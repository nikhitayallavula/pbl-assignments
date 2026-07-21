

import java.util.Scanner;

public class IsPalindromePossible {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number:");
        int num=sc.nextInt();

        int count[]=new int[10];

        while(num>0){
            int digit=num%10;
            count[digit]++;
            num=num/10;
        }

        int odd=0;

        for(int i=0;i<10;i++){
            if(count[i]%2!=0){
                odd++;
            }
        }

        if(odd<=1){
            System.out.println("Palindrome Possible");
        }
        else{
            System.out.println("Palindrome Not Possible");
        }

        sc.close();
    }
}