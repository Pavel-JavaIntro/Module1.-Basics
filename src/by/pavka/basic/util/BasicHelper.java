package by.pavka.basic.util;

import java.util.Scanner;

//The class contains a couple of useful static methods
public class BasicHelper {

	@SuppressWarnings("resource")
	public static int readIntFromConsole(String prompt) {
		System.out.println(prompt + " >>");

		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Wrong input...");
			System.out.println(prompt + " >>");
		}
		int number = sc.nextInt();
		return number;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");

		}
		System.out.println();
	}

	public static void printArray(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");

		}
		System.out.println();
	}
}
