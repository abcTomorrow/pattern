package proxy.JDKProxy;

import proxy.Job;
import proxy.User;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK Proxy 要求被代理对象必须实现接口
 */
public class ZhongJie implements InvocationHandler {


    private Job job;

    public Object getInstance(Job job) {
        this.job = job;
        Class<? extends Job> clazz = job.getClass();
        //第一个参数表示使用哪个类加载器加载该class文件
        //第二个参数表示代理对象要实现哪个接口
        //第三个表示用哪个InvocationHandler执行被代理方法
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    /**
     * @param proxy  生成的代理对象
     * @param method 被代理的对象的方法
     * @param args   方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("扩展方法");
        Object obj = method.invoke(this.job, args);
        System.out.println("扩展方法");
        return obj;
    }

    //通过查看proxy.class可知 一共有四个方法被代理 toString hashCode equals 以及我们的findJob
    public static void main(String[] args) throws Exception {
        Job job = new User();
        ZhongJie zhongJie = new ZhongJie();
        Job object = (Job) zhongJie.getInstance(job);
        //这里代理对象会执行到toString方法 因此InvocationHandler会执行一次Invoke method是toString
        System.out.println(object);
        System.out.println(object.getClass());
        //当代理类执行方法时，其实是InvocationHandler执行Invoke方法的过程
        //  object.findJob();
        //将生成的代理类放到磁盘上 反编译查看
        //通过反编译代理类可知,代理类已经继承了Proxy,而且Java是单继承 因此JDK代理 只能支持接口的代理

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", job.getClass().getInterfaces());
        FileOutputStream outputStream = new FileOutputStream("e://proxy.class");
        outputStream.write(bytes);
        outputStream.flush();
        outputStream.close();
    }
}
