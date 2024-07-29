package estudos;

public class exemplos3 {
	public static void main(String[] args) {
		//Informar todos os números de 1000 a 1999 que
		//quando divididos por 11 obtemos resto = 5.
		for(int i=999;i<=1999;i++) {
			if(i % 11 == 5) {
				System.out.println(i + " esse numero tem resto 5");
			}
		}
	}
}
