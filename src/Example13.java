
//=================“Type Casting”=========================//
public class Example13 {
    public static void main(String args[]){
        byte b;	// (8bit)
        int x;	// (32bit)

        b = 10;
        x = b;	//variable conversion

        System.out.println(x + " " + b);

        short s = 10;	//(16bit)
        byte b1;			// (8bit)

        // b = s;	//Illegal

        b1 = (byte)s;	//casting
        System.out.println(b1);
        System.out.println("========================");
        //
        //+	addition
        //	-	subtraction
        //	*	multiplication
        //	/	division
        //	+,-	(unary)
        //	%	modular
        //	++	incrementer
        //	--	decremented

        System.out.println("==========================");
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

    }

}
