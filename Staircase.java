import java.util.Scanner;

public class Staircase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        scan.close();
        String form = "%" + size + "s";
        int i = 1;
        while (i < size + 1) {
            String print = "";
            int j = 0;
            while (j < i) {
                print = String.valueOf(print) + "#";
                ++j;
            }
            print = String.format(form, print);
            System.out.println(print);
            ++i;
        }
	}
}
