package fundamentos;

import java.util.Scanner;


public class ConversaoStringNumero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salário: ");
		String valor1 = sc.nextLine().replace(",", ".");
		System.out.println("Digite o segundo salário: ");
		String valor2 = sc.nextLine().replace(",", ".");
		System.out.println("Digite o terceiro salário: ");
		String valor3 = sc.nextLine().replace(",", ".");
		
		double sal1 = Double.parseDouble(valor1);
		double sal2 = Double.parseDouble(valor2);
		double sal3 = Double.parseDouble(valor3);
		
		double somaSal = sal1 + sal2 + sal3;
		
		System.out.println("A média dos salários é: " + somaSal / 3);
		
		sc.close();
	}
}
