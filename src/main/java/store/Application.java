package store;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
    private Inventory inventory = new Inventory();
    private Membership membership = new Membership();

    public Store() {
        // 상품 추가 예시
        inventory.addProduct(new Product("콜라", 1000, 10));
        inventory.addProduct(new Product("사이다", 1000, 8));
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        Receipt receipt = new Receipt();

        while (true) {
            inventory.displayProducts();
            System.out.print("구매하실 상품명과 수량을 입력해 주세요. (예: 콜라-3): ");
            String input = scanner.nextLine();

            if (input.matches("\\[\\w+-\\d+]")) {
                String[] parts = input.substring(1, input.length() - 1).split("-");
                String productName = parts[0];
                int quantity = Integer.parseInt(parts[1]);

                Product product = inventory.getProduct(productName);
                int cost = product.getPrice() * quantity;
                product.reduceStock(quantity);
                receipt.addItem(productName, quantity, cost);

                System.out.print("멤버십 할인을 받으시겠습니까? (Y/N): ");
                if (scanner.nextLine().equalsIgnoreCase("Y")) {
                    int discount = membership.applyDiscount(receipt.totalAmount);
                    receipt.applyMembershipDiscount(discount);
                }
            }

            System.out.print("추가 구매 여부를 확인하기 위해 안내 문구를 출력한다. (Y/N): ");
            if (scanner.nextLine().equalsIgnoreCase("N")) break;
        }

        receipt.printReceipt();
    }

    public static void main(String[] args) {
        new Store().run();
    }
    }
}
