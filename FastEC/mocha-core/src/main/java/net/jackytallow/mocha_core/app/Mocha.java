package net.jackytallow.mocha_core.app;

import android.content.Context;

import java.util.WeakHashMap;

/**
 * @author jacky
 * @version 1.0.0
 * @date 2019/12/15
 */
public final class Mocha {

    public static Configurator init(Context context){
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(),context.getApplicationContext());
        return Configurator.getInstances();
    }

    private static WeakHashMap<String,Object> getConfigurations(){
        return Configurator.getInstances().getMochaConfigs();
    }
}
