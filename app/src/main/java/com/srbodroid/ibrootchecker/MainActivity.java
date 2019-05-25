package com.srbodroid.ibrootchecker;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.scottyab.rootbeer.RootBeer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RootBeer rootBeer = new RootBeer(this);
        TextView tv = findViewById(R.id.ibrovan);
        if (rootBeer.isRooted()) {
            tv.setText(getString(R.string.rooted));
        } else {
            tv.setText(getString(R.string.not_rooted));
        }

    }
}
