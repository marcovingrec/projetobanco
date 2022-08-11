package ProjetoBanco;

public class Poupanca extends CadastroGeral{
		
	   Poupanca(){
	   }

	   Poupanca(String nome, int numero, int senha){
		   settitular(nome);
		   setconta(numero);
		   setsenha(senha);
	   }
	   //
	   void setsenha(int senha) {
		
	//
	}

	void resgatar (double valor, ContaCorrente destino) {
		   if (this.getsaldo()> valor) {
				this.saldo = saldo - valor;
				destino.depositar(valor);
				System.out.println("Valor resgatado com sucesso!");
				System.out.println("Saldo atual R$ "+this.saldo);
			
			}else {
				System.out.println("Saldo insuficiente para transacao");
				System.out.println("Saldo atual R$ "+this.saldo);
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
		System.out.println("|         Poupanca         |");
		System.out.println("|                          |");
		System.out.println("|Titular: "+ this.gettitular()+"|");
		System.out.println("|Conta: "+ this.getconta()+"-1"+"|");
		System.out.println("|Saldo Aplicado R$ "+ this.saldo+"|");
		System.out.println("|                          |");
		System.out.println("===========================");
		
	}

	@Override
	void mostrarsaldo() {
		System.out.println("Saldo Aplicado R$ "+ this.getsaldo());
		
	}
	   
	   
	
	
}