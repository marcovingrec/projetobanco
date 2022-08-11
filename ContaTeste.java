package ProjetoBanco;

import java.util.Scanner;
import ProjetoBanco.ContaCorrente;
import ProjetoBanco.Poupanca;

public class ContaTeste {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		ContaCorrente cc = new ContaCorrente();
		Poupanca pp = new Poupanca();
		
		int opcao1, opcao2, conta, senha;
		double valor, depinicial;
		String nome;
		
		do {

		System.out.println("__________________________________________________________");
		System.out.println("|==================== FUCTURA BANK =======================|");
		System.out.println("|                                                         |");
		System.out.println("|                    MENU DE OPCOES                       |");
		System.out.println("|                                                         |");
		System.out.println("|               1 - Abertura de Conta                     |");
		System.out.println("|               2 - Consulta de Dados da Conta            |");
		System.out.println("|               3 - Depositos                             |");
		System.out.println("|               4 - Saque                                 |");
		System.out.println("|               5 - Aplicar recursos                      |");
		System.out.println("|               6 - Resgatar recursos                     |");
		System.out.println("|               7 - Consulta de Saldo                     |");
		System.out.println("|               8 - SAIR                                  |");
		System.out.println("|                                                         |");
		System.out.println("|_________________________________________________________|");
		
		
		System.out.println("");
		System.out.println("Digite a opcao desejada: ");
		opcao1 = input.nextInt();
		
		switch (opcao1) {
		//Abertura de conta
		case 1:
			System.out.println("Modulo Abertura de Conta");
			System.out.println("Digite o nome: ");
			nome = inputString.nextLine();
			cc.settitular(nome);
			pp.settitular(nome);
			System.out.println("Digite o numero para a conta: ");
			conta = input.nextInt();
			cc.setconta(conta);
			pp.setconta(conta);
			System.out.println("Conta cadastrada com sucesso!");
			System.out.println("Crie uma senha: ");
			senha = input.nextInt();
			cc.setsenha(senha);
			pp.setsenha(senha);	
			System.out.println("");
			System.out.println("Fazer deposito inicial? (1 - SIM 2 - NAO)");
			opcao2 = input.nextInt();
				if (opcao2 == 1) {
					System.out.println("Digite o valor a ser depositado: ");
					depinicial = input.nextDouble();
					cc.depositar(depinicial);
					System.out.println("Conta criada com sucesso e deposito inicial realizado!");
					System.out.println("Saldo inicial R$ "+ cc.saldo);
				}else {
					System.out.println("Conta criada com sucesso! Nao houve deposito inicial!");
					System.out.println("Saldo inicial R$ "+ cc.saldo);	
				}
				break;
		
		//Consulta de Dados da Conta		
		case 2:
			System.out.println("Modulo Consulta de Dados da Conta");
			cc.dados();
			pp.dados();
			break;
			
		//Depositos
		case 3:
			System.out.println("Modulo de Depositos");
			System.out.println("Digite o valor a ser depositado:");
			valor = input.nextDouble();
			cc.depositar(valor);
			System.out.println("Deposito realizado com sucesso!");
			System.out.println("Saldo atual R$ "+ cc.saldo);
			break;
			
		//Saque
		case 4:
			System.out.println("Modulo Saque");
			System.out.println("Digite o valor que deseja sacar: ");
			valor = input.nextDouble();
			cc.sacar(valor);
			break;
			
		//Aplicacao Recursos
		case 5:
			System.out.println("Modulo Aplicacao de Recursos");
			System.out.println("Digite o valor a ser aplicado: ");
			valor = input.nextDouble();
			cc.aplicar(valor, pp);
			break;
			
		//Resgate Recursos
		case 6:
			System.out.println("Modulo Resgate de Recursos");
			System.out.println("Digite o valor a ser resgatado: ");
			valor = input.nextDouble();
			pp.resgatar(valor, cc);
			break;
		//Consulta Saldo
		case 7:
			System.out.println("Modulo Consulta de Saldo");
			System.out.println("Saldo em Conta Corrente R$ "+cc.saldo);
			System.out.println("Saldo em Poupanca R$ "+pp.saldo);
			break;
		case 8:
			System.out.println("Aplicacao Encerrada");
			System.out.println("Obrigado por usar o Fuctura Bank");
			break;
		}
		}while (opcao1 != 8);
			
		
		input.close();
		inputString.close();
		}
	}

		
		

			
			
			
		
		
	


		
	
	

	



