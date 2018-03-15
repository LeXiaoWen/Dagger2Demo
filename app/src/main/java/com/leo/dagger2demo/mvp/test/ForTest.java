package com.leo.dagger2demo.mvp.test;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Leo on 2018/3/13.
 */

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface ForTest {
}
