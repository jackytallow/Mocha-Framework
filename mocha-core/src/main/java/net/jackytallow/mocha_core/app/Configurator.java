package net.jackytallow.mocha_core.app;

import android.graphics.Bitmap;

import java.util.WeakHashMap;

/**
 * @author jacky
 * @version 1.0.0
 * @date 2020/3/22
 * 配置文件存储以及获取
 */
public class Configurator {

    private static final WeakHashMap<String, Object> MOCHA_CONFIGS = new WeakHashMap<>();

    private Configurator() {
        MOCHA_CONFIGS.put(ConfigType.CONFIG_READY.name(), false);
    }

    public static Configurator getInstance() {
        return Holder.INSTANCE;
    }

    final WeakHashMap<String, Object> getMochaConfigs() {
        return MOCHA_CONFIGS;
    }

    private static class Holder {
        private static final Configurator INSTANCE = new Configurator();
    }

    public final void configure() {
        MOCHA_CONFIGS.put(ConfigType.CONFIG_READY.name(), true);
    }

    public final Configurator withApiHost(String host) {
        MOCHA_CONFIGS.put(ConfigType.CONFIG_READY.name(), true);
        return this;
    }

    private void checkConfiguration() {
        final boolean isReady = (boolean) MOCHA_CONFIGS.get(ConfigType.CONFIG_READY.name());
        if (!isReady){
           throw new RuntimeException("Configuration is not ready , call configure");
        }
    }

    //保证正确性和完整性
    @SuppressWarnings("unchecked")
    final <T> T getCofiguration(Enum<ConfigType> key){
        checkConfiguration();
        return (T) MOCHA_CONFIGS.get(key.name());
    }

}
