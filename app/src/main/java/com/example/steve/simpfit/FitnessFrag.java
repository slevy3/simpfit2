package com.example.steve.simpfit;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by steve on 4/20/2016.
 */
public class FitnessFrag extends Fragment {

    TextView mTextView;
    String mString;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fitfrag, container, false);

        mTextView = (TextView) v.findViewById(R.id.user);
        mString = "Logged in as " + mTextView.getText().toString();
        mTextView.setText(mString);


        return v;

    }

}


