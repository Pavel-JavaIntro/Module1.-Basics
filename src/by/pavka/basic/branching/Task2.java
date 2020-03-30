package by.pavka.basic.branching;

//Найти max{min(a, b), min(c, d)}. 

public class Task2 {

	public static void main(String[] args) {
		System.out.println(findMaximin(4.4, 5, 1, 0));

	}

	public static double findMaximin(double a, double b, double c, double d) {
		double firstMin = (a < b) ? a : b;
		double secondMin = (c < d) ? c : d;
		double max = (firstMin > secondMin) ? firstMin : secondMin;
		return max;
	}

}
