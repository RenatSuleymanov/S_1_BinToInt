
import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите двоичное число ");
        String str = in.nextLine();

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length;i++) {
            if (chars[i]!='0' & chars[i]!='1') {
                System.out.println("Введенное значение не является двоичным");
                System.exit(1);
            }
        }
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
