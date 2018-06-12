package com.coto.cesar.gardenaplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marcinmoskala.arcseekbar.ArcSeekBar;


public class HomeFragment extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ArcSeekBar arcSeekBar = view.findViewById(R.id.seekTemperatura);

        arcSeekBar.setProgressGradient(R.color.colorPrimary, R.color.medium_gray, R.color.cardview_dark_background);

        return view;
    }

}
