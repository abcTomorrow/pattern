package singleton.lazy;

/**
 * 静态内部类 懒汉式单例
 */
public class StaticClassLazy {

    private StaticClassLazy() {
    }

    public static StaticClassLazy getInstance() {
        return InnerClass.staticClassLazy;
    }

    private static class InnerClass {
        private static StaticClassLazy staticClassLazy = new StaticClassLazy();
    }

    public static void main(String[] args) {
        //获得了实例
        StaticClassLazy instance = StaticClassLazy.getInstance();
    }
}
