package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

import entities.Cliente;
import entities.ItensPedido;
import entities.PedidoExe;
import entities.Produto;
import entities.enums.OrderStatus;

public class ProgramPedidoExe {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do Cliente: ");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.nextLine();
		System.out.println("Data de Nascimento (DD/MM/AAAA): ");
		Date niver = sdf.parse(sc.nextLine());
		
		Cliente cliente = new Cliente(nome, email, niver);
		
		System.out.println("Digite os dados do pedido: ");
		System.out.println("Status: ");
		String status = sc.nextLine();
		
		PedidoExe pedido = new PedidoExe(new Date(), OrderStatus.valueOf(status), cliente);
		
		System.out.println("Quantos itens terá o pedido: ");
		Integer n = sc.nextInt();
		for (int i=0; i<n; i++) {
			System.out.println("Digite os dados do produto " + (i + 1) + " :");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String pnome = sc.nextLine();
			
			System.out.println("Preço do produto: ");
			Double preco = sc.nextDouble();
			
			Produto produto = new Produto(pnome, preco);
			
			System.out.println("Quantidade do produto: ");
			Integer qtd = sc.nextInt();
			
			ItensPedido itemPedido = new ItensPedido(qtd, preco, produto);
			pedido.addItem(itemPedido);
			
		}
		System.out.println();
		System.out.println("Resumo do Pedido: ");
		System.out.println(pedido);

	}

}
