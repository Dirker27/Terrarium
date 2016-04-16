package com.toastercat.android.terrarium;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class SceneFragment extends Fragment {

    private View mSceneView;
    private View mTerrariumView;
    private View mLawnView;

    private int mBackgroundStart;
    private int mBackgroundEnd;

    public static Fragment newInstance() {
        return new SceneFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scene, container, false);

        this.mSceneView = view.findViewById(R.id.view_scene_container);
        this.mTerrariumView = view.findViewById(R.id.view_terrarium);
        this.mLawnView = view.findViewById(R.id.component_lawn);
        int terrariumWidth = this.mTerrariumView.getWidth();
        int terrariumHeight = this.mTerrariumView.getHeight();

        Resources resources = getResources();
        this.mBackgroundStart = resources.getColor(R.color.background);
        this.mBackgroundEnd = resources.getColor(R.color.colorPrimary);

        this.mSceneView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animate();
            }
        });

        return view;
    }

    private void animate() {
        ObjectAnimator sunsetColorAnimator = ObjectAnimator
                .ofInt(this.mSceneView, "backgroundColor", this.mBackgroundStart, this.mBackgroundEnd)
                .setDuration(3000);
        sunsetColorAnimator.setEvaluator(new ArgbEvaluator());

        sunsetColorAnimator.start();
    }
}
