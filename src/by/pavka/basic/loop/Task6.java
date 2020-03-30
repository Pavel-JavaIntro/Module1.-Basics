package by.pavka.basic.loop;

/*
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
 */
public class Task6 {

	public static void main(String[] args) {
		printCharacterNumbers();

	}

	public static void printCharacterNumbers() {
		for (int i = 0; i < 256; i++) {
			System.out.println("For int = " + i + " character is " + (char) i);
		}
	}

}
