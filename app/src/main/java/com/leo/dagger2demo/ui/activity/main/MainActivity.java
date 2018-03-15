package com.leo.dagger2demo.ui.activity.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.leo.dagger2demo.R;
import com.leo.dagger2demo.bean.Student;

import javax.inject.Inject;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @Inject
    Student mStudent;

//    @BindView(R.id.b_student)
//    Button mBStudent;
//    @BindView(R.id.b_adapter)
//    Button mBAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        DaggerMainActivityComponent.create().inject(this);
    }


//    @OnClick({R.id.b_student, R.id.b_adapter})
//    public void onViewClicked(View view) {
//        switch (view.getId()) {
//            case R.id.b_student:
//                Toast.makeText(this, mStudent.toString(), Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.b_adapter:
//                startActivity(new Intent(MainActivity.this, TestActivity.class));
//                break;
//        }
//    }
}
