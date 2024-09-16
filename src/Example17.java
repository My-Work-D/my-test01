//==================================Boolean Logical Operators======================

import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //	& - Boolean AND
        //			| - Boolean OR
        //			^ - Boolean XOR
        //			&&- Short Circuit AND
        //			||- Short Circuit OR
        //			:?- Ternary

        int x = 5, y = 2;
        System.out.println(x + " " + y); //5 2

        if(x > 5 | y < 3){	//false | true -> true
            System.out.println("I'm in");
        }
        System.out.println(x + " " + y); //

        System.out.println("======================");

        int x1 = 5, y1 = 2;
        System.out.println(x1 + " " + y1); //5 2

        if(x1 > 5 | y1 > 5){	//false | false ->
            System.out.println("I'm in");
        }
        System.out.println(x1 + " " + y1); //

        System.out.println("==================");

        int x3 = 5, y3 = 2;
        System.out.println(x3 + " " + y3); //5 2

        if(++x3 == 5 & y3++ == 5){	//false & false
            //code
        }
        System.out.println(x3 + " " + y3); //6 3
        System.out.println("========================");

        int x2 = 3;
        int y2 = 2;
        System.out.println(x2 == 5 | y2 == 5); //false
        System.out.println(x2 == 5 & y2 == 5); //false
        System.out.println(x2 == 5 ^ y2 == 5); //false

        x2 = 5;
        y2 = 2;
        System.out.println(x2 == 5 | y2 == 5); //true
        System.out.println(x2 == 5 & y2 == 5); //false
        System.out.println(x2 == 5 ^ y2 == 5); //true

        x2 = 5;
        y2 = 5;
        System.out.println(x2 == 5 | y2 == 5); //true
        System.out.println(x2 == 5 & y2 == 5); //true
        System.out.println(x2 == 5 ^ y2 == 5); //false

        System.out.println("=====================");
//
//        ?: Ternary Operator (Conditional Operator/ if else operator)
//
//? -> if
//:  -> else



        System.out.print("Input prf mark: ");
        int mark = input.nextInt();	//

        if(mark >= 75) {
            System.out.println("A");
        } else if(mark >= 65) {
            System.out.println("B");
        } else if(mark >= 55) {
            System.out.println("C");
        } else {
            System.out.println("FAIL");
        }



    }
}


//out-put
//5 2
//I'm in
//5 2
//======================
//5 2
//5 2
//==================
//5 2
//6 3
//========================
//false
//false
//false
//true
//false
//true
//true
//true
//false
//=====================
//Input prf mark: 78
//A