import java.util.Scanner;

/*
 John Watson performs an operation called a right circular rotation on an 
 array of integers, [a[0], a[1], ..., a[n-1]]. 
 After performing one right circular rotation operation, the array is transformed 
 from [a[0], a[1], ..., a[n-1]] to [a[n-1], a[0], ..., a[n-2]] .

 Watson performs this operation k times. To test Sherlock's ability to identify 
 the current element at a particular position in the rotated array, 
 Watson asks q queries, where each query consists of a single integer, m, 
 for which you must print the element at index m in the rotated array (i.e., the value of a[m]).

 **Input Format
 The first line contains 3 space-separated integers, n, k, and q, respectively. 
 The second line contains n space-separated integers, where each integer i describes array 
 element a[i] (where 0 <= i <= n). 
 Each of the q subsequent lines contains a single integer denoting m.

 **Constraints
 -> 1 <= n 10^5
 -> 1 <= a[i] 10^5
 -> 1 <= k 10^5
 -> 1 <= q 500
 -> 1 <= m N-1
 
 **Output Format
 For each query, print the value of the element at index m of the rotated array on a new line.
 
 **Sample Input
   3 2 3
   1 2 3
   0
   1
   2
   
 **Sample Output
   2
   3
   1
  
 **Explanation
 After the first rotation, the array becomes [3,1,2]. 
 After the second (and final) rotation, the array becomes [2,3,1].
 
 Let's refer to the array's final state as array b. For each query, we just have to print the value of b[m] on a new line:
 1. m = 0, so we print 2 on a new line.
 2. m = 1, so we print 3 on a new line.
 3. m = 2, so we print 1 on a new line.
 
 */

public class CircularArrayRotation {

	private static int[] leftRotationXTimes(int[] v, int times) {
		for (int i = 0; i < times; i++)
			v = leftRotation(v);

		return v;
	}

	private static int[] leftRotation(int[] v) {
		int n = v.length;
		int aux = v[0];
		for (int i = 0; i < n - 1; i++) {
			v[i] = v[i + 1];
		}
		v[n - 1] = aux;
		return v;
	}

	private static int[] rightRotationXTimes(int[] v, int times) {
		for (int i = 0; i < times; i++)
			v = rightRotation(v);
		return v;
	}

	private static int[] rightRotation(int[] v) {
		int n = v.length;
		int aux = v[n - 1];
		for (int i = n - 1; i > 0; i--)
			v[i] = v[i - 1];
		v[0] = aux;
		return v;
	}

	private static void print(int[] a, int[] m) {
		int times = m.length;
		for (int i = 0; i < times; i++)
			System.out.println(a[m[i]]);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();
		int[] numbers = new int[n];
		int[] m = new int[q];

		for (int i = 0; i < n; i++) {
			numbers[i] = in.nextInt();
		}
		for (int p = 0; p < q; p++) {
			m[p] = in.nextInt();
		}
		in.close();
		if (n == k)
			print(numbers, m);
		else if (k > n) {
			rightRotationXTimes(numbers, k - n);
			print(numbers, m);
		} else if (k > n / 2) {
			leftRotationXTimes(numbers, n - k);
			print(numbers, m);
		} else {
			rightRotationXTimes(numbers, k);
			print(numbers, m);
		}
	}
}
