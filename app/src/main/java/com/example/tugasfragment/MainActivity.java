package com.example.tugasfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private Boolean isFragmentDisplayed = false;
    private View fragmentStatis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.button);
        fragmentStatis = findViewById(R.id.fragment);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isFragmentDisplayed){
                    displayFragmet();
                }
                else {
                    closeFragment();
                }
            }
        });
    }

    public void closeFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentDinamis fragmentDinamis = (FragmentDinamis) fragmentManager.findFragmentById(R.id.fragment_container);
        if (fragmentDinamis != null){
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.remove(fragmentDinamis).commit();
        }
        fragmentStatis.setVisibility(View.VISIBLE);
        mButton.setText(R.string.open);
        isFragmentDisplayed = false;
    }

    public void displayFragmet() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentDinamis simpleFragment = FragmentDinamis.newInstance();
        fragmentTransaction.add(R.id.fragment_container, simpleFragment).addToBackStack(null).commit();
        isFragmentDisplayed = true;
        fragmentStatis.setVisibility(View.INVISIBLE);
        mButton.setText(R.string.close);
    }
}