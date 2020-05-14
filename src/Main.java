
import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите двоичное число ");
        String str = in.nextLine();

        char[] chars = str.toCharArray();
        int result = 0;
        int mult = 1;
        for (int i = str.length()-1; i >= 0; i--) {
            if (chars[i]=='1') {
                result += mult;
            }
            mult*=2;
        }
        System.out.println("\"" + str + "\" -> " + result);
    }
}