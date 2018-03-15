package com.leo.dagger2demo.mvp;

import com.leo.dagger2demo.mvp.base.BaseModel;
import com.leo.dagger2demo.mvp.bean.TestData;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by Leo on 2018/3/12.
 */

public class TestActivityModel extends BaseModel<TestActivityPresenter> {


    private String banner = "banner";
    private String home = "home";


    @Inject
    public TestActivityModel() {
    }

    public void parseData(List<TestData> list) {
        // TODO: 2018/3/15 处理完数据返回给Presenter层

        for (TestData testData : list) {
            String type = testData.getType();
            TestData.Data data = testData.getData();
            if (type.equals(banner)) {
                mPresenter.onBannerData(data);
            } else if (type.equals(home)) {
                mPresenter.onHomeData(data);
            }else {
                // TODO: 2018/3/15 其他。。。
            }
        }


    }
}
