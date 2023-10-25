package org.example.hw_2;

public class Main {
    public static void main(String[] args) {
        Buyer[] buyers = new Buyer[5];
        buyers[0] = new Buyer("Artem");
        buyers[1] = new Buyer("Denis");
        buyers[2] = new Buyer("Paver");
        buyers[3] = new Buyer("Nikolay");

        Product[] products = new Product[5];
        products[0] = new Product("Phone", 50000);
        products[1] = new Product("Notebook", 100000);
        products[2] = new Product("Watch", 20000);
        products[3] = new Product("eBook", 10000);

        Order[] orders = new Order[5];
        try {
            orders[0] = makePurchase(buyers[0], products[0], 1);
            orders[1] = makePurchase(buyers[1], products[1], 2);
            orders[2] = makePurchase(buyers[2], products[2], 3);
            orders[3] = makePurchase(buyers[3], products[3], 1);
            orders[4] = makePurchase(buyers[3], products[3], 1);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("Кол-во совершенных покупок: " + getTotalPurchase(orders));

    }

    private static int getTotalPurchase(Order[] orders) {
        int count = 0;
        for (Order order : orders) {
            if (order != null) {
                count++;
            }
        }
        return count;
    }

    public static Order makePurchase (Buyer buyer, Product product, int quantity) throws Exception {
        if (buyer == null) {
            throw new Exception("Не существующий покупатель.");
        }
        if (product == null) {
            throw new Exception("Не существующий продукт.");
        }
        if (quantity < 0) {
            throw new Exception("Кол-во товара отрицательное");
        }

        return new Order(buyer, product, quantity);
    }

}
