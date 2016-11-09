import java.util.Scanner;

/*
 John's clothing store has a pile of n loose socks where each sock 'i' is labeled 
 with an integer, Ci, denoting its color. He wants to sell as many socks as possible, 
 but his customers will only buy them in matching pairs. Two socks, i and j, are 
 a single matching pair if Ci = Cj .
 
 Given n and the color of each sock, how many pairs of socks can John sell?
 
 **Input Format
 The first line contains an integer, n, denoting the number of socks. 
 The second line contains n space-separated integers describing the respective 
 values of C0, C1, C2, ..., Cn-1.
 
 **Constraints
 -> 1 <= n <= 100
 -> 1 <= Ci <= 100
 
 **Output Format
 Print the total number of matching pairs of socks that John can sell.
 
 **Sample Input
   9
   10 20 20 10 10 30 50 10 20
   
 **Sample Output
   3
   
 */

public class SockMerchant {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c[] = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}
		in.close();

		int match = 0;
		for (int i = 0; i < n - 1; i++) {
			if (c[i] != 0) {
				int j = i + 1;
				while (j < n) {
					if (c[i] == c[j]) {
						match++;
						c[i] = 0;
						c[j] = 0;
						break;
					}
					++j;
				}
			}
		}
		System.out.println(match);
	}

}
