import java.util.Scanner;
// program for sum of two int
public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("sum =" + sum);
    }
}
