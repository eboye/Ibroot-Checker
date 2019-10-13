package com.srbodroid.ibrootchecker;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

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
