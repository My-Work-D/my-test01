//==========================“Increment Operator” (++)===============//

import java.util.Scanner;

public class Example15 {

    //x++  ⇒ post-fix increment
    //++x ⇒ pre-fix increment

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int y = 10;

        y += 1;	//x = x + 1;
        System.out.println(y);	//?

        System.out.println("======================");

        int x = 10;

        System.out.println(x++);	//Line1 -10
        System.out.println(x++);	//Line2 -11
        System.out.println(++x);	//Line3 -13
        System.out.println(++x);	//Line4 -14
        System.out.println(x++);	//Line5 -14
        System.out.println(x);		//Line6 -15
        System.out.println(x++);	//Line7 -15
        System.out.println(++x);	//Line8 -17
        System.out.println(x++);	//Line9 -17
        System.out.println(++x);	//Line10 -19

        System.out.println("============================");

        int i = 10;

        System.out.println(i++); 	// 10
        System.out.println(i); 		// 11
        System.out.println(--i); 	// 10
        System.out.println(++i); 	// 11
        System.out.println(i--); 	// 11
        System.out.println(i++); 	// 10
        System.out.println(++i); 	// 12
        System.out.println(--i); 	// 11
        System.out.println(i--); 	// 11
        System.out.println(i--); 	// 10

        System.out.println("========================");



        System.out.print("Input an any Integer number: ");
        int num = input.nextInt();	//-5

        if(num < 0) {
            num *= -1;	// num = num * -1;
        }

        System.out.println("The absolute value is " + num);

        System.out.println("====================");

        System.out.print("Input the wheel count: ");
        int count = input.nextInt();	//

        if(count == 1) {
            System.out.println("Wheel Barrow");
        } else if(count == 2) {
            System.out.println("Bycycle");
        } else if(count == 3) {
            System.out.println("Three Wheel");
        } else if(count == 4) {
            System.out.println("Car");
        } else {
            System.out.println("Not recognized as a Vehicle");
        }


    }

}
