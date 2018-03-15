package com.leo.dagger2demo.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.leo.dagger2demo.R;
import com.leo.dagger2demo.mvp.base.BaseActivity;
import com.leo.dagger2demo.mvp.bean.TestData;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Leo on 2018/3/12.
 */

public class TestActivity extends BaseActivity<TestActivityPresenter> {
    @BindView(R.id.b_net)
    Button mBNet;
    @BindView(R.id.tv_home)
    TextView mTvHome;


    @Override
    protected void bindingDagger2(Bundle savedInstanceState) {
        DaggerTestActivityComponent.create().inject(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) throws RuntimeException {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.b_net)
    public void onViewClicked() {
        showDialog();
        //模拟网络请求
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                mPresenter.doNetWorking();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }


    public void showMsg(String subject) {
        runOnUiThread(() -> {
            Toast.makeText(TestActivity.this, subject, Toast.LENGTH_SHORT).show();
            hideDialog();
        });

    }

    public void bindViewHomeData(TestData.Data data) {
        runOnUiThread(() -> {
            mTvHome.setText(data.getSubject());
            hideDialog();
        });

    }


}
