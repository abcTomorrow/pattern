package strategy;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("坐着大巴车去旅行");
    }
}
