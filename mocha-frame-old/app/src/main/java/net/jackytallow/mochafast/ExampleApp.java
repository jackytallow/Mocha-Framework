package net.jackytallow.mochafast;

import android.app.Application;

import net.jackytallow.mocha_core.app.Mocha;

/**
 * @author jacky
 * @version 1.0.0
 * @date 2020/3/22
 */
public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Mocha.init(this)
                .withApiHost("http://127.0.0.1/")
                .configure();
    }
}
