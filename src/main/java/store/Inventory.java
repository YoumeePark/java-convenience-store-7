import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getName(), product);
    }

    public Product getProduct(String name) {
        if (!products.containsKey(name)) {
            throw new IllegalArgumentException("[ERROR] 존재하지 않는 상품입니다.");
        }
        return products.get(name);
    }

    public void displayProducts() {
        System.out.println("현재 보유하고 있는 상품입니다.");
        for (Product product : products.values()) {
            System.out.println("- " + product);
        }
    }
}
