package sintaxe_variaveis_e_fluxo;

public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		System.out.println("O valor do segundo número é: " + segundo);
		
		primeiro = 10;
		System.out.println("O valor do segundo número é: " + segundo);
		
		String saudacao = "Olá, meu nome é ";
		String nome = "Rômulo ";
		String continuacao = "e minha idade é ";
		int idade = 100;
		System.out.println(saudacao+nome+continuacao+idade);
	}
}
