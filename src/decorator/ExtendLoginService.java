package decorator;

import decorator.old.LoginService;

/**
 * 扩展登录功能，新增第三方登录
 */
public interface ExtendLoginService extends LoginService {
     void loginByQQ(String qqNum);

}
