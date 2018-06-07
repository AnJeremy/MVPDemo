package cn.syxg.mvpdemo.model.basemodel;

import android.os.Handler;

import cn.syxg.mvpdemo.model.net.NetWorkCallBack;

/**
 * Created by Administrator on 2018/6/7.
 */

public class MainModel extends BaseModel{


    @Override
    public void execute(final NetWorkCallBack callBack) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                switch (mParams[0]){

                    case "normal":
                        callBack.onSuccess("这是成功数据");
                        break;
                    case "failure":
                        callBack.onFailure("返回数据失败");
                        break;

                    case "error":

                        callBack.onOnError();

                        break;
                }

                callBack.onComplete();

            }
        }, 2000);



    }
}
