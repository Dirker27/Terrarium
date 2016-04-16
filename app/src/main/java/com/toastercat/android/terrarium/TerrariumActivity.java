package com.toastercat.android.terrarium;

import android.support.v4.app.Fragment;

public class TerrariumActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return SceneFragment.newInstance();
    }
}
