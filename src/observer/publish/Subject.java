package observer.publish;

import observer.subscribe.Observer;

public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver(String msg);

}
