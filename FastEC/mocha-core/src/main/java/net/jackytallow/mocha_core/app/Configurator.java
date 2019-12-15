package net.jackytallow.mocha_core.app;


import java.util.WeakHashMap;

/**
 * 单例模式
 * @author jacky
 * @version 1.0.0
 * @date 2019/12/15
 */
public class Configurator {

    private static final WeakHashMap<String,Object> MOCHA_CONFIGS = new WeakHashMap<>();

    private Configurator(){
        MOCHA_CONFIGS.put(ConfigType.CONFIG_READY.name(),false);
    }

    public static Configurator getInstances(){
        return Holder.INSTANCE;
    }

    final WeakHashMap<String,Object> getMochaConfigs(){
        return MOCHA_CONFIGS;
    }

    private static class Holder{
        private static final Configurator INSTANCE = new Configurator();

    }


    public final void configure(){
        MOCHA_CONFIGS.put(ConfigType.CONFIG_READY.name(),true);
    }

    //配置API hOST
    public final Configurator withApiHost(String host){
        MOCHA_CONFIGS.put(ConfigType.API_HOST.name(),host);
        return this;
    }

    //检查
    private void checkConfiguration(){
        final boolean isReady = (boolean) MOCHA_CONFIGS.get(ConfigType.CONFIG_READY.name());
       //如果配置没有完成
        if (!isReady){
            throw new RuntimeException("Configuration is not ready,call configure");
        }
    }


    @SuppressWarnings("unchecked")
    final <T> T getConfiguration(Enum<ConfigType> key){
        checkConfiguration();
        return (T) MOCHA_CONFIGS.get(key.name());
    }
}
