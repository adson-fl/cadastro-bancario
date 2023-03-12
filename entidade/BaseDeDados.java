package entidade;

public class BaseDeDados {

	private int conta;
	private String nome;
	private double valor;

	
	public BaseDeDados() {

	}

    public BaseDeDados(int conta, String nome) {
	    this.conta = conta;
	    this.nome = nome;
}
	public BaseDeDados(int conta, String nome, double depositonovo) {
		this.conta = conta;
		this.nome = nome;
		deposito(depositonovo);
	}
	public BaseDeDados(double depositonovo) {
		deposito(depositonovo);
	}
	

	public int getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void deposito(double valor) {  // deixa
		this.valor += valor;
	}

	public void saque(double valor) {  // deixa 
		if(valor > 0) {
		this.valor -= valor + 5.00;
		}
		else {
			System.out.println("saldo insuficiente");
		}
	}
	
	public String toString() {
		return "proprietario:" + nome
				+" conta: "
				+ conta
				+ " seu saldo atual é de: "
				+ String.format("%.2f", valor) + " R$";
		
	}

}
