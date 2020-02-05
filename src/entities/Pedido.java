package entities;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date dataPedido;
	private StatusPedido status;	
	private List<PedidoItem> pedidoItem = new ArrayList<>();
	private ClientePedido cliente;
	
	
	public Pedido ( java.util.Date date, StatusPedido status,  ClientePedido cliente) {		
		this.dataPedido = date;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public List<PedidoItem> getPedidoItem() {
		return pedidoItem;
	}
	
	public ClientePedido getCliente() {
		return cliente;
	}

	public void setCliente(ClientePedido cliente) {
		this.cliente = cliente;
	}

	public void adicionaItem(PedidoItem e) {
		pedidoItem.add(e);
	}
	
	public void removeItem(PedidoItem e) {
		pedidoItem.remove(e);
	}
	
	public Double total() {
		
		Double soma = 0.00;
		
		for (PedidoItem item : pedidoItem) {
			soma += item.subTotal();
		}
				
		return soma;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(dataPedido) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(cliente + "\n");
		sb.append("Order items:\n");
		for (PedidoItem item : pedidoItem) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
}
