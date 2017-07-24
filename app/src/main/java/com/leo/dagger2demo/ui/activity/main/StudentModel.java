package com.leo.dagger2demo.ui.activity.main;

import com.leo.dagger2demo.bean.Student;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Leo on 2017/7/24.
 */

@Module
public class StudentModel {
    @Provides
    public Student getStudent(){
        Student student = new Student();
        student.setId(1);
        student.setAge(24);
        student.setName("Leo");
        student.setGender("male");
        return student;
    }
}
