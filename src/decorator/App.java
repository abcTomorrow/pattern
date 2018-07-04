package decorator;

import decorator.old.LoginService;
import decorator.old.LoginServiceImpl;

public class App {
    public static void main(String[] args) {
        //老的方式进行登录
        LoginService loginService=new LoginServiceImpl();
        loginService.login("wojiushiwo","wojiushiwo");
        //扩展的方式登录 兼容老接口
        ExtendLoginService extendLoginService=new ExtendLoginServiceImpl(loginService);
        extendLoginService.loginByQQ("11111111");
    }
}
