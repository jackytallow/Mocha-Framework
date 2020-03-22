package net.jackytallow.mochafast;

import android.os.Bundle;
import android.view.View;

import net.jackytallow.mocha_core.delegates.MochaDelegate;

import androidx.annotation.Nullable;

/**
 * @author jacky
 * @version 1.0.0
 * @date 2020/3/22
 */
public class MainDelegate extends MochaDelegate {

    @Override
    public Object setLayout() {
        return R.layout.delegate_main;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }
}
