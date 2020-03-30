package by.pavka.basic.loop;

import java.math.BigInteger;

/*
 * Составить программу нахождения произведения квадратов первых двухсот чисел
 */
public class Task4 {

	public static void main(String[] args) {
		System.out.println(productOfSquares());
		System.out.println(bigProduct());

	}

	// Working calculation but with BigInteger
	public static BigInteger productOfSquares() {
		BigInteger productOfSquares = new BigInteger("1");
		for (int i = 1; i <= 200; i++) {
			productOfSquares = productOfSquares.multiply(BigInteger.valueOf(i * i));
		}
		return productOfSquares;
	}

	public static long bigProduct() {
		long seed = 1;
		for (int i = 1; i <= 200; i++) {
			long prod = seed * i * i;

			if (prod < seed) {
				System.out.println("Too big on step " + i);
				return -1;
			} else {
				seed = prod;
			}
		}
		return seed;
	}

}
