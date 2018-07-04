package strategy;

public class Car implements Vehicle {
    @Override
    public void run() {
        System.out.println("开着汽车去旅行");
    }
}
