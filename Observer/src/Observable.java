import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    //takipci listesi
    private List<Observer> observerList;

    public Observable() {
        observerList = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    //observer'lara haber ver
    public void Alert(){
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }

}