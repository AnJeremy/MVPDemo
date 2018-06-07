package cn.syxg.mvpdemo.model.basemodel;


import java.util.Map;

import cn.syxg.mvpdemo.model.net.NetWorkCallBack;

/**
 * Created by Administrator on 2018/6/7.
 */

public abstract class BaseModel<T> {

    protected String [] mParams;

    public BaseModel params(String... args){

        mParams = args;

        return this;
    }

    public abstract void execute(NetWorkCallBack<T> callBack);


    protected void requestGetApi(String url , Map paramas,NetWorkCallBack<T> callBack){


    }

    protected void requestPostApi(String url , Map paramas,NetWorkCallBack<T> callBack){


    }

}
