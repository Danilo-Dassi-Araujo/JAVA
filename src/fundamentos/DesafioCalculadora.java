package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		double primeroValor = sc.nextDouble();
		sc.nextLine();	
		System.out.println("Digite o segundo valor: ");
		double segundoValor = sc.nextDouble();
		
		sc.nextLine();		
		System.out.println("Informe a operação: ");
		String op = sc.next();
		
		double resultado = "+".equals(op) ? primeroValor + segundoValor : 0;
		resultado = "-".equals(op) ? primeroValor - segundoValor : resultado;
		resultado = "*".equals(op) ? primeroValor * segundoValor : resultado;
		resultado = "/".equals(op) ? primeroValor / segundoValor : resultado;
		resultado = "%".equals(op) ? primeroValor % segundoValor : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", primeroValor, op, segundoValor, resultado);
		
		sc.close();
	}
}
