public class MainStockExchange {
    public static void main(String[] args) {
        StockExchange stockExchange = new StockExchange();

        Trader trader1 = new Trader("Алексей");
        AutoTrader autoTrader1 = new AutoTrader("АвтоТрейдер 1");

        stockExchange.attach(trader1);
        stockExchange.attach(autoTrader1);

        stockExchange.setStockPrice("AAPL", 120);
        stockExchange.setStockPrice("AAPL", 45);
        stockExchange.setStockPrice("AAPL", 105);
    }
}