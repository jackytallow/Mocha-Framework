package net.jackytallow.fastEC;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import net.jackytallow.mocha_core.delegates.MochaDelegate;

/**
 * @author jacky
 * @version 1.0.0
 * @date 2020/1/4
 */
public class ExampleDelegate extends MochaDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
    }
}
