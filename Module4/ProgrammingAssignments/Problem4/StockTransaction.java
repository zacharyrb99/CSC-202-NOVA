public class StockTransaction {
    Node front;
    Node rear;

    public StockTransaction() {
        this.front = null;
        this.rear = null;
    }

    void buy(double cost, int quantity) {
        System.out.println("Buying " + quantity + " shares at $" + cost + " per share.");
        Stock stock = new Stock(cost, quantity);
        Node temp = new Node(stock);

        if (isEmpty()) {
            this.front = temp;
            this.rear = temp;
        } else {
            this.rear.next = temp;
            this.rear = temp;
        }
    }

    double sell(double cost, int quantity) {
        double capitalGain = 0.0;

        if (isEmpty()) return capitalGain;

        System.out.println("Selling " + quantity + " shares at $" + cost + " per share.");

        while (quantity > 0) {
            Stock stock = this.front.data;
            if (stock.getQuantity() == quantity) {
                this.front = this.front.next;

                if (this.front == null) this.rear = null;
                break;
            } else if (stock.getQuantity() < quantity) {
                capitalGain = capitalGain + ((cost - stock.getCost()) * stock.getQuantity());
                quantity = quantity - stock.getQuantity();
                this.front = this.front.next;

                if (this.front == null) this.rear = null;
            } else if (stock.getQuantity() > quantity) {
                capitalGain = capitalGain + ((cost - stock.getCost()) * quantity);
                quantity = 0;
                this.front.data.setQuantity(stock.getQuantity() - quantity);
            }
        }

        return capitalGain;
    }

    boolean isEmpty() {
        return (front == null);
    }
}
