//=============random===================

import java.util.Random;

public class Example20 {
    public static void main(String[] args) {


    Random r = new Random();

    int evenCount = 0;
    int oddCount = 0;

		for(
    int i = 0;
    i< 200;i++)

    {
        int rand = r.nextInt(101);

        if (rand % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }

        System.out.println("Random: " + rand);
    }
		System.out.println("Even Count: "+evenCount);
		System.out.println("Odd Count: "+oddCount);

        System.out.println("==================");

        for (int i = 0; i < 200; i++) {
            int rand = r.nextInt(101);
            System.out.println("Random Number: " + rand);
        }

        System.out.println("=======================");
        int rand = r.nextInt(11);	//5

        int fact = 1;
        for (int i = 1; i <= rand; i++) {
            fact *= i;	// fact = fact * i;
        }
        System.out.println(fact);



    }
}

