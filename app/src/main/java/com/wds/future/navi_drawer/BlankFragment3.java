package com.wds.future.navi_drawer;


import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment3 extends Fragment {

    private RecyclerView recyclerView;
    private recycle_view_adapter recyclerviewaAdapter;
    public List<data> listItems;
    private TextView tv;

    public BlankFragment3() {
        // Required empty public constructor
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank_fragment3, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.rec);
        recyclerView.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);

        listItems = new ArrayList<>();

        listItems.add(new data(R.drawable.bur1,"Beef","new Meal with good price and fresh"));
        listItems.add(new data(R.drawable.bur2,"Chicken","new Meal with good price and fresh "));
        listItems.add(new data(R.drawable.bur3,"Fish","new Meal with good price and fresh "));
        listItems.add(new data(R.drawable.bur4,"Bundle Meals","new Meal with good price and fresh "));
        listItems.add(new data(R.drawable.bur2,"Sides","new Meal with good price and fresh "));
        listItems.add(new data(R.drawable.bur1,"vgde","new Meal with good price and fresh "));




        recyclerviewaAdapter= new recycle_view_adapter(listItems, getActivity());
        recyclerView.setAdapter(recyclerviewaAdapter);


        return  view;

    }
}
