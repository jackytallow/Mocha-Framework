package net.jackytallow.mocha_core.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;

import net.jackytallow.mocha_core.R;
import net.jackytallow.mocha_core.delegates.MochaDelegate;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.ContentFrameLayout;
import me.yokeyword.fragmentation.SupportActivity;

/**
 * @author jacky
 * @version 1.0.0
 * @date 2020/3/22
 */
public abstract class ProxyActivity extends SupportActivity {

    public abstract MochaDelegate setRootDelegate();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initContainer(savedInstanceState);
    }

    private void initContainer(@Nullable Bundle savedInstanceState){
        @SuppressLint("RestrictedApi")
        final ContentFrameLayout container = new ContentFrameLayout(this);
        container.setId(R.id.delegate_container);

        setContentView(container);
        if (savedInstanceState == null){
            loadRootFragment(R.id.delegate_container,setRootDelegate());
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.gc();
        System.runFinalization();
    }
}
