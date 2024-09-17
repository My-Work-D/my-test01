//==============case =================//

import java.util.Scanner;

public class Example19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Start");

        for (int i=0; i<10; ){
            System.out.println(i);
            i++;
        }
        System.out.println("End");

        System.out.println("================");

        for (int i=0; i<100; i++){
            System.out.println(i+1);
        }

        System.out.println("==================");

        for (int i=0; i<100; i++){
            System.out.println(100-i);
        }

        System.out.println("=================");

        for (int i=100; i>=1; i--){
            System.out.println(i);
        }

        System.out.println("=================");

        for (int i=1; i<=10; i++){
            System.out.print(i+",");
        }

        System.out.println("===================");
        for (int i=10; i>=1; i--){
            System.out.print(i+",");
        }

        System.out.println("======================");
        System.out.print("[");
        for (int i=1; i<= 10; i++){
            System.out.print(i+",");
        }
        System.out.println("\b\b]");

        System.out.println("======While loop=====");

        while (5<10){
            System.out.println("Sorry!!!!!!!!!!");
        }
    }



}
