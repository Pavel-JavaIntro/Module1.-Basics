package by.pavka.basic.branching;

/*
 * Вычислить значение функции:  
 */
public class Task5 {

	public static void main(String[] args) {
		System.out.println(calculateFunction(3.0));

	}

	public static double calculateFunction(double x) {
		if (x <= 3) {
			return x * x - 3 * x + 9;
		} else
			return 1 / (Math.pow(x, 3) + 6);
	}

}
