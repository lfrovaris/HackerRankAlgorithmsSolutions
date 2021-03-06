import java.util.Scanner;

/*
 Sam's house has an apple tree and an orange tree that yield an abundance of fruit. 
 In the diagram below, the red region denotes his house, where s is the start point and t 
 is the end point. The apple tree is to the left of his house, and the orange tree 
 is to its right. You can assume the trees are located on a single point, 
 where the apple tree is at point a and the orange tree is at point b.
 
 When a fruit falls from its tree, it lands d units of distance from its tree of origin 
 along the x-axis. A negative value of d means the fruit fell d units to the tree's left, 
 and a positive value of d means it falls d units to the tree's right.
 
 Given the value of d for m apples and n oranges, can you determine how many apples and 
 oranges will fall on Sam's house (i.e., in the inclusive range [s,t])? Print the number of
 apples that fall on Sam's house as your first line of output, then print the number of oranges that fall on Sam's house as your second line of output.
 
 **Input Format
 The first line contains two space-separated integers denoting the respective values of s and t. 
 The second line contains two space-separated integers denoting the respective values of a and b.
 The third line contains two space-separated integers denoting the respective values of m and n. 
 The fourth line contains m space-separated integers denoting the respective distances that each apple falls from point a.
 The fifth line contains n space-separated integers denoting the respective distances that each orange falls from point b.

 **Constraints
 -> 1 <= s,t,a,b,m,n <=10^5
 -> -10^5 <= d <= 10^5
 -> a < s < t < b
 
 **Output Format
 Print two lines of output:
 1. On the first line, print the number of apples that fall on Sam's house.
 2.On the second line, print the number of oranges that fall on Sam's house.

 **Sample Input 0
   7 11
   5 15
   3 2
   -2 2 1
   5 -6

 **Sample Output 0
   1
   1
   
 **Explanation 0
 The first apple falls at position 5 - 2 = 3. 
 The second apple falls at position 5 + 2 = 7. 
 The third apple falls at position 5 + 1 = 6. 
 The first orange falls at position 15 + 5 = 20. 
 The second orange falls at position 15 - 6 = 9. 
 Only one fruit (the second apple) falls within the region between 7 and 11, so we print 1 as our first line of output. 
 Only the second orange falls within the region between 7 and 11, so we print 1 as our second line of output.
 
 
 */

public class AppleAndOrange {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int lHouse = in.nextInt();
		int rHouse = in.nextInt();
		int aTree = in.nextInt();
		int oTree = in.nextInt();
		int amountApple = in.nextInt();
		int amountOrange = in.nextInt();
		int appleFallsInHouse = 0;
		int orangeFallsInHouse = 0;
		int[] apple = new int[amountApple];
		for (int apple_i = 0; apple_i < amountApple; apple_i++) {
			apple[apple_i] = in.nextInt();
		}
		int[] orange = new int[amountOrange];
		for (int orange_i = 0; orange_i < amountOrange; orange_i++) {
			orange[orange_i] = in.nextInt();
		}
		in.close();

		for (int i = 0; i < apple.length; i++) {
			int finalPosition = aTree + (apple[i]);
			if (finalPosition >= lHouse && finalPosition <= rHouse)
				appleFallsInHouse++;

		}

		for (int i = 0; i < orange.length; i++) {
			int finalPosition = oTree + (orange[i]);
			if (finalPosition >= lHouse && finalPosition <= rHouse)
				orangeFallsInHouse++;

		}

		System.out.println(appleFallsInHouse);
		System.out.println(orangeFallsInHouse);

	}

}
