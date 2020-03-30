package by.pavka.basic.branching;

/*
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
 * Определить, пройдет ли кирпич через отверстие 
 */
public class Task4 {

	public static void main(String[] args) {
		System.out.println(checkBrick(4, 4, 3, 6, 4));

	}

	// I hope the task doesn't require trigonometric calculations
	public static boolean checkBrick(double len, double wid, double x, double y, double z) {
		// exclude the longest dimension of the brick
		double l, w;
		if (x >= y && x >= z) {
			l = y;
			w = z;
		} else if (y >= x && y >= z) {
			l = x;
			w = z;
		} else {
			l = x;
			w = y;
		}

		if (w > l) {
			double temp = l;
			l = w;
			w = temp;
		}
		if (wid > len) {
			double temp = len;
			len = wid;
			wid = temp;
		}

		if (w <= wid && l <= len)
			return true;

		return false;
	}
}
