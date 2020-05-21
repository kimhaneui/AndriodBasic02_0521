package com.example.andriodbasic02_0521;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.andriodbasic02_0521.databinding.ActivityUserBinding;

import java.util.Calendar;

public class UserActivity extends BaseActivity {

    ActivityUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_user);

        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

        String name = getIntent().getStringExtra("userName");
        int birthYear = getIntent().getIntExtra("userBirth",-1);

//        생년으로 나이구하는 식
        int age = Calendar.getInstance().get(Calendar.YEAR)-birthYear+1;

        binding.userInfoTxt.setText(String.format("%s(%d세)",name,age));
    }
}
