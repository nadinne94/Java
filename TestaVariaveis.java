package sintaxe_variaveis_e_fluxo;

public class TestaVariaveis {
	public static void main(String[] args) {
		System.out.println("Olá novo teste");
		
		int idade; // variável númerica tipo inteiro
		idade = 29;
		
		System.out.println(idade);
		
		idade = 20 + 10;
		System.out.println(idade);
		
		idade = (2*10) + 9;
		System.out.println(idade);
		
		System.out.println("A minha idade é "+ idade + " anos");
	}
}
