public class StockTransactionHistory {
    private double capitalGain;

    public StockTransactionHistory() {
        this.capitalGain = 0.0;
    }

    public double getCapitalGain() {
        return capitalGain;
    }

    public void setCapitalGain(double capitalGain) {
        this.capitalGain = capitalGain;
    }

    public static void main(String[] args) {
        StockTransactionHistory sth = new StockTransactionHistory();
        StockTransaction st = new StockTransaction();

        st.buy(25, 120);
        st.buy(75, 20);
        
        sth.setCapitalGain(st.sell(55, 20));

        if (sth.getCapitalGain() > 0) {
            System.out.println("Sold at a profit of $" + sth.getCapitalGain());
            System.out.println();
        } else {
            System.out.println("Sold at a loss of $" + sth.getCapitalGain());
            System.out.println();
        }

        sth.setCapitalGain(st.sell(75, 10));

        st.buy(10, 100);
        st.buy(4, 130);
        st.buy(16, 200);

        sth.setCapitalGain(st.sell(65, 10));

        if (sth.getCapitalGain() > 0) {
            System.out.println("Sold at a profit of $" + sth.getCapitalGain());
            System.out.println();
        } else {
            System.out.println("Sold at a loss of $" + sth.getCapitalGain());
            System.out.println();
        }

        sth.setCapitalGain(st.sell(65, 150));

        if (sth.getCapitalGain() > 0) {
            System.out.println("Sold at a profit of $" + sth.getCapitalGain());
            System.out.println();
        } else {
            System.out.println("Sold at a loss of $" + sth.getCapitalGain());
            System.out.println();
        }
    }
}
