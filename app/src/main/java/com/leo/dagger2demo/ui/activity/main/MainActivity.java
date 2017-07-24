package com.leo.dagger2demo.ui.activity.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.leo.dagger2demo.R;
import com.leo.dagger2demo.bean.Student;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Inject
    Student mStudent;

    @BindView(R.id.b_student)
    Button mBStudent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        DaggerMainActivityComponent.create().inject(this);
    }


    @OnClick(R.id.b_student)
    public void onViewClicked() {
        Toast.makeText(this, mStudent.toString(), Toast.LENGTH_SHORT).show();
    }
}
