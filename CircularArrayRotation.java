import java.util.Scanner;

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
