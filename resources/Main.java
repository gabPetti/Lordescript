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
	}
}