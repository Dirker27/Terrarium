package com.toastercat.android.terrarium;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class SceneFragment extends Fragment {

    private View mTerrariumView;

    public static Fragment newInstance() {
        return new SceneFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scene, container, false);

        this.mTerrariumView = view.findViewById(R.id.view_terrarium);
        int terrariumWidth = this.mTerrariumView.getWidth();
        int terrariumHeight = this.mTerrariumView.getHeight();

        return view;
    }


}
