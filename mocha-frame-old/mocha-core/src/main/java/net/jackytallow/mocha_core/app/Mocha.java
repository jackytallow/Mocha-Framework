package net.jackytallow.mocha_core.app;

import android.content.Context;

import java.util.WeakHashMap;

/**
 * @author jacky
 * @version 1.0.0
 * @date 2020/3/22
 */
public final class Mocha {

    public static Configurator init(Context context) {
          getCofigurations().put(ConfigType.APPLICTION_CONTEXT.name(),context.getApplicationContext());
          return Configurator.getInstance();
    }

    public static WeakHashMap<String,Object> getCofigurations(){
        return Configurator.getInstance().getMochaConfigs();
    }


}
