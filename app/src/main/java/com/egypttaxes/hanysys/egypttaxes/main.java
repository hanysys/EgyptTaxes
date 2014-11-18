package com.egypttaxes.hanysys.egypttaxes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startCarsTaxesActivity(View v) {
        startActivity(new Intent("com.egypttaxes.hanysys.egypttaxes.Cars"));
    }

    public void startAboutActivity(View v) {
        startActivity(new Intent("com.egypttaxes.hanysys.egypttaxes.About"));
    }

    public void startSettingsActivity(View v) {
        startActivity(new Intent("com.egypttaxes.hanysys.egypttaxes.Settings"));
    }
}
