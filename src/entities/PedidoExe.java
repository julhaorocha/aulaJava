package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import entities.enums.OrderStatus;

public class PedidoExe {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date momento;
	private OrderStatus status;
	
	private Cliente cliente;
	
	private List<ItensPedido> itens = new ArrayList<>();

	public PedidoExe(){
		
	}
	public PedidoExe(Date momento, OrderStatus status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}
	public Date getMomento() {
		return momento;
	}
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public void addItem(ItensPedido item) {
		itens.add(item);
		
	}
	public void removeItem(ItensPedido item) {
		itens.remove(item);
	}
	public double total() {
		double total = 0;
		for (ItensPedido i : itens) {
		total = total + i.subTotal();
		}
		return total;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Data : ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens do Pedido:");
		for(ItensPedido item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Preço Total : R$");
		sb.append(String.format("%.2f", total()));
		
		return sb.toString();
	}
	
}
	
	

