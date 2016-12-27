package com.example.enclaveit.viewpaper.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.example.enclaveit.viewpaper.R;

/**
 * Created by enclaveit on 19/12/2016.
 */

public class Usa extends Fragment {

    /**
     * Declare widget android
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    private RadioGroup group;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewHirerarchy = inflater.inflate(R.layout.fr_usa,container,false);
        return viewHirerarchy;
    }
}
