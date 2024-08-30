

//==================String concatenation Vs. Arithmatic Addition============//

public class Example07 {
    public static void main(String args[]){
        System.out.println(10 + 20);	//Arithmatic Addition
        System.out.println("10" + "20");	//String Concatenation
        System.out.println("========");
        //
        System.out.println(10+20); // ?30
        System.out.println("10"+"20"); //?1020
        System.out.println(10+"20"); //?1020
        System.out.println("10"+20);	 //?1020
        System.out.println("========");

        //
        System.out.println("10+20+30");		//Line 10+20+30
        System.out.println("10+20"+"30");	//Line 2 //10+2030
        System.out.println("10"+"20+30");	//Line 3 //1020+30
        System.out.println("10"+"20"+"30");	//Line 4 //102030
        System.out.println(10+"20"+"30");	//Line 5 //102030
        System.out.println("10"+20+"30");	//Line 6 //102030
        System.out.println("10"+"20"+30);	//Line 7 //102030
        System.out.println(10+20+"30");		//Line 8 //3030
        System.out.println("10"+20+30);		//Line 9 //1050
        System.out.println(10+20+30);       //60
        System.out.println("========");
        //

        int x=10,y=20,z=30;
        System.out.println("x+y+z");	//x+y+z
        System.out.println("x+y"+"z");	//x+yz
        System.out.println("x"+"y+z");	//xy+z
        System.out.println("x"+"y"+"z"); //x+yz
        System.out.println(x+"y"+"z");	//xyz
        System.out.println("x"+y+"z");	//10yz
        System.out.println("x"+"y"+z);	//x20z
        System.out.println(x+y+"z");	//xy30
        System.out.println("x"+y+z);	///x2030
        System.out.println(x+y+z);	////60
        System.out.println("========");
        //
        int i=10,j=20;

        System.out.println(i+ " " + j);	// 10 20
        System.out.println("========");
        //
        int age = 22;

        System.out.println();  //Your age is 22
        System.out.println("========");
        //
        int s = 10, d =20, t;

        t = s + d;
        System.out.println(s + " + " + d + " = " + t); // 10 + 20 = 30
        System.out.println("========");
    }


}

//out-put
//30
//1020
//========
//30
//1020
//1020
//1020
//========
//10+20+30
//10+2030
//1020+30
//102030
//102030
//102030
//102030
//3030
//102030
//60
//========
//x+y+z
//x+yz
//xy+z
//xyz
//10yz
//x20z
//xy30
//30z
//x2030
//60
//========
//10 20
//========
//
//========
//10 + 20 = 30
//========