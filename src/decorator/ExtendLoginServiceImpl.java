package decorator;

import decorator.old.LoginService;
//装饰类
public class ExtendLoginServiceImpl implements  ExtendLoginService{
    private LoginService loginService;

    public ExtendLoginServiceImpl(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public void loginByQQ(String qqNum) {
        System.out.println("qq登录,qq="+qqNum);
    }

    @Override
    public void login(String name, String password) {
        loginService.login(name,password);
    }
}
