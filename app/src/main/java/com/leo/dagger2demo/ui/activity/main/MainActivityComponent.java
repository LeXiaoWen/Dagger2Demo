package com.leo.dagger2demo.ui.activity.main;

import dagger.Component;

/**
 * Created by Leo on 2017/7/24.
 */

@Component(modules = StudentModel.class)
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}
