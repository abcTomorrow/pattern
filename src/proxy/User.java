package proxy;

import proxy.Job;

public class User implements Job {
    @Override
    public void findJob() {
        System.out.println("我需要一份工作！");
    }
}
