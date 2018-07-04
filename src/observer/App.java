package observer;

import observer.publish.CustomSubject;
import observer.publish.Subject;
import observer.subscribe.CustomObserver;
import observer.subscribe.Observer;

public class App {
    public static void main(String[] args) {
        Observer observer1 = new CustomObserver("Lily");
        Observer observer2 = new CustomObserver("Lucy");
        Observer observer3 = new CustomObserver("Lala");

        Subject subject = new CustomSubject();
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        subject.notifyObserver("啦啦啦");

        subject.removeObserver(observer1);

        subject.notifyObserver("now is 2 o'clock");

    }
}
