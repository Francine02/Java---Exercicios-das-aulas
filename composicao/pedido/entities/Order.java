package composicao.pedido.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import composicao.pedido.entities.enums.OrderStatus;

public class Order {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> items = new ArrayList<>();
    
    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }
    public static SimpleDateFormat getSdf() {
        return sdf;
    }
    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item){ //Adiciona na lista um novo item
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double total() {
        double sum = 0;

        for(OrderItem i: items){
            sum += i.subTotal();
        }
        return sum;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Order moment: ");
		stringBuilder.append(sdf.format(moment) + "\n");
		stringBuilder.append("Order status: ");
		stringBuilder.append(status + "\n");
		stringBuilder.append("Client: ");
		stringBuilder.append(client + "\n");
		stringBuilder.append("Order items:\n");
		for (OrderItem item : items) {
			stringBuilder.append(item + "\n");
		}
		stringBuilder.append("Total price: $");
		stringBuilder.append(String.format("%.2f", total()));
		return stringBuilder.toString();
    }

    
}
