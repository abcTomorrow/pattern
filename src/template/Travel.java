package template;

public class Travel {

    private void destination() {
        System.out.println("选择目的地");
    }

    private void route() {
        System.out.println("选择路线");
    }

    private void vehicle() {
        System.out.println("选择交通工具");
    }

    public void travel() {
        System.out.println("打算去旅行，要着手准备下~~");
        destination();
        route();
        vehicle();
        System.out.println("准备就绪，出发~~~");
    }



}
