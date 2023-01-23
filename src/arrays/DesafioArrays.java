package arrays;

import java.util.Scanner;

public class DesafioArrays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite quantas notas você deseja passar: ");
    int quantidadeNotas = sc.nextInt();

    double[] notas = new double[quantidadeNotas];

    for (int i = 0; i < notas.length; i++) {
      System.out.print("Digite a nota " + (i + 1) + ": ");
      notas[i] = sc.nextDouble();
    }

    double total = 0;
    for (double nota : notas) {
      total += nota;
    }
    double media = total / notas.length;

    System.out.println("A média é: " + media + "!");


    sc.close();
  }
}
