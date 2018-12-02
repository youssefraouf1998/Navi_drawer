package com.wds.future.navi_drawer;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.zip.Inflater;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment10 extends Fragment {

    Spinner spiner1,spinner2;
    public BlankFragment10() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View v= inflater.inflate(R.layout.fragment_blank_fragment10, container, false);

        spiner1=(Spinner)v.findViewById(R.id.sp1);
        spinner2=(Spinner)v.findViewById(R.id.sp2);
        String []lang={"arbic","english-usa","china","indian"};
        String []coun={"India","australia","america","britian","eygpt","iralanda","mosco"};
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_dropdown_item,lang);
        ArrayAdapter<String>adapter2=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_dropdown_item,coun);

        if(container != null)container.removeAllViews();


         return v;
    }

}
