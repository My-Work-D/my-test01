//=================“Storing String Literals”===================//

import java.util.Scanner;

public class Example09 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int age = 22;	//Integer Literal
        double weight = 50.1;	//Floating-point Literal

        String name = "Dusvi";	//String Literal

        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("weight: " + weight);
        System.out.println("=================");

        //
        System.out.print("Input your first name: ");
        String first = input.nextLine();	//Savindu

        System.out.print("Input your second name: ");
        String second = input.nextLine();	//Thathsara

        System.out.println("Full Name: " + first + " " + second);
        System.out.println("====================");
        //
        int x = 10;
        int y = 20;

        System.out.println(x + " " + y);	// 10 20

        //-----Do not modify above
		/*
			do whatever you want

		*/
        //Do not modify after
        System.out.println(y + " " + x);	// 20 10


    }


}

//out-put
//name: Dusvi
//age: 22
//weight: 50.1
//=================
//Input your first name: Savindu
//Input your second name: Thathsara
//Full Name: Savindu Thathsara
//====================
//10 20
//20 10
