package cn.syxg.mvpdemo.base;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/6/7.
 */

public abstract class BaseActivity extends AppCompatActivity implements BaseView{

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(setView());

        initView();

        init();

        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
    }


    protected abstract int setView();

    protected abstract void initView();

    protected abstract void init();

    @Override
    public void showLoading() {

        if(!progressDialog.isShowing()){

            progressDialog.show();

        }

    }

    @Override
    public void hideLoading() {

        if(progressDialog.isShowing()){

            progressDialog.dismiss();

        }

    }

    @Override
    public void showToast(String msg) {

        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showErr() {
        Toast.makeText(this,"ERROR",Toast.LENGTH_SHORT).show();
    }

    @Override
    public Context getContext() {
        return this;
    }
}
