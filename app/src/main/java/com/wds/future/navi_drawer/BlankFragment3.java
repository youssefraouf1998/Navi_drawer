package com.wds.future.navi_drawer;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment3 extends Fragment {
//;in;ikjm;jml/n;jn


    public BlankFragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if(container != null)container.removeAllViews();

        return inflater.inflate(R.layout.fragment_blank_fragment3, container, false);
    }

}
