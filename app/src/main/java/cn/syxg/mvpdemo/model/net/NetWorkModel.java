package cn.syxg.mvpdemo.model.net;


import android.os.Handler;

/**
 * Created by Administrator on 2018/6/7.
 */

public class NetWorkModel {

    public static void getData(final String params, final NetWorkCallBack callBack){

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {

               switch (params){

                   case "normal":

                       callBack.onSuccess("你好，世界！");

                       break;
                   case "failure":

                       callBack.onFailure("it is failure");

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
