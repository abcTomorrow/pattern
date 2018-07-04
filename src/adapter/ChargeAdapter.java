package adapter;

/**
 * 三线插头 转成两线插头
 * 输入 三线插头
 * 输出 两线插头充电
 * 因此适配器类要与待适配的类实现同一个接口
 * 因为两线插头充电是CNCharge的功能 因此底部需要使用CNCharge充电方法
 */
public class ChargeAdapter implements HKCharge {
    private CNCharge charge;

    public ChargeAdapter(CNCharge charge) {
        this.charge = charge;
    }

    @Override
    public void HKcharge() {
        System.out.println("港版手机 正在使用转换器 充电");
        charge.CNcharge();
    }

    public static void main(String[] args) {
        CNCharge charger = new CNChargeHead();
        ChargeAdapter adapter = new ChargeAdapter(charger);
        adapter.HKcharge();
    }
}
