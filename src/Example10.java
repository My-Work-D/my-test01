
//=================================Java Data types========================//
public class Example10 {
    public static void main(String args[]) {
        //
//        primitive data types
//
//    byte (8bit)
//    short (16bit)
//    int  (32bit)
//    long (64bit)
//    float (32bit)
//    double (64bit)
//    char (16bit)
//    boolean (1bit)
    //

            byte b1 = 127;	//Legal	 (Max of byte)
            System.out.println(b1);

            byte b2 = -128;	//Legal	(Min of byte)
            System.out.println(b2);

          //  byte b3 = 128;	//Illegal
          //  System.out.println(b3);

         //   byte b4 = -129;	//Illegal
          //  System.out.println(b4);

            System.out.println("==========================");
            byte b3 = Byte.MAX_VALUE;
            System.out.println("MAX of byte: " + b3);	//127

            byte b4 = Byte.MIN_VALUE;
            System.out.println("MIN of byte: " + b4);	//128

            //
            System.out.println("====================");
            short s1 = Short.MAX_VALUE;
            System.out.println("MAX of short: " + s1);

            short s2 = Short.MIN_VALUE;
            System.out.println("MIN of short: " + s2);

            System.out.println("========================");

            int x1 = Integer.MAX_VALUE;
            System.out.println("MAX of int: " + x1);

            int x2 = Integer.MIN_VALUE;
            System.out.println("MIN of int: " + x2);

            long l1 = Long.MAX_VALUE;
            System.out.println("MAX of long: " + l1);

            long l2 = Long.MIN_VALUE;
            System.out.println("MIN of long: " + l2);

            //
            System.out.println("=================");
            double d1 = 10.5;
            System.out.println(d1);
            System.out.println("=========================");
            //
            double d;
            float f;

            f=0.123456789123456789f;
            d=0.123456789123456789 ; //d or D

            System.out.println("float  : "+f);
            System.out.println("double : "+d);

            f=100.123456789123456789f;
            d=100.123456789123456789 ; //d or D

            System.out.println("float  : "+f);
            System.out.println("double : "+d);

            //
            System.out.println("=====================");
            char ch;
            ch = 'A';
            System.out.println(ch);	//A

            boolean b5;
            b5 = 10 > 5;
            System.out.println(b5);	//true



        }



}

//out-put
//127
//-128
//==========================
//MAX of byte: 127
//MIN of byte: -128
//====================
//MAX of short: 32767
//MIN of short: -32768
//========================
//MAX of int: 2147483647
//MIN of int: -2147483648
//MAX of long: 9223372036854775807
//MIN of long: -9223372036854775808
//=================
//10.5
//=========================
//float  : 0.12345679
//double : 0.12345678912345678
//float  : 100.12346
//double : 100.12345678912345
//=====================
//A
//true
