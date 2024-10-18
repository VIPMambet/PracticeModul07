import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockExchange implements ISubject {
    private Map<String, Double> stockPrices = new HashMap<>();
    private List<IObserver> observers = new ArrayList<>();

    public void setStockPrice(String stockSymbol, double price) {
        stockPrices.put(stockSymbol, price);
        notifyObservers(stockSymbol, price);
    }

    @Override
    public void attach(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String stockSymbol, double newPrice) {
        for (IObserver observer : observers) {
            observer.update(stockSymbol, newPrice);
        }
    }
}