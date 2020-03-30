package by.pavka.basic.linear;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task2 {

	/*
	 * Вычислить значение выражения по формуле (все переменные принимают
	 * действительные значения):
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(secondSimpleFunction(1, 2, 3.0));

	}

	public static double secondSimpleFunction(double a, double b, double c) {
		return (b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a) - c * pow(a, 3) + pow(b, -2);
	}

}
