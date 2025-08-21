public class Operators {
    public static void main(String[] args) {
        // System.out.println(10==100);
        int a=10;
        int b=15;
        int c=5;
        System.out.println(++c);
        
        // System.out.println(c);
        if (a<20 && b<20){
        System.out.println("T");
        int e=5;
        int f=6;
        System.out.println(e&f);         //true&true=true (AND)
            System.out.println(e|f);    //               (OR)
            System.out.println(e^f);    //              (XOR)
            System.out.println(~f);     //      -(b+1)  (Complement)
            System.out.println(8<<2);   //8*2^2=32
            System.out.println(8>>2);   //8/2^2
        }
    }
}
