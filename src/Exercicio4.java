import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/* 4 � Um rob� de combate s� deve ativar sua arma principal quando o inimigo est� a
menos de 70cm de dist�ncia. Fa�a um programa onde o usu�rio informe a dist�ncia do
inimigo e sejam exibidas as mensagens �ATIVADO� ou �DESATIVADO� dependendo do
status da arma. */

		Scanner leitor = new Scanner(System.in);
		int dist;
		
		System.out.print("Digite a dist�ncia: ");
		dist = leitor.nextInt();
		
		if(dist<70)
			System.out.println("ATIVADO");
		else
			System.out.println("DESATIVADO");
		
		leitor.close();
	}

}
