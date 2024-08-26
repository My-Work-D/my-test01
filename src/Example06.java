//===============“final” keyword================//

public class Example06 {
    public static void main(String[] args) {
        int x = 10;
        x = 20;	// ?
        x = 200;
        x = 300;
        System.out.println(x); //? 300
        final int a ;
        a = 100;
        //a = 200;	//Illegal
        System.out.println(a); //? 100

        final int y = 20;
       // y = 200; // Illegal
        System.out.println(y); //? 20

        final int s=100;
        final int b=127;
        final int c=128;
        final int d;
        d=100;
        int e=100;
        System.out.println(s); //? 100
        System.out.println(b); //?127
        System.out.println(c); //?128
        System.out.println(d); //?100

        e = d;	//Legal
        System.out.println(e); //?100
       // d = e; //Illegal
       // a = b; //Illegal



    }

}
