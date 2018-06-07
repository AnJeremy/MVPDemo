package cn.syxg.mvpdemo.base;

import android.content.Context;

/**
 * Created by Administrator on 2018/6/7.
 */

public interface BaseView {

    void showLoading();

    void hideLoading();

    /**
     * 显示提示
     * @param msg
     */
    void showToast(String msg);
    /**
     * 显示请求错误提示
     */
    void showErr();
    /**
     * 获取上下文
     * @return 上下文
     */
    Context getContext();

}
