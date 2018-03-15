package com.leo.dagger2demo.mvp.base;

import android.os.Bundle;

import javax.inject.Inject;

/**
 * Created by Leo on 2018/3/12.
 */

public abstract class BasePresenter<A extends BaseActivity, M extends BaseModel> {

    protected A mActicity;
    @Inject
    protected M mModel;

    public void setActivity(A acticity) {
        this.mActicity = acticity;
    }

    @Inject
    public void setPresenter() {
        this.mModel.setPresenter(this);
    }


    public void onCreate(Bundle savedInstanceState) {

    }

}
