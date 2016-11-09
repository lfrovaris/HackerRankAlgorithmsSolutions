import java.util.Scanner;

/*
 You are given N sticks, where the length of each stick is a positive integer. 
 A cut operation is performed on the sticks such that all of them are reduced 
 by the length of the smallest stick.
 
 Suppose we have six sticks of the following lengths: 5 4 4 2 2 8
 
 Then, in one cut operation we make a cut of length 2 from each of the six sticks.
 For the next cut operation four sticks are left (of non-zero length), 
 whose lengths are the following: 3 2 2 6
 
 The above step is repeated until no sticks are left.
 Given the length of N sticks, print the number of sticks that are left 
 before each subsequent cut operations.
 
 **Note
 For each cut operation, you have to recalculate the length 
 of smallest sticks (excluding zero-length sticks).
 
 **Input Format
 The first line contains a single integer N.
 The next line contains N integers: a[0], a[1],...a[N-1] separated by space, where a[i] represents the length of the i^th stick.
 
 **Output Format 
 For each operation, print the number of sticks that are cut, on separate lines.
 
 **Constraints
 -> 1 <=   N  <= 1000
 -> 1 <= a[i] <= 1000

 **Sample Input 0
   6
   5 4 4 2 2 8

 **Sample Output 0
   6
   4
   2
   1
--------------------
 **Sample Input 1
   8
   1 2 3 4 3 3 2 1
  
 **Sample Output 1
   8
   6
   4
   1

 **Explanation

 **Sample Case 0 :

  sticks-length        length-of-cut   sticks-cut
  5 4 4 2 2 8             2               6
  3 2 2 _ _ 6             2               4
  1 _ _ _ _ 4             1               2
  _ _ _ _ _ 3             3               1
  _ _ _ _ _ _           DONE            DONE
  
 **Sample Case 1

  sticks-length         length-of-cut   sticks-cut
  1 2 3 4 3 3 2 1         1               8
  _ 1 2 3 2 2 1 _         1               6
  _ _ 1 2 1 1 _ _         1               4
  _ _ _ 1 _ _ _ _         1               1
  _ _ _ _ _ _ _ _       DONE            DONE
 
 */


public class CutTheSticks {
	
	private static void doPrint(int[] cut) {
		int i = 0;
		while (i < cut.length) {
			if (cut[i] != 0) {
				System.out.println(cut[i]);
			}
			++i;
		}
	}

	private static int setSmaller(int[] iSticks) {
		int smaller = 1001;
		int i = 0;
		while (i < iSticks.length) {
			if (iSticks[i] != 0 && iSticks[i] < smaller) {
				smaller = iSticks[i];
			}
			++i;
		}
		return smaller;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sticks = scan.nextInt();
		int[] aSticks = new int[sticks];
		for (int t = 0; t < sticks; t++) {
			aSticks[t] = scan.nextInt();
		}
		scan.close();

		int[] cut = new int[sticks];
		int i = 0;
		while (i < sticks) {
			int cont = 0;
			int smaller = setSmaller(aSticks);
			if (smaller != 0) {
				int j = 0;
				while (j < sticks) {
					if (aSticks[j] != 0) {
						aSticks[j] = aSticks[j] - smaller;
						++cont;
					}
					++j;
				}
				cut[i] = cont;
			}
			++i;
		}
		doPrint(cut);
	}
}
