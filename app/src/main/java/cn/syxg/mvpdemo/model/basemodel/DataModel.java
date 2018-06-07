package cn.syxg.mvpdemo.model.basemodel;

/**
 * Created by Administrator on 2018/6/7.
 *
 * 由于DataModel负责数据请求的分发，所以最初打算作成一个简单工厂模式的样子，通过switch(token)语句判断要调用的Model。

 但如果这样设计的话，在实际开发中我们每次添加一个数据请求接口，不光需要新建对应的Model和Token，还需要在DataModel类的switch(token)语句中新增加对应的判断，贼麻烦~

 思来想去，我觉得利用反射机制会是一个比较理想的办法，请求数据时以具体Model的包名+类型作为Token，利用反射机制直接找到对应的Model。

 */

public class DataModel{


    public static BaseModel request(String token){

        BaseModel model = null;

        try {
            model = (BaseModel) Class.forName(token).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


        return model;

    }

}
