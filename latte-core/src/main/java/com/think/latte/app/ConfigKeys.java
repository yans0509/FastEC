package com.think.latte.app;

/**
 * Created by yanqi on 2018/6/24 0024.
 * 多线程操作时，使用枚举实现安全、惰性单例初始化
 * 线程安全的懒汉模式
 */
public enum ConfigKeys {
    API_HOST,//网络请求域名
    APPLICATION_CONTEXT,//全局上下文
    CONFIG_READY,//控制初始化、配置是否完成
    ICON,//其他初始化项目
    LOADER_DELAYED,
    INTERCEPTOR
}
