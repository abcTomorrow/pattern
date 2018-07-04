package delegate;

public class DelegateTest {
    public static void main(String[] args) {

        Boss boss = new Boss();
        ProgramLeader leader = new ProgramLeader();
        String function = ProgramFunction.LOGIN + ";" + ProgramFunction.LOGIN_OUT;
        boss.assignJob(leader, function);
    }
}
