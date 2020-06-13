package net.jackytallow.mocha.example;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import net.jackytallow.mocha.R;
import net.jackytallow.mocha_core.delegates.MochaDelegate;

/**
 * @author jacky
 * @version 1.0.0
 * @date 2020/6/13
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
