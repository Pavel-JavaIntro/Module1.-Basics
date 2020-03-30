package by.pavka.basic.loop;

import by.pavka.basic.util.BasicHelper;

/*
 * Для каждого натурального числа в промежутке от m до n вывести все делители, 
 * кроме единицы и самого числа. m и n вводятся с клавиатуры
 */
public class Task7 {

	public static void main(String[] args) {
		printDividers();

	}

	public static void printDividers() {

		int start = BasicHelper.readIntFromConsole("Enter a start integer");

		int end = BasicHelper.readIntFromConsole("Enter another, bigger integer");

		if (start < 0 || end < 0 || start > end) {
			System.out.println("Wrong arguments");
			return;
		}
		for (int i = start; i <= end; i++) {
			System.out.print("Dividers of " + i + ": ");
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0)
					System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
