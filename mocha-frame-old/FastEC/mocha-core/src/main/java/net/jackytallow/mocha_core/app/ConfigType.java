package net.jackytallow.mocha_core.app;

/**
 * 枚举类：
 * 唯一单例，只能初始化一次
 * @author jacky
 * @version 1.0.0
 * @date 2019/12/15
 */
public enum ConfigType {
    //域名
    API_HOST,
    //全局上下文
    APPLICATION_CONTEXT,
    //初始化是否完成
    CONFIG_READY,
    //图标
    ICON
}
