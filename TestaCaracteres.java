package sintaxe_variaveis_e_fluxo;

public class TestaCaracteres {
	public static void main(String[] args) {
		char letra = 'a'; //aspas simples e único caractere
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		
		valor = (char)(valor +1);
		System.out.println(valor);
		
		String palavra = "Alura Cursos Online de Tecnologia";
		System.out.println(palavra);
		
		palavra = palavra + " - " + 2020;
		System.out.println(palavra);
		
		String parcela1 = "10";
		String parcela2 = "20";
		System.out.println(parcela1 + parcela2);
	}
}
