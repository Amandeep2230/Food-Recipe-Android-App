package com.example.recipehub.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.recipehub.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragments extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel pageViewModel;

    public static PlaceholderFragments newInstance(int index) {
        PlaceholderFragments fragment = new PlaceholderFragments();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = null;
        switch (getArguments().getInt(ARG_SECTION_NUMBER))
        {
            case 1:
                rootView = inflater.inflate(R.layout.fragment_spring1, container, false);
                break;
            case 2:
                rootView = inflater.inflate(R.layout.fragment_spring2, container, false);
                break;
        }

        return rootView;
    }
}