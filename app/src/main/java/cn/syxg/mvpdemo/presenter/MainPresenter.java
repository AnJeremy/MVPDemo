package cn.syxg.mvpdemo.presenter;

import cn.syxg.mvpdemo.base.BasePresenter;
import cn.syxg.mvpdemo.model.basemodel.DataModel;
import cn.syxg.mvpdemo.model.basemodel.Token;
import cn.syxg.mvpdemo.model.net.NetWorkCallBack;
import cn.syxg.mvpdemo.view.MainView;

/**
 * Created by Administrator on 2018/6/7.
 *
 * Presenter类是具体的逻辑业务处理类，该类为纯Java类，不包含任何Android API，负责请求数据，
 * 并对数据请求的反馈进行处理。

 Presenter类的构造方法中有一个View接口的参数，是为了能够通过View接口通知Activity进行更新界面等操作。
 */

public class MainPresenter extends BasePresenter<MainView>{

    //private MainView mainView;

    public MainPresenter() {

    }

    /**
     * 绑定view，一般在初始化中调用该方法
     *//*

    public void attachView(MainView mainView){

        this.mainView = mainView;

    }


    *//**
     * 断开view，一般在onDestroy中调用
     *//*

    public void detachView(){

        mainView = null;

    }*/

  /*  *//**
     * 是否与View建立连接
     * 每次调用业务请求的时候都要出先调用方法检查是否与View建立连接
     *//*
    public boolean isViewAttached(){
        return mainView!= null;
    }*/

    public void showData(String params){

        if(!isViewAttached()){

            return;

        }

        getView().showLoading();

      /*  NetWorkModel.getData(params, new NetWorkCallBack() {
            @Override
            public void onSuccess(Object data) {

                if(isViewAttached()){

                    getView().showDatas((String) data);

                }

            }

            @Override
            public void onFailure(String msg) {

                if (isViewAttached()){

                    getView().showToast(msg);

                }

            }

            @Override
            public void onOnError() {

                if(isViewAttached()){

                    getView().showErr();

                }

            }

            @Override
            public void onComplete() {

                if(isViewAttached()){

                    getView().hideLoading();
                }


            }
        });*/

      //使用第二种封装后的model

        DataModel.request(Token.API_USER_DATA).params(params).execute(new NetWorkCallBack() {
            @Override
            public void onSuccess(Object data) {

                if(isViewAttached()){

                    getView().showDatas((String) data);

                }

            }

            @Override
            public void onFailure(String msg) {

                if (isViewAttached()){

                    getView().showToast(msg);

                }

            }

            @Override
            public void onOnError() {

                if(isViewAttached()){

                    getView().showErr();

                }

            }

            @Override
            public void onComplete() {

                if(isViewAttached()){

                    getView().hideLoading();
                }

            }
        });

    }
}
