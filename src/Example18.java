//================“Operator Precedence”=================//

public class Example18 {

    public static void main(String[] args) {

        int a = 100;
        int b = a + a++;	//
        System.out.println(a + " " + b);	//101 200

        System.out.println(12+4/2); //8 or 14
        System.out.println(12/6%4); //2

        System.out.println("==============");
        int c = 100;
        int d = c + (c = 10);	//

        System.out.println(c + " " + d);	//10 110

        System.out.println("==================");

        int e = 100;
        int f = ++e + (e = 10);
        System.out.println(e + " " + f);	//10 111

        System.out.println("==================");

        int g = 3, h = 2,i = 4;
        System.out.println(g + " " + h + " " + i);	//3 2 4

        if(g++ == 5 || h++ == 5 && i++ == 5){}
        System.out.println(g +" "+ h +" "+i);	//4 3 4

        System.out.println("================");

        System.out.println("Sorry :"+('1'));
        System.out.println("Sorry :"+('2'));
        System.out.println("Sorry :"+('3'));
        System.out.println("Sorry :"+('4'));
        System.out.println("Sorry :"+('5'));
        System.out.println("Sorry :"+('6'));
        System.out.println("Sorry :"+('7'));
        System.out.println("Sorry :"+('8'));
        System.out.println("Sorry :"+('9'));
        System.out.println("Sorry :"+("10"));


        System.out.println("======================");

        for (int s = 0; s < 100; s++) {
                System.out.println(s);

        }

    }
}

//out -put
//101 200
//14
//2
//==============
//10 110
//==================
//10 111
//==================
//3 2 4
//4 3 4
//================
//Sorry :1
//Sorry :2
//Sorry :3
//Sorry :4
//Sorry :5
//Sorry :6
//Sorry :7
//Sorry :8
//Sorry :9
//Sorry :10
//======================
//0
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
//11
//12
//13
//14
//15
//16
//17
//18
//19
//20
//21
//22
//23
//24
//25
//26
//27
//28
//29
//30
//31
//32
//33
//34
//35
//36
//37
//38
//39
//40
//41
//42
//43
//44
//45
//46
//47
//48
//49
//50
//51
//52
//53
//54
//55
//56
//57
//58
//59
//60
//61
//62
//63
//64
//65
//66
//67
//68
//69
//70
//71
//72
//73
//74
//75
//76
//77
//78
//79
//80
//81
//82
//83
//84
//85
//86
//87
//88
//89
//90
//91
//92
//93
//94
//95
//96
//97
//98
//99
//
