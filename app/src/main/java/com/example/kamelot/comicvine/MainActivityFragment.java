package com.example.kamelot.comicvine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    private ArrayList<String> names;
    private ArrayAdapter<String> adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        ListView lv_Collections = (ListView) view.findViewById(R.id.lv_Collections);

        names= new ArrayList<>();

        adapter = new ArrayAdapter<>(
                getContext(),
                R.layout.collections_row,
                R.id.tv_name,
                names
        );
        lv_Collections.setAdapter(adapter);


        return view;
    }
}
