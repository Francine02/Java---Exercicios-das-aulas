package polimorfismo.produto.entities;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import composicao.pedido.entities.Product;

public class UsedProduct extends Product {
    private LocalDate manufactureLocalDate;

    public LocalDate getManufactureLocalDate() {
        return manufactureLocalDate;
    }

    public void setManufactureLocalDate(LocalDate manufactureLocalDate) {
        this.manufactureLocalDate = manufactureLocalDate;
    }

    public UsedProduct(String name, Double price, LocalDate manufactureLocalDate) {
        super(name, price);
        this.manufactureLocalDate = manufactureLocalDate;
    }
    
    @Override
	public String priceTag() {
		return getName() 
				+ " (used) $ " 
				+ String.format("%.2f", getPrice())
				+ " (Manufacture LocalDate: "
				+ manufactureLocalDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
	}
}
