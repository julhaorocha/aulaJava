package entities;

public class ItensPedido {
	
	private Integer qnt;
	private Double preco;
	private Produto produto;
	
	public ItensPedido() {
		
	}
	
	public ItensPedido(Integer qnt, Double preco, Produto produto) {
		this.qnt = qnt;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQnt() {
		return qnt;
	}

	public void setQnt(Integer qnt) {
		this.qnt = qnt;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public double subTotal() {
		return preco * qnt;
	}

	@Override
	public String toString() {
		return " \n"
				+  produto + ", " 
				+ "Quantidade: " 
				+ qnt + ", "
				+ "SubTotal = R$" + String.format("%.2f", subTotal()) ;
	}
	
	
	

}
