package com.example.chidi.livecodingapp2ndweek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * This is Dragos's Review and Andy
 */
public class MainActivity extends AppCompatActivity implements MyInterface{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void getData(String[] s) {
        FragmentTwo fragmentTwo = (FragmentTwo) getFragmentManager().findFragmentById(R.id.fragment2);

        fragmentTwo.grabData(s);
    }

    /*public void clickHandler(View view) {
        switch (view.getId()){
            case R.id.buttonLogin:


                Toast.makeText(this, username.getText().toString(),Toast.LENGTH_SHORT).show();


                break;
            case R.id.buttonCancel:
                Toast.makeText(this, "Cancel button clicked",Toast.LENGTH_SHORT).show();

                break;
        }
    }*/
}
