package singleton.hungry;

import java.util.concurrent.CountDownLatch;

/**
 * 营造多线程环境 测试多并发下 是否能得到单例对象
 */
public class EarthTest {


    public static void main(String[] args) throws Exception {
        int threadNum=300;
        CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        //构造200个线程,使构造好的线程阻塞，直到200个线程启动完成，再放行
        for (int i = 0; i < threadNum; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        countDownLatch.await();
                        //饿汉式
                        System.out.println(Earth.getInstance());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }).start();
            countDownLatch.countDown();
        }

        System.out.println("构造单例对象完成");
    }

}
