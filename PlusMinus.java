import java.util.Scanner;

/*
 
 Given an array of integers, calculate which fraction of its elements are positive, 
 which fraction of its elements are negative, and which fraction of its elements are zeroes,
 respectively. Print the decimal value of each fraction on a new line.

 **Note: This challenge introduces precision problems. 
 The test cases are scaled to six decimal places, though answers with absolute 
 error of up to 10^-4 are acceptable.
 
 **Input Format
 The first line contains an integer, N , denoting the size of the array. 
 The second line contains N space-separated integers describing an 
 array of numbers (a[0], a[1], a[2], ..., a[n-1]) .

 **Output Format
 You must print the following 3 lines:
 
 1. A decimal representing of the fraction of positive numbers in the array.
 2. A decimal representing of the fraction of negative numbers in the array.
 3. A decimal representing of the fraction of zeroes in the array
 
 **Sample Input
  6
  -4 3 -9 0 4 1         

 **Sample Output
  0.500000
  0.333333
  0.166667
  
 **Explanation
 There are 3 positive numbers, 2 negative numbers, and 1 zero in the array. 
 The respective fractions of positive numbers, negative numbers and zeroes are
 3/6 = 0.500000
 2/6 = 0.333333
 1/6 = 0.166667
 respectively.
 
 */
public class PlusMinus {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.valueOf(scan.nextLine());
        String numbers = scan.nextLine();
        String[] aNumbers = numbers.split(" ");
        scan.close();
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        int i = 0;
        while (i < count) {
            int verify = Integer.valueOf(aNumbers[i]);
            if (verify > 0) {
                ++positive;
            } else if (verify < 0) {
                ++negative;
            } else {
                ++zeros;
            }
            ++i;
        }
        double result = (double)positive / (double)count;
        System.out.printf("%.6f \n", result);
        result = (double)negative / (double)count;
        System.out.printf("%.6f \n", result);
        result = (double)zeros / (double)count;
        System.out.printf("%.6f \n", result);
    }
}
