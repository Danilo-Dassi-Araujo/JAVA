package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//(°F - 32) x 5/9 = °C
		final double multiplicador = 5.0/9.0;
		final double diferenca = 32;
		double f = 86;
		double c = (f - diferenca) * multiplicador; ;
		System.out.print("O resultado é: " + c + "°C.");
		
		
	}
}
