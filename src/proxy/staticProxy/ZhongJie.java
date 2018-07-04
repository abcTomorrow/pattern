package proxy.staticProxy;

import proxy.Job;
import proxy.User;

/**
 * 代理对象 要实现源对象的接口
 * 并且将原对象作为变量传递过来
 * 静态代理 虽然易于编码 好理解
 * 但是 代理类与被代理对象之间耦合性太高 一个代理类只能处理某一个被代理对象的业务 不利于扩展
 */
public class ZhongJie implements Job {
    private Job job;

    //user表示中介代理的对象
    public ZhongJie(Job job) {
        this.job = job;
    }

    @Override
    public void findJob() {
        System.out.println("代理类除了必须处理原对象的业务");
        job.findJob();
        System.out.println("也可以自己扩展实现其他的业务");
    }

    public static void main(String[] args) {
        //面向接口编程
        Job job = new User();
        ZhongJie zhongJie = new ZhongJie(job);
        zhongJie.findJob();
    }

}
