package com.leo.dagger2demo.mvp.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.leo.dagger2demo.R;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class UserActivity extends AppCompatActivity {

    @Inject
    @Named("name")
    User user;


    @Inject
    @ForTest
    User user1;


    @BindView(R.id.user)
    Button mUser;

    @BindView(R.id.user1)
    Button mUser1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        ButterKnife.bind(this);
        DaggerUserComponent.create().inject(this);

    }

    @OnClick({R.id.user, R.id.user1})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.user:
                Toast.makeText(this, user.getName(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.user1:
                Toast.makeText(this, user1.getName(), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
