package sintaxe_variaveis_e_fluxo;

public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		//int idade = 16;
		//int quantidadePessoas = 1;
		//boolean acompanhado = true;
		//boolean acompanhado = quantidadePessoas >= 2;
		
		/*
		 * if (idade >= 18 || acompanhado) { System.out.println("Seja bem-vindo"); }
		 * else { System.out.println("Infelizmente você não pode entrar"); }
		 */
		
		int quantidadePessoas = 3;
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println(acompanhado);
	} 
}

