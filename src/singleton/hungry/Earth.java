package singleton.hungry;

/**
 * 饿汉式单例
 * 对象实例在线程争抢之前已经生成，因此可以说是线程安全的
 *
 * 正是因为类被加载后 生成了对象实例，是它能够保证线程安全
 * 也正是如此，无论该类是否被用到，对象都会被初始化，而初始化会耗费资源
 * 所以这是弊端
 */
public class Earth {
    private static final Earth EARTH = new Earth();

    private Earth() {

    }

    public static Earth getInstance() {
        return EARTH;
    }

}
