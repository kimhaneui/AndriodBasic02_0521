package com.example.andriodbasic02_0521;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

public abstract class BaseActivity extends AppCompatActivity {
//상속만을 위해 존재하는 액티비티 따라서 abstract(실제 액티비티가 아님)

//    어느화면인지 알려주는 변수 만들고 this로대입
    public Context mContext = this;


//    자주구현하는 매소드=> 추상메소드로  정의
    public abstract void setupEvents();
    public abstract void setValues();
}
