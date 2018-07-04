package singleton.lazy;

import java.util.concurrent.CountDownLatch;

public class SynchronizedLazyTest {
    public static void main(String[] args) {
        int threadNum = 10000;
        CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        Long start = System.currentTimeMillis();

        for (int i = 0; i < threadNum; i++) {
            new Thread(() -> {
                try {
                    countDownLatch.await();
                    //懒汉式测试
                    System.out.println(Earth.getInstance());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            countDownLatch.countDown();
        }
        Long end = System.currentTimeMillis();
        System.out.println("构造懒汉式单例对象完成:" + (end - start));
    }
}
