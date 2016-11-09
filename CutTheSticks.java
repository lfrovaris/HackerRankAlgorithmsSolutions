import java.util.Scanner;

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
