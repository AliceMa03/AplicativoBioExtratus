package com.example.infcomercial4.bioextratus.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ListView;

import com.example.infcomercial4.bioextratus.adapters.ProductAdapter;
import com.example.infcomercial4.bioextratus.interfaces.OnItemSelectedListener;
import com.example.infcomercial4.bioextratus.model.ProductModel;

import java.util.ArrayList;

public class ProductListFragment extends ListFragment {

    private ArrayList<ProductModel> list;
    private ProductAdapter adp;

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        ArrayList<ProductModel> dataSource = dataSource = (ArrayList<ProductModel>)getArguments().getSerializable("dataSource");
        adp = new ProductAdapter(getActivity(), dataSource);
        setListAdapter(adp);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Activity activity = getActivity();
        if (activity instanceof OnItemSelectedListener){
            String value = (String)l.getItemAtPosition(position);
            OnItemSelectedListener handler = (OnItemSelectedListener)activity;
            handler.select(value);
        }
    }
}
