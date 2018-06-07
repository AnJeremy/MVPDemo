package cn.syxg.mvpdemo.view;

import cn.syxg.mvpdemo.base.BaseView;

/**
 * Created by Administrator on 2018/6/7.
 *
 * View接口是Activity与Presenter层的中间层，它的作用是根据具体业务的需要，为Presenter提供调用Activity中具体UI逻辑操作的方法。
 */

public interface MainView extends BaseView{


   void showDatas(String data);


}
