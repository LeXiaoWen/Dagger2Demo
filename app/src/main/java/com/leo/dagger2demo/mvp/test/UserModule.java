package com.leo.dagger2demo.mvp.test;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Leo on 2018/3/13.
 */

@Module
public class UserModule {

    @Provides
    @Named("name")
    User provideUser(){
        return new User("user");
    }


    @Provides
    @ForTest
    User provideUser1(){
        return new User("user1");
    }

//    @Provides
//    String provideUserName(@ForTest User user){
//        return user.getName();
//    }

}
