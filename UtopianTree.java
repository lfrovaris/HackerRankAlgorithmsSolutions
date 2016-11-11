import java.util.Scanner;

/*
 The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in 
 height. Each summer, its height increases by 1 meter.
 Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. 
 How tall will her tree be after N growth cycles?

 **Input Format

 The first line contains an integer, T, the number of test cases. 
 T subsequent lines each contain an integer, N, denoting the number of cycles 
 for that test case.

 **Constraints
 -> 1 <= T <= 10
 -> 0 <= N <= 60
 
 **Output Format
 For each test case, print the height of the Utopian Tree after N cycles. Each height must 
 be printed on a new line.
 
 **Sample Input
   3
   0
   1
   4
   
 **Sample Output
   1
   2
   7

 **Explanation
 There are 3 test cases.
 
 1. In the first case (N = 0), the initial height (H = 1) of the tree remains unchanged.
 2. In the second case (N = 1), the tree doubles in height and is 2 meters tall after the spring cycle.
 3. In the third case (N = 4), the tree doubles its height in spring (H = 2), then grows 
 a meter in summer (H = 3), then doubles after the next spring (H = 6), and grows 
 another meter after summer (H = 7). Thus, at the end of 4 cycles, its height is 7 meters.
 
 */

public class UtopianTree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int test = scan.nextInt();
		int[] cases = new int[test];
		for (int i = 0; i < test; i++) {
			cases[i] = scan.nextInt();
		}
		scan.close();
		
		for (int x = 0; x < test; x++) {
			int height = 1;
			if (cases[x] > 0) {
				for (int l = 0; l < cases[x]; l++) {
					height = height * 2;
					l++;
					if (l < cases[x])
						height++;
				}
			}
			System.out.println(height);
		}
	}

}
