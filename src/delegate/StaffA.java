package delegate;

public class StaffA implements Staff{
    @Override
    public void work() {
        System.out.println("员工A来做注册");
    }
}
