package sintaxe_variaveis_e_fluxo;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		int idade = 20;
		int quantidadePessoas = 3;
		
		if (idade >= 18) { // se dentro do if só tiver uma linha não precisa de chaves
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem-vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Acompanhado, você pode entrar");
			} else {
				System.out.println("Infelizmente você não pode entrar");
			}	
		} 
	}
}
