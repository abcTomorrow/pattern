package factory.factorymethod;

import factory.Car;

/**
 * 工厂模式中 客户端只在意结果 不在意过程。
 * 而工厂方法模式将过多的过程展现出来，并且每种不同的实体在不同的工厂中，
 * 极易手误写错工厂类 造成错误
 */
public class CarFactoryTest {
    public static void main(String[] args) {
        //从Benz工厂生产Benz
        CarFactory carFactory = new BenzFactory();
        Car car = carFactory.produceCar();
        car.showCar();
    }
}
