package sintaxe_variaveis_e_fluxo;

public class TesteIR {
	public static void main(String[] args) {

		double salario = 2700.0;
		
		if (salario > 1900 && salario < 2800) {
			System.out.println("O IR é de 7.5%");
			System.out.println("Dedução de R$ 142,00");
		}
		if (salario > 2800.01 && salario < 3751.0) {
				System.out.println("O IR é de 15%");
				System.out.println("Dedução de R$ 350,00");	
		}
		if (salario > 3751.01 && salario < 4664.0) {
			System.out.println("O IR é de 22.5%");
			System.out.println("Dedução de R$ 636,00");	
		}
	}
}
