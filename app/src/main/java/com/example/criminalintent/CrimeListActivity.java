package com.example.criminalintent;

import android.content.Context;
import android.content.Intent;

import androidx.fragment.app.Fragment;

import java.util.UUID;

public class CrimeListActivity extends SingleFragmentActivity {



    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
