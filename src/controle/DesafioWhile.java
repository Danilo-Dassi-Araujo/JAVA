package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int quantidadeDeAlunos = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Digite a nota dos alunos (ou -1 p/ sair): ");
			nota = sc.nextDouble();
			
			if(nota<=10 && nota >= 0) {
				total += nota;
				quantidadeDeAlunos++;
			}
		}
		double media = total / quantidadeDeAlunos;
		System.out.println("A nota média dos alunos foi: " + media);
		sc.close();
	}
}
