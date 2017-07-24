package com.leo.dagger2demo.ui.activity.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import com.leo.dagger2demo.R;
import com.leo.dagger2demo.ui.activity.test.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TestActivity extends AppCompatActivity {


    @BindView(R.id.b_test)
    Button mBTest;
    @BindView(R.id.rv_test)
    RecyclerView mRvTest;

    @Inject
    MyAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.b_test)
    public void onViewClicked() {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            list.add("这是第  " + (i+1)  + "  条数据！");
        }

        DaggerTestActivityComponent.create().inject(this);
        mAdapter.setContext(this);
        mAdapter.setList(list);

        mRvTest.setLayoutManager(new LinearLayoutManager(this));
        mRvTest.setHasFixedSize(true);

        mRvTest.setAdapter(mAdapter);

    }
}
