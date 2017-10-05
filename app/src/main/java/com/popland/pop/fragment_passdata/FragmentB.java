package com.popland.pop.fragment_passdata;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by hai on 15/07/2016.
 */
public class FragmentB extends Fragment {
    TextView TVb;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.b_fragment,container,false);
        TVb = (TextView)v.findViewById(R.id.TVb);
        return v;
    }
    public void ketqua(String kq){
        TVb.setText(kq);
    }
}
