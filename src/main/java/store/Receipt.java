import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private List<String> purchasedItems = new ArrayList<>();
    private int totalAmount;
    private int promotionDiscount;
    private int membershipDiscount;

    public void addItem(String item, int quantity, int price) {
        purchasedItems.add(item + "\t" + quantity + "\t" + price);
        totalAmount += quantity * price;
    }

    public void applyPromotionDiscount(int discount) {
        promotionDiscount = discount;
        totalAmount -= discount;
    }

    public void applyMembershipDiscount(int discount) {
        membershipDiscount = discount;
        totalAmount -= discount;
    }

    public void printReceipt() {
        System.out.println("==============W 편의점================");
        for (String item : purchasedItems) {
            System.out.println(item);
        }
        System.out.println("====================================");
        System.out.println("총구매액:\t" + totalAmount);
        System.out.println("행사할인:\t-" + promotionDiscount);
        System.out.println("멤버십할인:\t-" + membershipDiscount);
        System.out.println("내실돈:\t" + (totalAmount));
    }
}
