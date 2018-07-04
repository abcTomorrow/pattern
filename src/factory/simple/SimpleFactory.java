package factory.simple;

import factory.BMW;
import factory.Benz;
import factory.Car;

/**
 * 简单工厂模式
 * 类似于小作坊
 * 什么都会做 什么都要做
 * <p>
 * 但是当有新设备要生产的时候，涉及到修改代码 不符合开闭原则
 */
public class SimpleFactory {
    public static Car produceCar(String brand) {
        if ("Benz".equals(brand)) {
            return new Benz();
        } else if ("BMW".equals(brand)) {
            return new BMW();
        } else {
            System.out.println("抱歉，不能生产您指定品牌的汽车");
            return null;
        }
    }

    public static void main(String[] args) {

        Car benz = SimpleFactory.produceCar("Benz");
        benz.showCar();


    }
}
