import java.util.ArrayList;
import java.util.List;

public class BankingAccount implements Subject {
    List<Observer> observerList = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void update(String message) {
        for (Observer o: observerList){
            o.update(message);
        }
    }
}
