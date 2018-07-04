package proxy.CglibProxy;

import net.sf.cglib.proxy.*;

import java.lang.reflect.Method;

/**
 * Cglib Proxy 不要求被代理对象实现接口
 */
public class ZhongJie implements MethodInterceptor {
    private User user;

    public Object getInstance(Class clazz) throws Exception {
        User u = (User) clazz.newInstance();
        this.user = u;

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        //回调集合 1、使用该代理对象处理回调 2、什么都不做
        Callback[] callbacks = new Callback[]{new ZhongJie(), NoOp.INSTANCE};
        enhancer.setCallbacks(callbacks);
        //这句话的意思是指 回调对象时该代理对象 同上面的new ZhongJie()
//        enhancer.setCallback(this);
        //过滤方法
        enhancer.setCallbackFilter(new CallbackFilter() {
            @Override
            public int accept(Method method) {
                //当方法名包含sayHello 则使用下标为1的回调处理
                if (method.getName().contains("sayHello")) {
                    return 1;
                } else {
                    //否则使用下标是0的回调对象处理方法
                    //这里 只有method2被代理对象拦截
                    return 0;
                }
            }
        });
        return enhancer.create();
    }

    /**
     * @param o           代理对象
     * @param method      被拦截的原始方法
     * @param objects     原始方法的参数
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("----cglib ----");
        return methodProxy.invokeSuper(o, objects);
    }

    public static void main(String[] args) throws Exception {
        ZhongJie zhongJie = new ZhongJie();
        User user = (User) zhongJie.getInstance(new User().getClass());
        System.out.println(user.getClass());
        user.sayHello();
        System.out.println("=============================");
        user.method2();
    }
}
