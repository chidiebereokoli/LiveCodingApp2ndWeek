package com.example.chidi.livecodingapp2ndweek;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

//
//////
public class FragmentOne extends Fragment {

    MyInterface myInterface;
    EditText username, password;
    Button login;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        myInterface = (MyInterface) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container,false);
        username = view.findViewById(R.id.username);
        password = view.findViewById(R.id.password);
        login = view.findViewById(R.id.buttonLogin);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] s = new String[2];
                s[0] = username.getText().toString();
                s[1] = password.getText().toString();

                myInterface.getData(s);



            }
        });




        return view;



    }


}
