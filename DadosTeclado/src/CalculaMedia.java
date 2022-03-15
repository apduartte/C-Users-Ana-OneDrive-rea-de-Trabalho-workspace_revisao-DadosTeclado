import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		System.out.println("Digite o nome do Aluno: ");
		nome = teclado.next();
		
		
		double nota1;
		System.out.println("Digite com a nota1: ");
		nota1 = teclado.nextInt();
		
		double nota2;
		System.out.println("Digite com a nota2: ");
		nota2 = teclado.nextInt();
		
		double media;
		media=((nota1+nota2)/2);
		System.out.println("O valor da média:  "+media);
		
		

	}

}
