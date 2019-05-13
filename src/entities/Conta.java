package entities;

public class Conta {
	
		
		private int num;
		private String nome;
		private double saldo;
		public Conta(int num, String nome, double depositoInicial) {
			super();
			this.num = num;
			this.nome = nome;
			depositar(depositoInicial);
		}
		public Conta(int num, String nome) {
			this.num = num;
			this.nome = nome;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getSaldo() {
			return saldo;
		}
	
		public int getNum() {
			return num;
		}
		
		public void depositar(double deposito) {
			saldo += deposito;
			
		}
		
		public void sacar(double saque) {
			
			saldo -=  saque + 5.0;
		}
		
		public String toString() {
			return "Conta: "
					      + num
					      + ", Nome:"
					      + nome
					      +", Saldo: R$"
					      + String.format("%.2f", saldo);
					
			
		}
		
		
		

	}



