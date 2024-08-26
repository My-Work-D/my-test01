
//============	“Variable Scope and lifetime”==============//
public class Example05 {
    public static void main(String[] args) {
        System.out.print("Hello Good night!!!");

        //code block
        {
            System.out.println("Sachini !!! ");
        }

//        int x = 100;
//        System.out.println(x);	//1 //?-100
//
//        {
//            int y = 200;
//            System.out.println(x);	//2 //?-100
//            System.out.println(y);	//3 //?- 200
//        }

   //     System.out.println(x);	//4 //?-100
      //  System.out.println(y);	//can't access

        int x = 100;
        System.out.println(x);	//1 //?100

        {
            int y = 200;
            System.out.println(x);	//2 //?100
            System.out.println(y);	//3 //?200

            //int x = 10; // ? //can't access
            //int y = 30; // ? //can't access
        }

       // int x = 10; // Illegal
        int y = 20; // Legal

        System.out.println(x);	//4 //?100
        System.out.println(y);	//5 //?20

    }
    //x = 10	//can't access

}



//out-put
//Hello Good night!!!Sachini !!!
//100
//100
//200
//100
//100
//100
//200
//100
//20