package net.jackytallow.fastEC;


import net.jackytallow.mocha_core.activities.ProxyActivity;
import net.jackytallow.mocha_core.delegates.MochaDelegate;

public class ExampleActivity extends ProxyActivity{

    @Override
    public MochaDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}