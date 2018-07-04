package observer.subscribe;

public class CustomObserver implements Observer{
    private String name;

    public CustomObserver(String name) {
        this.name = name;
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name+"接收到消息:"+msg);
    }
}
