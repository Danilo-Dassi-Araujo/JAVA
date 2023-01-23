package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 7.6;
		String resultadoFinal = media >= 7 ? 
				"aprovado" : "de recuperação";
		
		System.out.println("O aluno está " + resultadoFinal);
	}
}
