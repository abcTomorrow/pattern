package singleton.lazy;

/**
 * 懒汉式单例
 * 只有当使用到该对象的时候 才初始化 对象才会创建
 */
public class Earth {
    private static Earth EARTH = null;

    private Earth() {
    }

    //当有多个线程同时访问该方法时，可能线程进入该方法的时候不觉得对象已经创建 而另一个同时进入该方法的线程先与它创建好了该对象
    //因此该对象实例便不唯一 因此不是线程安全的
    //添加synchronized 测试效率
    public static Earth getInstance() {
        synchronized (Earth.class) {
            if (EARTH == null)
                EARTH = new Earth();
            return EARTH;
        }
    }

}
