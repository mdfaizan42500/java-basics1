public class TypeCasting {
    public static void main(String[] args) {
int num = (int)(53.25f);
        System.out.println(num);

        // automatic type promotion
        int a = 258;    // 258 % 256 = 2
        byte b = (byte) (a); // byte contain max 256 no.
        System.out.println(b);

        int number = 'A';
        System.out.println(number);
    }
}
