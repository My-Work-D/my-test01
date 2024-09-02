import java.util.Scanner;

//===============	“Java Scanner (Keyboard Input)”===============//
public class Example08 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        //int age = 22;

        int age = input.nextInt();
        System.out.println("Your age is: " + age);
        System.out.println("===============");
        //
        /*Input first num: 1020

		Input second num: 20
		Total is 30*/

        System.out.print("Input first num: ");
        int first = input.nextInt();	//ask input from keyboard

        System.out.print("Input second num: ");
        int second = input.nextInt();

        int total = first + second;
        System.out.println("Total is: " + total);
        System.out.println("===============");
        //
        int h1, h2, h3;

        System.out.print("Input house 1 count: ");
        h1 = input.nextInt();

        System.out.print("Input house 2 count: ");
        h2 = input.nextInt();

        System.out.print("Input house 3  count: ");
        h3 = input.nextInt();

        int total1 = h1 + h2 + h3;
        System.out.println("Total people: " + total1);
        System.out.println("===============");
//
        System.out.print("Input sub 1 mark: ");
        int sub1 = input.nextInt();

        System.out.print("Input sub 2 mark: ");
        int sub2 = input.nextInt();

        System.out.print("Input sub 3 mark: ");
        int sub3 = input.nextInt();

        System.out.print("Input sub 4 mark: ");
        int sub4 = input.nextInt();

        System.out.print("Input sub 5 mark: ");
        int sub5 = input.nextInt();

        int total2 = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Total: " + total2);

        int average;
        average = total2/5;
        System.out.println("Average: " + average);


    }

}

//out-put
//22
//Your age is: 22
//===============
//Input first num: 10
//Input second num: 20
//Total is: 30
//===============
//Input house 1 count: 30
//Input house 2 count: 20
//Input house 3  count: 20
//Total people: 70
//===============
//Input sub 1 mark: 77
//Input sub 2 mark: 80
//Input sub 3 mark: 69
//Input sub 4 mark: 85
//Input sub 5 mark: 90
//Total: 401
//Average: 80