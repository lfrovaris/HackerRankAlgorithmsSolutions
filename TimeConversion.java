import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] separate = line.split(":");
        scan.close();
        String hour = separate[0];
        String minuts = separate[1];
        String seconds = "" + separate[2].charAt(0) + separate[2].charAt(1);
        String time = "" + separate[2].charAt(2) + separate[2].charAt(3);
        if (hour.equals("12") && time.equals("AM")) {
            hour = "00";
        }
        if (time.equals("PM") && !hour.equals("12")) {
            hour = "" + (Integer.valueOf(hour) + 12);
        }
        System.out.println(String.valueOf(hour) + ":" + minuts + ":" + seconds);
    }
}
