
//=================java method and loops====================//
public class Example21 {
    public static void methodA(){
        System.out.println("start methodA()");
        int x = 10;
        int y = 20;
        System.out.println("end start methodA()");

        System.out.println("=====================");
    }

    public static void increment(){
        int x1 = 100;
        x1++;
        System.out.println("x : " + x1);

        System.out.println("================");
    }
    public static int increment(int x){
        System.out.println("x : " + x);
        x++;
        System.out.println("x : " + x);
        return x;

    }

    public static int increment1(int x){	//
        System.out.println("x : " + x);	//
        x++;
        System.out.println("x : " + x);	//
        return x;	//
    }



    public static void main(String[] args) {

        System.out.println("start main");
        int x = 100;
        int y = 200;

        methodA();
        System.out.println("end main");

        System.out.println("===================");
        int x1 = 100;
        System.out.println("x : " + x1);

        increment();
        System.out.println("x : " + x1);

        System.out.println("==========");

        x = increment(x);
        System.out.println("x : " + x);

        System.out.println("====================");

        int y1 = increment1(x);	//

        System.out.println("x : " + x);		//
        System.out.println("y : " + y1);		//


    }

}


