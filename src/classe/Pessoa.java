package classe;

public class Pessoa {
  String nome;
  double peso;

  Pessoa(){

  }

  Pessoa(String nome, double peso){
    this.nome = nome;
    this.peso = peso;
  }

  public void comer(double pesoComida){
    this.peso = peso + pesoComida;
    System.out.println("O peso atual é: " + this.peso);
  }
}
