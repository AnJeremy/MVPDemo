package cn.syxg.mvpdemo.model.basemodel;

/**
 * Created by Administrator on 2018/6/7.
 *由于上节中DataModel使用反射机制获取对应Model的引用，所以Token中存的就应该是对应Model的包名+类名：
 *
 */

public class Token {

    // 包名
    private static final String PACKAGE_NAME = "cn.syxg.mvpdemo.model.basemodel.";

    // 具体Model
    public static final String API_USER_DATA = PACKAGE_NAME + "MainModel";

}
