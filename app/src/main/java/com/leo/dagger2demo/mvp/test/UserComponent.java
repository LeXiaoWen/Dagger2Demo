package com.leo.dagger2demo.mvp.test;

import dagger.Component;

/**
 * Created by Leo on 2018/3/13.
 */
@Component(modules = UserModule.class)
public interface UserComponent {
    void inject(UserActivity activity);
}
