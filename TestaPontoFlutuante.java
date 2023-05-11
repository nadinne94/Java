package sintaxe_variaveis_e_fluxo;

public class TestaPontoFlutuante {
	public static void main(String [] args) {
		double salario; //variável numérica tipo ponto flututante(decimal)
		salario = 1250.70;
		System.out.println("Meu salário é " + salario);// Resp.: 1250.7
		
		int valor = (int)salario; //casting -> conversão fracionado p/ inteiro
		System.out.println(valor);//Resp.: 1250
		
		// double também pode armazenar inteiro
		
		double divisao = 3.14 / 2;
		System.out.println("Metade do PI: " + divisao);//Resp.: 1.57
		
		int outraDivisao = 5/2; //compila mas dá o resultado errado
		System.out.println(outraDivisao);//Resp.: 2
		
		double novaTentativa = 5/2; // entende como nº inteiro; o certo seria (5.0/2.0)
		System.out.println(novaTentativa);//Resp.: 2.0
		
	}
}
