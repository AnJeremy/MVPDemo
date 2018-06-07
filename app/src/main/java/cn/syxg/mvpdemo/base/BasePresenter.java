package cn.syxg.mvpdemo.base;

/**
 * Created by Administrator on 2018/6/7.
 */

public class BasePresenter <V extends BaseView>{

    private V mainView;

    /**
     * 绑定view，一般在初始化中调用该方法
     */

    public void attachView(V mvpView) {
        this.mainView = mvpView;
    }
    /**
     * 断开view，一般在onDestroy中调用
     */

    public void detachView() {
        this.mainView = null;
    }
    /**
     * 是否与View建立连接
     * 每次调用业务请求的时候都要出先调用方法检查是否与View建立连接
     */
    public boolean isViewAttached(){
        return mainView != null;
    }
    /**
     * 获取连接的view
     */
    public V getView(){
        return mainView;
    }


}
