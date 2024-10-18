public class AutoTrader implements IObserver {
    private String name;

    public AutoTrader(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double newPrice) {
        if (newPrice < 50) {
            System.out.println("Автоматический трейдер " + name + " покупает " + stockSymbol + " по цене " + newPrice);
        } else if (newPrice > 100) {
            System.out.println("Автоматический трейдер " + name + " продает " + stockSymbol + " по цене " + newPrice);
        }
    }
}