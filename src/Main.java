import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o nome do cliente: ");
		String nomeCliente = scanner.nextLine();

		Cliente cliente = new Cliente();
		cliente.setNome(nomeCliente);

		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		System.out.println("Menu:");
		System.out.println("1. Depositar");
		System.out.println("2. Sacar");
		System.out.println("3. Transferir");
		System.out.println("4. Imprimir Extrato");
		System.out.print("Digite a opção: ");
		int opcao = scanner.nextInt();

		switch (opcao) {
			case 1:
				System.out.print("Digite o valor do depósito: ");
				double valorDeposito = scanner.nextDouble();
				cc.depositar(valorDeposito);
				cc.imprimirExtrato();
				break;
			case 2:
				System.out.print("Digite o valor do saque: ");
				double valorSaque = scanner.nextDouble();
				cc.sacar(valorSaque);
				cc.imprimirExtrato();
				break;
			case 3:
				System.out.print("Digite o valor da transferência: ");
				double valorTransferencia = scanner.nextDouble();
				cc.transferir(valorTransferencia, poupanca);
				cc.imprimirExtrato();
				poupanca.imprimirExtrato();
				break;
			case 4:
				cc.imprimirExtrato();
				poupanca.imprimirExtrato();
				break;
			default:
				System.out.println("Opção inválida.");
		}
	}

}