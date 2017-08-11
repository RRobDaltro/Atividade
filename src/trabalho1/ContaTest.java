package trabalho1;

import Projeto.Conta;

public class ContaTest {

	public static void main(String[] args) {
		Conta conta=new Conta("ivone",2234);
		Conta distino =new Conta("roberto",700);
		conta.getCliente();
		distino.getCliente();
		//distino.deposito(1000);
		//conta.deposito(2000);
         distino.exebiSaldo();
         conta.exebiSaldo();
         distino.fazerSaco(500);
         conta.fazerSaco(1500);
		 distino.exebiSaldo();
		 conta.exebiSaldo();
	}

}
