package by.pavka.basic.loop;

/*
 * Найти сумму квадратов первых ста чисел. 
 */
public class Task3 {

	public static void main(String[] args) {
		System.out.println(sumOfSquares());

	}

	public static int sumOfSquares() {
		int sumOfSquares = 0;
		for (int i = 1; i <= 100; i++) {
			sumOfSquares += i * i;
		}
		return sumOfSquares;
	}

}
