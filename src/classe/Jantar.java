package classe;

public class Jantar {
  public static void main(String[] args) {
    Comida c1 = new Comida("Feijão", 0.200);
    Comida c2 = new Comida("Arroz", 0.300);

    double pesoComida = c1.pesoComida + c2.pesoComida;

    Pessoa p1 = new Pessoa("Danilo", 91.5);

    System.out.println("O peso antigo era: " + p1.peso);

    p1.comer(pesoComida);
  }
}
