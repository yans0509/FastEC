package com.think.fastec.example;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.think.fastec.R;
import com.think.latte.app.Latte;
import com.think.latte.ec.icon.FontEcModule;
import com.think.latte.net.interceptors.DebugInterceptor;

/**
 * Created by yanqi on 2018/6/24 0024.
 */
public class ExampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withLoaderDelayed(1000)
                .withApiHost("http://127.0.0.1/")
                .withInterceptor(new DebugInterceptor("index", R.raw.test))
                .configure();
    }
}
