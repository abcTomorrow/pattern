package observer.publish;

import observer.subscribe.Observer;

import java.util.ArrayList;
import java.util.List;

public class CustomSubject implements Subject{
    private List<Observer> list=new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
         list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver(String msg) {
        System.out.println("公众号推送消息:"+msg);
        list.forEach(observer -> {
            observer.receive(msg);
        });
    }
}
