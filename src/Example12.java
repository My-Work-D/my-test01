//====================Reserve-words, Keywords & Identifies==//

public class Example12 {
    public static void main(String args[]){
        int x;	//Legal
        //int 0;	// Illegal
        int x0;	//Legal
        //int @;	//Illegal
        int $;
        //int _;	//Illegal
        int _x;	//Legal
        int A;	//Legal

        //
       // int first number; //Illegal
        int firstnumber;	//Legal

        // camel case
        int secondNumber;

        // snake case
        int last_number;

        //============	“Type Casting”==========//
        byte b;	// (8bit)
        int x3;	// (32bit)

        b = 10;
        x3 = b;	//variable conversion

        System.out.println(x3 + " " + b);
        System.out.println("=====================");
        short s = 10;	//(16bit)
        byte d;			// (8bit)

        // b = s;	//Illegal

        d = (byte)s;	//casting
        System.out.println(d);

        System.out.println("=================");
        int total = 567;	//(32bit)
        int count = 10;

        double avg;			//(64bit)

        avg = (double)total / count;	//wider casting
        System.out.println(avg);	//56.7

        System.out.println("===========================");

        double e = 12;

        int f = (int)e;	//narrow casting

        int a = 100;
        double w = 200;

        a += w;	//narrow conversion
        System.out.println(a);	//300


        System.out.println("========================");
//                +	addition
//                -	subtraction
//                *	multiplication
//                /	division
//                +,-(unary)
//                %	modular
//                ++incrementer
//                --decremented

        System.out.println("===================");

        int x1 = 25;
        int y = 10;

        int result;

        result = x1 + y;	// addition
        System.out.println(result);

        result = x1 - y;	//substraction
        System.out.println(result);

        result = x1 * y;	//multiplication
        System.out.println(result);

        result = x1 / y;	//devision  25 / 10
        System.out.println(result);	//2

        result = x1 % y;	//modular 25 % 10
        System.out.println(result);	//5

        System.out.println("=================================");

        int i=99,j=100;
        System.out.println("x>y  : "+(i>j)); 	//false
        System.out.println("x<y  : "+(i<j)); 	//true
        System.out.println("x>=y : "+(i>=j));	//false
        System.out.println("x<=y : "+(i<=j));	//true
        System.out.println("x==y : "+(i==j));	//false
        System.out.println("x!=y : "+(i!=j));	//true

        System.out.println("==================================");

        int x2 = 100;

        x2 = x2 + 10;	//assign operator

        x2 += 10;	//compound operator

    }

}

//out-put
//10 10
//=====================
//10
//=================
//56.7
//===========================
//300
//========================
//===================
//35
//15
//250
//2
//5
//=================================
//x>y  : false
//x<y  : true
//x>=y : false
//x<=y : true
//x==y : false
//x!=y : true
//==================================