package prototype;

/**
 * 浅克隆 只是复制了原对象的引用；两者指向同一个引用
 * 因此 从数据意义上看 克隆对象和原对象是同一个。
 * 修改了其中一个数据 另一个对象的数据也发生变化
 */
public class User implements Cloneable {
    public String userName = "wojiushiwo";
    public Integer width = 2;
    public int num = 10;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
