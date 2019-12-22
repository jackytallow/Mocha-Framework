package net.jackytallow.mocha_core.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.ContentFrameLayout;

import net.jackytallow.mocha_core.R;
import net.jackytallow.mocha_core.delegates.MochaDelegate;

import me.yokeyword.fragmentation.SupportActivity;

/**
 * @author jacky
 * @version 1.0.0
 * @date 2019/12/15
 */
public abstract class ProxyActivity extends SupportActivity {

    public abstract MochaDelegate setRootDelegate();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    /**
     * 入口
     * @param savedInstanceState
     */
    private void initContainer(@Nullable Bundle savedInstanceState){
       @SuppressLint("RestrictedApi")
       final ContentFrameLayout container = new ContentFrameLayout(this);
       container.setId(R.id.delegate_container);
       setContentView(container);

       //第一次加载
        if (savedInstanceState == null){
//            loadRootFragment(R.id.delegate_container,setRootDelegate());

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //垃圾回收
        System.gc();
        System.runFinalization();
    }
}
