package com.think.latte.app;

import android.content.Context;

import java.util.WeakHashMap;

/**
 * Created by yanqi on 2018/6/24 0024.
 */
public final class Latte {
    public static Configurator init(Context context) {
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(),context.getApplicationContext());
        return Configurator.getInstance();

    }
    private static WeakHashMap<String,Object> getConfigurations(){
        return Configurator.getInstance().getLatteConfigs();
    }
}
