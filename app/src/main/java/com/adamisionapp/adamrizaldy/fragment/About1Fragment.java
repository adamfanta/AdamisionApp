package com.adamisionapp.adamrizaldy.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.adamisionapp.adamrizaldy.R;

/** 10116295 ADAM ARIS RIZALDY*/


public class About1Fragment extends Fragment {


    public About1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about1, container, false);
    }

    public interface OnFragmentInteractionListener {
    }
}
