package Projeto;

public class Conta implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cliente;
	private double saldo;

	public Conta() {
	}

	public Conta(String cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public void exebiSaldo() {

		if (n == 0) {
			System.out.println(cliente + " o saldo  :" + this.fazeDeposito());
		} else {
			System.out.println(cliente + " o saldo  :" + n);
		}
	}

	public void fazerSaco(double valor) {
		if (n == 0) {
			n = -valor + this.fazeDeposito();
		} else {
			n -= valor;
		}
	}

	double n;

	public void deposito(double valor) {
		n = this.fazeDeposito();
		n = n + valor;
	}

	public double fazeDeposito() {
		return saldo;

	}

	public void transferencia(Conta distino, double valor) {
		this.fazerSaco(valor);
		distino.deposito(valor);
	}

	public String getCliente() {
		return cliente;
	}

	public double getSaldo() {
		return saldo;
	}

}
