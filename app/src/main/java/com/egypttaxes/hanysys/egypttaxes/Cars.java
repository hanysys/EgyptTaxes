package com.egypttaxes.hanysys.egypttaxes;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.EditText;

import java.util.Date;

/**
 * Created by hany on 09/10/2014.
 */
public class Cars extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars);
    }

    public void openDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public void calculateTaxes(View v){
        String modelYearValue = ((EditText) findViewById(R.id.modelYearId)).getText().toString();
        String ccValue = ((EditText) findViewById(R.id.ccValueId)).getText().toString();
        String dateOfPurchaseValue = ((EditText) findViewById(R.id.dateOfPurchaseId)).getText().toString();
        String dateOfReturnValue = ((EditText) findViewById(R.id.dateOfReturnId)).getText().toString();

        System.out.print("1234567890");
    }
}
