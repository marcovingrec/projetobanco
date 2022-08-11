package ProjetoBanco;

public class ContaCorrente extends CadastroGeral {
	ContaCorrente(){
	}
	
	ContaCorrente(String nome, int numero){
		settitular(nome);
		setconta(numero);
	}
	
	ContaCorrente(String nome, int numero, double depinicial, int senha){
		settitular(nome);
		setconta(numero);
		depositar(depinicial);
		setsenha(senha);
	}
	//
	void setsenha(int senha) {
	//	
		
	}

	void sacar (double valor) {
		if (this.getsaldo()> valor) {
			this.saldo = saldo - valor;
			System.out.println("Saque realizado com sucesso!");
			System.out.println("Saldo atual R$ "+saldo);
			
		}else {
			System.out.println("Saldo insuficiente para transacao");
			System.out.println("Saldo atual R$ "+saldo);
		}
	}

	@Override
	void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	void dados() {
		System.out.println("===========================");
		System.out.println("|      DADOS DA CONTA      |");
		System.out.println("|      Conta Corrente      |");
		System.out.println("|                          |");
		System.out.println("|Titular: "+ this.gettitular()+"|");
		System.out.println("|Conta: "+ this.getconta()+"|");
		System.out.println("|Saldo Disponivel R$ "+ this.saldo+"|");
		System.out.println("|                          |");
		System.out.println("===========================");
	}

	@Override
	void mostrarsaldo() {
		System.out.println("Saldo Disponivel R$ "+ this.getsaldo());
	}
	
	void aplicar (double valor, Poupanca destino) {
		if (this.getsaldo()>= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			System.out.println("Aplicacao realizada com sucesso!");
		}else {
			System.out.println("Saldo insuficiente para aplicacao!");
		}
	}
	
}
