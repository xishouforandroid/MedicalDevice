package com.highjump.medicaldevice;

import android.os.Bundle;

public class UserInfoActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);

        // 初始化toolbar
        initToolbar();
    }
}
