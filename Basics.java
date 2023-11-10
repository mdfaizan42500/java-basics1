import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
//        if(true) {
//            System.out.println("hello");
//        }
//        int a = 10;
//        if(a == 10) {
//            System.out.println("right");
//        }
//        int b = 1;
//        while (b != 5) {
//            System.out.println(b);
//            b++;
//        }
//        for(int c=0; c!=6; c++) {
//            System.out.println(c);
//        }

        // to convert celcius into farhehenhet

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter temp in C: ");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);
    }

}
