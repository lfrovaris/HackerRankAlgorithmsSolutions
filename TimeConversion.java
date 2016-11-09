import java.util.Scanner;

/*
 
 Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 
 **Note
 Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
 Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
 
 **Input Format
 A single string containing a time in 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM),
 where 01 <= hh <= 12 and 00 <= mm,ss <= 59.
 
 **Output Format
 Convert and print the given time in 24-hour format, where 00 <= hh <= 23.
 
 **Sample Input
   07:05:45PM
   
 **Sample Output
   19:05:45
 
 */

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
