package singleton;

import factory.Benz;

public enum SingletonEnum {
    INSTANCE;

    private Benz benz;

    SingletonEnum() {
        benz = new Benz();
    }

    public Benz getInstance() {
        return benz;
    }

    public static void main(String[] args) {
        //获得了实例
        Benz benz = SingletonEnum.INSTANCE.getInstance();
    }
}
