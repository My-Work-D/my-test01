//===========	“Bitwise Operators”	-> (&, |, ^, ~, >>, <<, >>>)==========//

public class Example16 {
    public static void main(String args[]){
        System.out.println(10 & 10);
        System.out.println(12 & 15);
        System.out.println(20 & 35);

        System.out.println(10 | 10);
        System.out.println(12 | 15);
        System.out.println(20 | 35);

        System.out.println(10 ^ 10);
        System.out.println(12 ^ 15);
        System.out.println(20 ^ 35);

        System.out.println(~10); //11
        System.out.println(~15); //16
        System.out.println(~35); //36

        int x = 99;

        if(x++ == 100) { //false
            System.out.println("true");
        }
        System.out.println("x: " + x);	//? 100




    }

}
