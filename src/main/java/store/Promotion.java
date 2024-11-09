public class Promotion {
    private String productName;
    private int buyCount;
    private int freeCount;

    public Promotion(String productName, int buyCount, int freeCount) {
        this.productName = productName;
        this.buyCount = buyCount;
        this.freeCount = freeCount;
    }

    public int applyPromotion(int quantity) {
        int freeItems = (quantity / buyCount) * freeCount;
        return freeItems;
    }
}
