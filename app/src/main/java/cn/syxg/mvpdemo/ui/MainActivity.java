package cn.syxg.mvpdemo.ui;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import cn.syxg.mvpdemo.R;
import cn.syxg.mvpdemo.base.BaseActivity;
import cn.syxg.mvpdemo.presenter.MainPresenter;
import cn.syxg.mvpdemo.view.MainView;

public class MainActivity extends BaseActivity implements MainView, View.OnClickListener {

    private TextView tv;
    private Button mNormal,mFailure,mError;

    private MainPresenter mainPresenter;


    @Override
    protected int setView() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

        tv = findViewById(R.id.tv);
        mNormal = findViewById(R.id.btn_normal);
        mFailure = findViewById(R.id.btn_failure);
        mError = findViewById(R.id.btn_error);

    }

    @Override
    protected void init() {


        mainPresenter = new MainPresenter();
        mainPresenter.attachView(this);
        //mProgressDialog = new ProgressDialog(this);
        //mProgressDialog.setCancelable(false);
        //mProgressDialog.setMessage("正在加载数据");
        mNormal.setOnClickListener(this);
        mFailure.setOnClickListener(this);
        mError.setOnClickListener(this);

    }



  /*  @Override
    public void showDataMessage(String data) {

        tv.setText(data);

    }

    @Override
    public void showFailureMessage(String mss) {

        tv.setText(mss);

    }

    @Override
    public void showErrorMessage() {

        tv.setText("请求出错！！！");

    }*/

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_normal:

                mainPresenter.showData("normal");

                break;

            case R.id.btn_failure:

                mainPresenter.showData("failure");
                break;

            case R.id.btn_error:

                mainPresenter.showData("error");
                break;
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        mainPresenter.detachView();

    }

    @Override
    public void showDatas(String data) {

        tv.setText(data);

    }
}
