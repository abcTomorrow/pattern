package prototype;

/**
 * 浅拷贝
 * 它会创建一个新对象，这个对象有着原始对象属性值的一份拷贝；如果属性是基本类型，拷贝的就是基本类型的值
 * 如果属性是引用类型，拷贝的就是内存地址(即指向同一个对象) 因此如果其中一个对象改变了这个地址，就会影响到
 * 另一个对象
 *
 *
 */
public class SimpleCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        User user=new User();
        user.num=333;
        User clone = (User) user.clone();
        System.out.println(user==clone);
        //222
        //基本类型 拷贝的是基本类型的值
        System.out.println(clone.num);
        //引用类型,拷贝的是原引用对象的地址 即拷贝对象与原对象指向同一个地址
        System.out.println(clone.userName==user.userName);
    }
}
