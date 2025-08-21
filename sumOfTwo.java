import java.util.*;
public class sumOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int a= sc.nextInt();
        System.out.print("Enter the Secound Number:");
        int b=sc.nextInt();
        sc.close();
        int sum=a+b;
        int diff=a-b;
        float multi=a*b;
        int modu=a%b;
        float div=a/b;
        System.out.println(" Sum= "+sum+" difference= "+diff+" Multiply= "+multi+" Module= "+modu+" Division+ "+div);

    }
}
