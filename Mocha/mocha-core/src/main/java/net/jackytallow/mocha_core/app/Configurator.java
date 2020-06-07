package net.jackytallow.mocha_core.app;

import java.util.WeakHashMap;

/**
 * @author jacky
 * @version 1.0.0
 * @date 2020/6/7
 */
public class Configurator {

    private static final WeakHashMap<String, Object> MOCHA_CONFIGS = new WeakHashMap<>();

    private Configurator() {
        //配置开始了，但是没有完成
        MOCHA_CONFIGS.put(ConfigType.CONFIG_READY.name(), false);
    }


    //为线程安全的懒汉模式
    public static Configurator getInstance() {
        return Holder.INSTANCE;
    }


    final WeakHashMap<String, Object> getMochaConfigs() {
        return MOCHA_CONFIGS;
    }

    //静态内部类
    private static class Holder {
        private static final Configurator INSTANCE = new Configurator();
    }

    public final void configure() {
        MOCHA_CONFIGS.put(ConfigType.CONFIG_READY.name(), true);
    }


    public final Configurator withApiHost(String host) {
        MOCHA_CONFIGS.put(ConfigType.API_HOST.name(), true);
        return this;
    }

    //检查配置项是否完成
    private void checkConfiguration() {
        final boolean isReady = (boolean) MOCHA_CONFIGS.get(ConfigType.CONFIG_READY.name());
        if (!isReady) {
            throw new RuntimeException("Configuration is not ready,call configure");
        }
    }

    @SuppressWarnings("unchecked")
    final <T> T getConfiguration(Enum<ConfigType> key) {
        checkConfiguration();
        return (T) MOCHA_CONFIGS.get(key.name());
    }
}
