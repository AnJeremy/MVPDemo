package cn.syxg.mvpdemo.model.net;

/**
 * Created by Administrator on 2018/6/7.
 *
 * Callback 接口是Model层给Presenter层反馈请求信息的传递载体，所以需要在Callback中定义数据请求的各种反馈状态：
 */

public interface NetWorkCallBack<T> {

    void onSuccess(T data);

    void onFailure(String msg);

    void onOnError();

    void onComplete();

}
