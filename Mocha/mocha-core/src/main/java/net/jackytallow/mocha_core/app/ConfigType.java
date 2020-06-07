package net.jackytallow.mocha_core.app;


/**
 * @author jacky
 * @version 1.0.0
 * @date 2020/6/7
 * 线程安全的懒汉模式，只能够被初始化一次
 */
public enum ConfigType {
    API_HOST,
    APPLICATION_CONTEXT,
    CONFIG_READY,
    ICON
}
