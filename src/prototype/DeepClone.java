package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//通过序列化 反序列化的方式实现深克隆

/**
 * 深拷贝
 * 原对象与拷贝对象中的属性完全是不同的 互相独立的
 * 修改其中一个对象的属性值 不会影响另一个对象的属性值
 * 深拷贝会拷贝所有属性，当对象和它引用的对象一起拷贝时即发生深拷贝
 * 深拷贝相对于浅拷贝速度较慢 花销较大；
 * 若不使用序列化的方式，则需要将对象中的所有引用对象均clone 才能实现深拷贝 但是一般这种方式较繁琐
 */
public class DeepClone {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        CloneEntity entity = new CloneEntity();
        oos.writeObject(entity);


        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        CloneEntity cloneEntity = (CloneEntity) ois.readObject();

        System.out.println(entity == cloneEntity);
        //引用数据类型
        System.out.println(entity.name==cloneEntity.name);
        //基本数据类型 比较的是值 因此为true
        //如果将类型换成Integ 则为false
        System.out.println(entity.age==cloneEntity.age);
    }
}
