import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num1 = 20.2;
		double num2 = scan.nextDouble();
		if (num1 > 20) {
		System.out.println("é maior");
		} else if (num1 < 20) {
		System.out.println("é menor");
		} else if (num1 != 20) {
		System.out.println(num1);
		} else {
		System.out.println("num1 é 20 rapaziada");
		}
		System.out.println("whiles e do whiles");
		double num3 = 8;
		while (num3 < 10) {
		num3 = num3 + 1;
		System.out.println("tristeza");
		}
		double num4 = scan.nextDouble();
		do {
		System.out.println("o quadrado é");
		num4 = num4 * num4;
		System.out.println(num4);
		} while (num4 < 20);
		scan.close();
	}
}