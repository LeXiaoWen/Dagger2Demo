package com.leo.dagger2demo.mvp;

import dagger.Component;

/**
 * Created by Leo on 2018/3/12.
 */
@Component
public interface TestActivityComponent {
    void inject(TestActivity activity);
}
