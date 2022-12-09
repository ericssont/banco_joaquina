package conta;

public class Conta {
	//Conta: numero da conta,agencia,saldo, (Pessoa) titular
	private String numeroConta;
	private String agencia;
	private Double saldo;
	private Pessoa titular;
	
	public Conta() {
		this.agencia = "0001";
		this.saldo = 0.0;
		this.titular = new Pessoa();
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Pessoa getTitular() {
		return titular;
	}

	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", agencia=" + agencia + ", saldo=" + saldo + ", titular="
				+ titular + "]";
	}
}
