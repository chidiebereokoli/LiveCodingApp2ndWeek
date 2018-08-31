package com.example.chidi.livecodingapp2ndweek;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentTwo extends Fragment {

    TextView display;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container,false);

        display = view.findViewById(R.id.displayTV);



        return view;
    }

    public void grabData(String[] s){

        display.setText(s[0] + "\n" + s[1]);
    }
}
