package decorator.old;

public class LoginServiceImpl implements LoginService {
    @Override
    public void login(String name, String password) {
        System.out.println("使用账号、密码登录,name="+name+",密码="+password);
    }
}
