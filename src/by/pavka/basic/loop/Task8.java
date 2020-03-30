package by.pavka.basic.loop;

/*
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
 */
public class Task8 {

	public static void main(String[] args) {
		findCommonFigures(1234, 545542);

	}

	// This method gets two integers and returns common figures of them
	public static void findCommonFigures(int a, int b) {
		int[] first = convertIntoArray(a);
		int[] second = convertIntoArray(b);
		for (int i : first) {
			for (int j : second) {
				if (i == j)
					System.out.println("common figure is " + i);
			}
		}
	}

	// This auxiliary method converts integer into array of figures
	private static int[] convertIntoArray(int number) {
		int digits = 1;
		int n = number;
		while (n / 10 > 0) {
			digits++;
			n = n / 10;

		}

		int[] preresult = new int[digits];
		int count = 0;
		do {
			preresult[count] = number % 10;
			count++;
			number = number / 10;
		} while (number > 0);

		if (digits == 1)
			return preresult;
		int repeats = 0;
		for (int i = 0; i < digits - 1; i++) {
			for (int j = i + 1; j < digits; j++) {
				if (preresult[i] == preresult[j]) {
					repeats++;
					break;
				}
			}
		}

		int resultSize = digits - repeats;
		int[] result = new int[resultSize];
		result[0] = preresult[0];
		int k = 1;
		for (int l = 1; l < digits; l++) {
			if (!checkRepeats(preresult[l], preresult, l)) {
				result[k] = preresult[l];
				k++;
			}
		}
		return result;
	}

	// This auxiliary method checks if a sub-array (up to index) contains the given
	// integer
	private static boolean checkRepeats(int number, int[] array, int index) {
		for (int i = 0; i < index; i++) {
			if (number == array[i])
				return true;
		}
		return false;
	}

}
