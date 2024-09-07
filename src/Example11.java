//===============Non-Primitive (String, Array, Scanner)===============//

import java.util.Scanner;

public class Example11 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        byte b1 = input.nextByte();
        System.out.println(b1);

        short s1 = input.nextShort();
        System.out.println(s1);

        int x1 = input.nextInt();
        System.out.println(x1);

        long l1 = input.nextLong();
        System.out.println(l1);

        float f1 = input.nextFloat();
        System.out.println(f1);

        double d1 = input.nextDouble();
        System.out.println(d1);

        //===========Data Representation in Computer Memory==//
        char ch1 = 'A';
        System.out.println("ch1: " + ch1);

        char ch2 = 65;
        System.out.println("ch2: " + ch2);

        System.out.println("A"+"B");	//AB
        System.out.println('A'+"B");	//AB
        System.out.println('A'+'B');	//131
        System.out.println('A'+100);	//165


    }

}
