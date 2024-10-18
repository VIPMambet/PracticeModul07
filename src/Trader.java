public class Trader implements IObserver {
    private String name;

    public Trader(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double newPrice) {
        System.out.println("Трейдер " + name + " получил обновление: " + stockSymbol + " новая цена: " + newPrice);
    }
}