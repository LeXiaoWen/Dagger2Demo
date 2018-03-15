package com.leo.dagger2demo.mvp;

import android.util.Log;

import com.leo.dagger2demo.mvp.base.BasePresenter;
import com.leo.dagger2demo.mvp.bean.TestData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;


/**
 * Created by Leo on 2018/3/12.
 */

public class TestActivityPresenter extends BasePresenter<TestActivity, TestActivityModel> {

    private static final String TAG = "TestActivityPresenter";
    @Inject
    public TestActivityPresenter() {
    }


    public void doNetWorking() {
        // TODO: 2018/3/15 模拟网络请求 start
        List<TestData> list = new ArrayList<>();

        TestData testData1 = new TestData();

        TestData.Data data1 = new TestData.Data();
        data1.setSubject("广告栏数据");
        data1.setPicUrl("http://www.baidu.com/");

        testData1.setData(data1);
        testData1.setType("banner");


        TestData testData2 = new TestData();

        TestData.Data data2 = new TestData.Data();
        data2.setSubject("主页数据");
        data2.setPicUrl("http://www.baidu.com/");

        testData2.setData(data2);
        testData2.setType("home");


        list.add(testData1);
        list.add(testData2);
        // TODO: 2018/3/15  模拟网络请求 end

        // TODO: 2018/3/15 在model层处理数据 start

        mModel.parseData(list);

        // TODO: 2018/3/15 在model层处理数据 end

    }


    public void onBannerData(TestData.Data banner) {
        String subject = banner.getSubject();

        mActicity.showMsg(subject);
    }


    public void onHomeData(TestData.Data home) {
        String subject = home.getSubject();
        String picUrl = home.getPicUrl();
        mActicity.bindViewHomeData(home);
    }
}
