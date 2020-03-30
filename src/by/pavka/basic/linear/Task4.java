package by.pavka.basic.linear;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
//Поменять местами дробную и целую части числа и вывести полученное значение числа
public class Task4 {

	public static void main(String[] args) {
		System.out.println(convertRational(444.333));

	}

	public static double convertRational(double original) {

		return (int) ((original % 1) * 1000) + ((int) original) / 1000d;
	}

}
