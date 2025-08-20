import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("digite um número: ");
		double num1 = scan.nextDouble();
		if (num1 > 20) {
		System.out.println("número digitado maior que 20");
		} else if (num1 < 20) {
		System.out.println("número digitado menor que 20");
		} else {
		System.out.println("número digitado igual a 20");
		}
		System.out.println("digite um número inteiro maior que 1: ");
		int num2 = scan.nextInt();
		System.out.println("Contagem regressiva para explodir a bomba");
		while (num2 > 0) {
		System.out.println(num2);
		System.out.println("...");
		num2 = num2 - 1;
		}
		System.out.println("BOOOM");
		System.out.println("digite um número maior que 1: ");
		double num3 = scan.nextDouble();
		do {
		System.out.println("a soma do quadrado do numero digitado e 5 é");
		num3 = 5 + num3 * num3;
		System.out.println(num3);
		} while (num3 <= 1000);
		System.out.println("numero acima é maior que 1000");
		scan.close();
	}
}