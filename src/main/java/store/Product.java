public class Product {
    private String name;
    private int price;
    private int stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
    public int getStock() { return stock; }

    public void reduceStock(int amount) {
        if (amount > stock) {
            throw new IllegalArgumentException("[ERROR] 재고 수량을 초과하여 구매할 수 없습니다.");
        }
        stock -= amount;
    }

    @Override
    public String toString() {
        return name + " " + price + "원 " + stock + "개";
    }
}
