package net.jackytallow.mochafast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import net.jackytallow.mocha_core.activities.ProxyActivity;
import net.jackytallow.mocha_core.delegates.MochaDelegate;


public class MainActivity extends ProxyActivity {

    @Override
    public MochaDelegate setRootDelegate() {
        return new MainDelegate();
    }
}
