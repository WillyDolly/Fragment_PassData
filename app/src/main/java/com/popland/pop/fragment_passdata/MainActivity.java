package com.popland.pop.fragment_passdata;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements Communicator{// interface get & transmit data among Main & Fragments
Button BTNcong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BTNcong = (Button)findViewById(R.id.BTNcong);
        BTNcong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentA fragmentA = (FragmentA) getFragmentManager().findFragmentById(R.id.fragmentA);
                fragmentA.cong();
            }
        });
    }


    @Override
    public void nhanDuLieu(String s) {
        FragmentB fragmentB = (FragmentB) getFragmentManager().findFragmentById(R.id.fragmentB);
        fragmentB.ketqua(s);
    }
}
