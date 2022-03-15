import java.util.Scanner;

public class ApresentaNome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner teclado = new Scanner(System.in); String nome;
		 * System.out.println("Entre com o nome desejado:"); nome = teclado.next();
		 * System.out.println("O nome do usuário é "+nome);
		 */
		/*
		 * Scanner teclado = new Scanner(System.in); String nome;
		 * System.out.println("Entre com o nome desejado:");
		 * 
		 * String sobrenome;
		 *  System.out.println("Entre com o sobrenome desejado:");
		 *   nome = teclado.next(); System.out.println("O nome do usuário é "+nome);
		 */

		Scanner teclado = new Scanner(System.in);
		String nomeProduto;

		System.out.println("Entre com o nome do produto desejado:");
		nomeProduto = teclado.next();

		double valorProduto;
		System.out.println("Entre com o valor do produto desejado:");
		valorProduto = teclado.nextInt();

		double quantidadeProduto;
		System.out.println("Entre com a quantidade do produto desejado:");
		quantidadeProduto = teclado.nextInt();

		double Total;
		Total = valorProduto * quantidadeProduto;

		System.out.println("Produto= " + nomeProduto + " Cujo Valor Unitário= " + valorProduto + " Quantidade em Estoque= "
				+ quantidadeProduto + " Valor Total=  " + Total);

	}

}
