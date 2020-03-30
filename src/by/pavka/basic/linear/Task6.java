package by.pavka.basic.linear;

/*
 * Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, 
 * и false — в противном случае
 */
public class Task6 {

	public static void main(String[] args) {
		System.out.println(checkBelong(0, 1));

	}

	public static boolean checkBelong(double x, double y) {
		return (y >= 0 && y <= 4 && x >= -2 && x <= 2) || (y >= -3 && y <= 0 && x >= -4 && x <= 4);
	}

}
