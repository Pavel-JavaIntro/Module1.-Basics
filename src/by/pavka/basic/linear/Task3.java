package by.pavka.basic.linear;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;

/*
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения): 
 */
public class Task3 {

	public static void main(String[] args) {
		System.out.println(thirdSimpleFunction(0, 0));

	}

	public static double thirdSimpleFunction(double x, double y) {
		return (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);
	}

}
