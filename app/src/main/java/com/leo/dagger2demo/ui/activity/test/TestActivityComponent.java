package com.leo.dagger2demo.ui.activity.test;

import dagger.Component;

/**
 * Created by Leo on 2017/7/24.
 */
@Component
public interface TestActivityComponent {
    void inject(TestActivity activity);
}
