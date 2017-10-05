package com.popland.pop.fragment_passdata;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by hai on 15/07/2016.
 */
public class FragmentA extends Fragment {
    Button BTNtru;
    int kq =0;
    Communicator communicator;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.a_fragment,container,false);
        BTNtru = (Button)v.findViewById(R.id.BTNtru);
        communicator = (Communicator) getActivity();
        BTNtru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tru();
            }
        });
        return v;
    }
    public void cong(){
        kq++;
        communicator.nhanDuLieu("ket qua: "+kq);//this interface will call its implementation in MainActivity
    }
    public void tru(){
        kq--;
        communicator.nhanDuLieu("kq :"+kq);
    }
}
