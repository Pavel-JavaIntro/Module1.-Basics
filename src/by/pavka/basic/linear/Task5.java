package by.pavka.basic.linear;

import static java.lang.Math.abs;

/*
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
 * Вывести данное значение длительности в часах, минутах и секундах 
 * в следующей форме: ННч ММмин SSc. 
 */
public class Task5 {

	public static void main(String[] args) {
		System.out.println(convertSeconds(-3600));

	}

	public static String convertSeconds(int sec) {
		String sign = sec < 0 ? "-" : "";
		sec = abs(sec);
		int hours = sec / 3600;
		int rest = sec % 3600;
		int minutes = rest / 60;
		int seconds = rest % 60;

		return String.format("%s%dч %dмин %dсек", sign, hours, minutes, seconds);

	}

}
