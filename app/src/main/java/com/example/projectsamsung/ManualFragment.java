package com.example.projectsamsung;

import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ManualFragment extends Fragment {
    private int pageNumber;

    public static ManualFragment newInstance(int page) {
        ManualFragment fragment = new ManualFragment();
        Bundle args=new Bundle();
        args.putInt("num", page);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageNumber = getArguments() != null ? getArguments().getInt("num") : 1;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View result;
        if (pageNumber == 1) {
            result = inflater.inflate(R.layout.fragment_manual2, container, false);
            TextView text1 = result.findViewById(R.id.link1);
            text1.setText(R.string.link1);
            text1.setMovementMethod(LinkMovementMethod.getInstance());
            TextView text2 = result.findViewById(R.id.link2);
            text2.setText(R.string.link2);
            text2.setMovementMethod(LinkMovementMethod.getInstance());
            TextView text3 = result.findViewById(R.id.link3);
            text3.setText(R.string.link3);
            text3.setMovementMethod(LinkMovementMethod.getInstance());
            TextView text4 = result.findViewById(R.id.link4);
            text4.setText(R.string.link4);
            text4.setMovementMethod(LinkMovementMethod.getInstance());
            TextView text5 = result.findViewById(R.id.link5);
            text5.setText(R.string.link5);
            text5.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            result = inflater.inflate(R.layout.fragment_manual, container, false);
            TextView text = result.findViewById(R.id.displayText);
            if (pageNumber == 0) text.setText(getString(R.string.page1));
            else text.setText(getString(R.string.page3));
        }
        return result;
    }

}