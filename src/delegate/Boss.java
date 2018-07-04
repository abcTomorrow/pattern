package delegate;

public class Boss {

    public void assignJob(ProgramLeader leader,String programFunction) {
        System.out.println("分配给项目经理一个项目开发工作");
        leader.doWork(programFunction);
    }

}
