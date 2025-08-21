import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n,r=0,sum=0;
        sc.close();
        while(m>0){
            r=m%10;
            sum=(sum*10)+r;
            m=m/10;
        }
        if (sum==n) {
            System.out.print("Palindrome");
        }
        else{
            System.out.print("No");
        }
    }
}
