package by.pavka.basic.loop;

/*
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. 
 * Общий член ряда имеет вид:   1 / Math.pow(2, n) + 1 / Math.pow(3, n);
 */
public class Task5 {

	public static void main(String[] args) {
		System.out.println(sumSequence(0.1));

	}

	public static double sumSequence(double minElement) {
		int n = 0;
		double sum = 0;
		double element = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
		while (element >= minElement) {
			sum += element;
			n++;
			element = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
		}
		return sum;
	}

}
