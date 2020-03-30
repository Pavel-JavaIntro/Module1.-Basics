package by.pavka.basic.linear;

/*
 * Найдите значение функции:  z = ( (a � 3 ) * b / 2) + c. 
 */
public class Task1 {

	public static void main(String[] args) {
		System.out.println(firstSimpleFunction(4, 4.4, 4));

	}

	public static double firstSimpleFunction(double a, double b, double c) {
		return (a - 3) * b / 2 + c;
	}

}
