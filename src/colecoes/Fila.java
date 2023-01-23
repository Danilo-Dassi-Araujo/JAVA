package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue <String> fila = new LinkedList<>();
		
		
		//Offer e Add adionam elementosn fila
		//Diferença é o comportamento quando a fila está cheia
		//Add retorna uma exception caso a fila esteja cheia e o Offer retorna false e nenhum adiciona o elemento na fila
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		//Peek e element vao obter o proximo elemento da fila.(sem remover)
		//Diferença ocorre quando a fila está vazia
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());// retorna uma exceção
		System.out.println(fila.element());
	
		
		// Poll e remove -> obter proximo elemento da fila e remove!
		//Diferença ocorre quando a fila está vazia
		System.out.println(fila.poll()); //retorna null
		System.out.println(fila.remove()); // retorna exception
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
//		fila.isEmpty();
//		fila.size();
//		fila.clear();
//		fila.contains(...);
	}
}
