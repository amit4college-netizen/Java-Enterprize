package mypack;

import counter.ejb.InventoryBean;
import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import java.util.List;

@Named("inventory")
@RequestScoped
public class Inventory {

    private String name;
    private String category;
    private int quantity;
    private double price;

    @EJB
    private InventoryBean bean;

    public void save() {

        Product p = new Product();

        p.setName(name);
        p.setCategory(category);
        p.setQuantity(quantity);
        p.setPrice(price);

        bean.addProduct(p);

        name = "";
        category = "";
        quantity = 0;
        price = 0;
    }

    public List<Product> getProducts() {
        return bean.getProducts();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}