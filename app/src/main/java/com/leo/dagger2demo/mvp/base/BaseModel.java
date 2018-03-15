package com.leo.dagger2demo.mvp.base;

/**
 * Created by Leo on 2018/3/12.
 */

public abstract class BaseModel<P extends BasePresenter> {

    protected  P mPresenter;

    public void setPresenter(P presenter) {
        mPresenter = presenter;
    }


}
