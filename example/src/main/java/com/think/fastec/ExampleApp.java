package com.think.fastec;

import android.app.Application;

import com.think.latte.app.Latte;

/**
 * Created by yanqi on 2018/6/24 0024.
 */
public class ExampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withApiHost("http://127.0.0.1/")
                .configure();
    }
}
