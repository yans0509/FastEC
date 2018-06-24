package com.think.latte.app;

import java.util.WeakHashMap;

/**
 * Created by yanqi on 2018/6/24 0024.
 */
public class Configurator {
    private static final WeakHashMap<String, Object> LATTE_CONFIGS = new WeakHashMap<>();
    private Configurator(){
        LATTE_CONFIGS.put(ConfigType.CONFIG_READY.name(),false);
    }
    //静态内部类实现单例
    public static Configurator getInstance(){
        return Holder.INSTANCE;
    }
    final WeakHashMap<String, Object> getLatteConfigs(){
        return LATTE_CONFIGS;
    }
    private static class Holder{
        private static final Configurator INSTANCE = new Configurator();
    }
    public final void configure(){
        LATTE_CONFIGS.put(ConfigType.CONFIG_READY.name(),true);
    }
    public final Configurator withApiHost(String host){
        LATTE_CONFIGS.put(ConfigType.API_HOST.name(),host);
        return this;
    }
    private void checkConfiguration(){
        final boolean isReady = (boolean)LATTE_CONFIGS.get(ConfigType.CONFIG_READY.name());
        if(!isReady){
            throw new RuntimeException("Configuration is not ready, call configure");
        }
    }
    @SuppressWarnings("unchecked")
    final <T> T getConfiguration(Enum<ConfigType> key){
        checkConfiguration();
        return (T)LATTE_CONFIGS.get(key.name());
    }


}
