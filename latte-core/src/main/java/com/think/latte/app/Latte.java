package com.think.latte.app;

import android.content.Context;

import java.util.HashMap;

/**
 * Created by yanqi on 2018/6/24 0024.
 */
public final class Latte {
    public static Configurator init(Context context) {

        Configurator.getInstance()
                .getLatteConfigs()
                .put(ConfigKeys.APPLICATION_CONTEXT, context.getApplicationContext());
        return Configurator.getInstance();

    }

    public static Configurator getConfigurator() {
        return Configurator.getInstance();
    }

    public static <T> T getConfiguration(Object key) {
        return getConfigurator().getConfiguration(key);
    }

    public static Context getApplicationContext() {
        return getConfiguration(ConfigKeys.APPLICATION_CONTEXT);
    }



}
