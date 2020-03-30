package by.pavka.basic.loop;

/*
 * Вычислить значения функции на отрезке [а,b] c шагом h: 
 */
public class Task2 {

	public static void main(String[] args) {
		findValues(-2.0, 3.0, 1.0);

	}

	public static void findValues(double a, double b, double h) {
		double init = a;

		while (init <= b) {
			if (init > 2) {
				System.out.println(init);
			} else {
				System.out.println(-init);
			}

            init += h;
        }
    }


}
