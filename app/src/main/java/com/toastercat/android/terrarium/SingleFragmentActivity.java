package com.toastercat.android.terrarium;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * An Activity that manages a single UI Fragment.
 */
public abstract class SingleFragmentActivity extends AppCompatActivity {
    private FragmentManager mFragmentManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        this.mFragmentManager = this.getSupportFragmentManager();

        Fragment fragment = this.mFragmentManager.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = this.createFragment();
            this.mFragmentManager.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }

    protected abstract Fragment createFragment();
}
