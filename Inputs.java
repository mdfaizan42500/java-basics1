import java.util.Scanner;

//Input
public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input some integer: ");
        int rollno = input.nextInt();
        System.out.println("your rollno. is :" + rollno);
  String name = input.next();
        System.out.println(name);
        String line = input.nextLine();
        System.out.println(line);
        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
