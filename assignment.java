import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
//        Write a program to print whether a number is even or odd, also take input from the user.
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input a no. :");
//        int num = input.nextInt();
//        if (num % 2 == 0) {
//            System.out.println("given no. is even");
//        }
//       else {
//            System.out.println("given no. is odd");
//        }


//        Take name as input and print a greeting message for that particular name.

//        Scanner input = new Scanner(System.in);
//        System.out.print("Type your name :");
//        String name = input.nextLine();
//        System.out.println("Hello " + name);


//        Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

//        Scanner input = new Scanner(System.in);
//        System.out.print("enter principal value : ");
//        int princpal = input.nextInt();
//        System.out.print("enter time : ");
//        int time = input.nextInt();
//        System.out.print("enter rate : ");
//        float rate = input.nextFloat();
//        float SimpleInterest = (princpal*time*rate)/100;
//        System.out.println("Simple Interest is : " + SimpleInterest);

//        Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

//        Scanner input=new Scanner(System.in);
//        System.out.print("enter first no.:");
//        int num1 = input.nextInt();
//        System.out.print("enter second no.:");
//        int num2 = input.nextInt();
//        System.out.print("enter operator :");
//        char operator = input.next().charAt(0);
//
//        if (operator == '+') {
//            System.out.println("sum of " + num1 + " and " + num2 + " is :" + (num1+ num2));
//        } else if (operator == '-') {
//            System.out.println("difference of " + num1 + " and " + num2 + " is :" + (num1 - num2));
//        } else if (operator == '*') {
//            System.out.println("product of " + num1 + " and " + num2 + " is :" + (num1 * num2));
//        } else if (operator == '/') {
//            System.out.println("division of " + num1 + " and " + num2 + " is :" + (num1 / num2));
//        } else {
//            System.out.println("not an operator");
//        }

//        Take 2 numbers as input and print the largest number.

//        Scanner input=new Scanner(System.in);
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        if (num1>num2) {
//            System.out.println(num1);
//        } else if (num1 == num2) {
//            System.out.println("both are equal");
//        } else {
//            System.out.println(num2);
//        }

//        Input currency in rupees and output in USD.

//        Scanner input=new Scanner(System.in);
//        System.out.print("enter currency in rupees to convert it into dollar");
//        int rupees = input.nextInt();
//        float currency = rupees * 83.29f;
//        System.out.println(rupees + " rupees in dollar is : " + currency);

//        To calculate Fibonacci Series up to n numbers.

//        in this we have to print 0 and 1 then we start loop in which an empty variable will store value of
//        variable of 0 and 1 then print empty variable
//        and in back of empty store empty and in back of back store empty's back

        Scanner input=new Scanner(System.in);
        System.out.print("enter the value upto which you want the series : ");
        int value = input.nextInt();
        int a=0 , b=1 , i , stored;
        System.out.print(a + " " + b + " ");
        for (i=0; i <= value; i++ ) {
            stored = a + b;
            System.out.print(stored + " ");
            a = b;
            b = stored;
        }
    }

}
