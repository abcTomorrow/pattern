package delegate;

public class ProgramLeader {

    public void doWork(String programFunction) {
        if (programFunction.contains("login")) {
            new StaffB().work();
        }
        if (programFunction.contains("login_out")) {
            new StaffC().work();
        }
        if (programFunction.contains("register")) {
            new StaffA().work();
        }
    }
}