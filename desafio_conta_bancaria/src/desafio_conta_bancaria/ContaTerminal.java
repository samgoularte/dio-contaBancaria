package desafio_conta_bancaria;

import java.util.Scanner;

public class ContaTerminal {

	private static int account = 0;
	private static double balance = 0.0;
	private static String agency = "";
	private static String clientName = "";

	private static String defaultMsg = "\n\n"
	+ "Bem-vindo(a)! %s \n"
	+ "Verifique os dados de sua nova conta: \n"
	+ "Agência: %s \n"
	+ "Conta: %d \n"
	+ "Saldo atual: %.2f \n\n"
	+ "Agradecemos pela preferência. \n";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe número da agência (ex: 100-1)");
		agency  = sc.next();

		System.out.println("Informe o número da conta (apenas numeros)");
		account = sc.nextInt();

		System.out.println("Informe seu nome");
		clientName = sc.next();
		sc.nextLine();

		System.out.println("Informe seu saldo a ser depositado (ex: 98,99)");
		balance = sc.nextDouble();

		System.out.printf(defaultMsg, clientName, agency, account, balance);

		sc.close();
	}

}
