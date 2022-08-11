package ProjetoBanco;

public abstract class CadastroGeral {

	private String titular;
	private int conta;
	protected double saldo;
	private int senha;
	
	int getconta() {
		return conta;
	}
	
	void setconta(int conta) {
		this.conta = conta;
	}
	
	String gettitular() {
		return titular;
	}
		
	void settitular(String titular) {
		this.titular = titular;
	}
	
	double getsaldo() {
		return saldo();
	}
	
	
	
	//	
	protected double saldo() {
		return saldo;
	}
	
	int getsenha() {
		return senha;
		
	}
	

	//
	
	abstract void depositar (double valor);
	abstract void dados();
	abstract void mostrarsaldo();

	
}
