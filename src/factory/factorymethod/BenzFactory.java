package factory.factorymethod;

import factory.Benz;
import factory.Car;

/**
 * 每个品牌由每个生产厂商进行生产
 */
public class BenzFactory implements CarFactory {

    @Override
    public Car produceCar() {
        return new Benz();
    }
}
