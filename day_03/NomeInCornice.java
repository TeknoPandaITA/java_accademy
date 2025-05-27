package day_03;
import java.util.Scanner;

public class NomeInCornice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("dimmi il tuo nome: ");
		String nome = input.nextLine();
		int lunghezza = nome.length();
		// System.out.println("lunghezza " + lunghezza);
		System.out.println("+"+"-".repeat(lunghezza)+"+");
		System.out.println("|"+ nome+"|");
		System.out.println("+"+"-".repeat(lunghezza)+"+");
		input.close();
	}

}
