package by.pavka.basic.loop;

import by.pavka.basic.util.BasicHelper;

/*
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа 
 * от 1 до введенного пользователем числа
 */
public class Task1 {

	public static void main(String[] args) {
		System.out.println(sumUpToN());

	}

	public static long sumUpToN() {

		int n = BasicHelper.readIntFromConsole("Enter a positive integer");

		long sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

}
