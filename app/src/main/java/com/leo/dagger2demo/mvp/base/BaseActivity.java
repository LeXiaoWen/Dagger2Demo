package com.leo.dagger2demo.mvp.base;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * Created by Leo on 2018/3/12.
 */

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {
    @Inject
    protected P mPresenter;
    private Activity mActivity;
    protected ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) throws RuntimeException {
        super.onCreate(savedInstanceState);
        bindingDagger2(savedInstanceState);
        if (this.mPresenter == null) {
            throw new RuntimeException("没有设置Presenter或者没有重写onCreate()方法");
        } else {
            mActivity = this;
            this.mPresenter.setActivity(this);
            this.mPresenter.onCreate(savedInstanceState);
            mProgressDialog = new ProgressDialog(this);
        }
    }

    protected abstract void bindingDagger2(Bundle savedInstanceState);

    protected void showDialog(){
        mProgressDialog.setMessage("正在加载。。。");
        mProgressDialog.show();
    }
    protected void hideDialog(){
        if (mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }
}
