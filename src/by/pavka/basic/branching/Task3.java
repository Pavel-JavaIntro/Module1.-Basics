package by.pavka.basic.branching;

import java.math.BigDecimal;

/*
*Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). 
*Определить, будут ли они расположены на одной прямой
*/

public class Task3 {

	public static void main(String[] args) {
		System.out.println(checkLine(0, 1, 2, 2, -3, -3));

	}

	// I guess primitive arguments can cause an issue of accuracy
	public static boolean checkLine(BigDecimal x1, BigDecimal y1, BigDecimal x2, BigDecimal y2, BigDecimal x3,
			BigDecimal y3) {
		return (x3.subtract(x1)).multiply((y2.subtract(y1))).equals((y3.subtract(y1).multiply(x2.subtract(x1))));
	}

	// Overloaded for primitives
	public static boolean checkLine(double x1, double y1, double x2, double y2, double x3, double y3) {
		return (x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1);

	}

}
