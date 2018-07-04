package strategy;

/**
 * 策略模式 跟Java中的switch case很相似
 * 因此该模式要突出选择为主
 */
public class Travel {

    public void travel(Vehicle vehicle) {
        System.out.println("打算出去旅游");
        vehicle.run();
    }


    public static void main(String[] args) {
        Travel travel = new Travel();
        //这种方式较为繁琐 突出不了 选择为主的策略
//        travel.travel(new Car());
        //将交通工具放在枚举中保存
//        travel.travel(Vehicle.BUS);
        travel.travel(VehicleType.BUS.get());
    }
}
