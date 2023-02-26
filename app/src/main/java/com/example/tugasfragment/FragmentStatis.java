package com.example.tugasfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentStatis#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentStatis extends Fragment {

    public FragmentStatis() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        final View rootView = inflater.inflate(R.layout.fragment_statis, container, false);
//        return rootView;
        return inflater.inflate(R.layout.fragment_statis, container, false);
    }
}