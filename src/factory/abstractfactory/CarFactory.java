package factory.abstractfactory;

import factory.BMW;
import factory.Benz;
import factory.Car;

/**
 * 抽象工厂模式
 * 过程很简单
 * 客户端想要制造什么 只需要选择对应方法即可
 * 且不易选择出错
 */
public class CarFactory extends AbstractFactory {
    @Override
    Car produceBenz() {
        return new Benz();
    }

    @Override
    Car produceBMW() {
        return new BMW();
    }

    public static void main(String[] args) {
        //声明一个工厂
        CarFactory carFactory = new CarFactory();
        //制造Benz
        Car car = carFactory.produceBenz();
        car.showCar();
    }
}
