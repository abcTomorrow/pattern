package factory.factorymethod;

import factory.BMW;
import factory.Car;

public class BMWFactory implements CarFactory {
    @Override
    public Car produceCar() {
        return new BMW();
    }

}
