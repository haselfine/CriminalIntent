package com.example.criminalintent;

import android.content.Context;
import android.content.Intent;

import androidx.fragment.app.Fragment;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity {

    public static final String EXTRA_CRIME_ID = "com.example.android.criminalintent.crime_id";

    public static Intent newIntent(Context packageContext, UUID crimeID){
        Intent intent = new Intent(packageContext, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeID);
        return intent;
    }

    @Override
    protected Fragment createFragment(){
        UUID crimeID = (UUID) getIntent()
                .getSerializableExtra(EXTRA_CRIME_ID); //id of crime to send to fragment
        return CrimeFragment.newInstance(crimeID); //create fragment
    }
}
