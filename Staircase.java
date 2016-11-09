import java.util.Scanner;

/*

Consider a staircase of size n = 4:
   #
  ##
 ###
####

Observe that its base and height are both equal to n, 
and the image is drawn using # symbols and spaces. 
The last line is not preceded by any spaces.

Write a program that prints a staircase of size n.

**Input Format

	A single integer, n, denoting the size of the staircase.

**Output Format

	Print a staircase of size n using # symbols and spaces.

**Note: The last line must have  spaces in it.

-> Sample Input
	6 

-> Sample Output
     #
    ##
   ###
  ####
 #####
######

**Explanation

The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n = 6 .

*/
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
