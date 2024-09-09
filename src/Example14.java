//=============== Java Flow Control====================//

import java.util.Scanner;

public class Example14 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int x = input.nextInt();	// 5


        System.out.println("A");
        System.out.println("B");

        if(x >= 15)
            System.out.println("C");

        System.out.println("D");
        System.out.println("E");
        System.out.println("F");

        //
        System.out.println("==============");

        System.out.print("Input a number: ");
        int x1 = input.nextInt();	// 20


        System.out.println("A");
        System.out.println("B");

        if(x1 >= 15) {	//—-start of the code block
            System.out.println("C");
            System.out.println("D");
        }	//—-end of the code block

        System.out.println("E");
        System.out.println("F");

        System.out.println("====================");
        System.out.print("Input your age: ");
        int age = input.nextInt();


        if(age >= 18) {
            System.out.println("You are eligible for vote");
        }

        System.out.println("====================");

        System.out.print("Input your PRF mark: ");
        int prfMark = input.nextInt();

        if(prfMark >= 50) {
            System.out.println("Pass");
        }

        System.out.println("======================");

      //  int d = 99, s = 100;

        //if(d) {	//Illegal
      //      System.out.println("A");
       // }

      //  if(s = 100) {	//Illegal
    //        System.out.println("B");
      //  }


        System.out.println("===========");
        int s=99,y=100;
        System.out.println(s);  		//99
        System.out.println(s = y); 		//100
        System.out.println(s == y);		//true
        System.out.println(s != y);		//false


        System.out.println("=====================");

        System.out.print("Input number 1 : ");
        int a = input.nextInt(); //10

        System.out.print("Input number 2 : ");
        int b = input.nextInt(); //24

        System.out.print("Input number 3 : ");
        int c = input.nextInt(); //98

        System.out.print("Input number 4 : ");
        int d = input.nextInt(); //2

        int max = a;
        if(max < b) {
            max = b;
        }
        if(max < c) {
            max = c;
        }
        if(max < d) {
            max = d;
        }

        System.out.println("Max value: " + max);	//98

        System.out.println("====================");

        System.out.print("Input your age: ");
        int agee = input.nextInt();

        if (agee >= 18) {
            System.out.println("Eligible for vote");
        } else {
            System.out.println("Not eligible for vote");
        }

        System.out.println("=======================");

        System.out.print("Input your PRF mark: ");
        int prfMark1 = input.nextInt();

        System.out.print("Input your DBMS mark: ");
        int dbmMark = input.nextInt();

        int total = dbmMark + prfMark1;
        double avg = (double)total / 2;

        System.out.println("Average: " + avg);

        if(avg >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        System.out.println("=========================");

        System.out.print("Input a number: ");
        int number = input.nextInt();	//7

        int mod = number % 2;

        if(mod == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }


    }



}

//Input a number: 3
//A
//B
//D
//E
//F
//==============
//Input a number: 4
//A
//B
//E
//F
//====================
//Input your age: 22
//You are eligible for vote
//====================
//Input your PRF mark: 88
//Pass
//======================
//===========
//99
//100
//true
//false
//=====================
//Input number 1 : 3
//Input number 2 : 3
//Input number 3 : 4
//Input number 4 : 2
//Max value: 4
//====================
//Input your age: 23
//Eligible for vote
//=======================
//Input your PRF mark: 78
//Input your DBMS mark: 89
//Average: 83.5
//Pass
//=========================
//Input a number: 23
//23 is Odd