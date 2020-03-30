package by.pavka.basic.branching;

/*

Даны два угла треугольника (в градусах). 
Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным
*/

public class Task1 {

	public static void main(String[] args) {
		checkTriangle(89, 9);

	}

	public static boolean[] checkTriangle(int a, int b) {
		boolean[] checks = new boolean[2];

		if (a <= 0 || b <= 0 || (a + b) >= 180) {
			checks[0] = false;
			checks[1] = false;
			System.out.println("Such a triangle does not exist");

		} else {
			checks[0] = true;
			System.out.println("Such a triangle exists");

			if (a == 90 || b == 90 || (a + b) == 90) {
				checks[1] = true;
				System.out.println("And it is rectangle");
			} else {
				checks[1] = false;
				System.out.println("But it is not rectangle");
			}

		}
		return checks;
	}

}
