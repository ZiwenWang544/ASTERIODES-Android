package com.example.asteroides;

import android.app.Activity;
import android.content.Context;
import android.icu.lang.UCharacter;
import android.os.Bundle;
import android.preference.PreferenceFragment;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

public class Preferencias extends Activity {
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(android.R.id.content, new MyprefenceFragment()).commit();
        //context=this;
        //getFragmentManager().beginTransaction().replace(android.R.id.content, new MyprefenceFragment()).commit();

    }
    public static class MyprefenceFragment extends PreferenceFragment{
         @Override
        public void onCreate(final Bundle savedInstanceState){
             super.onCreate(savedInstanceState);
             addPreferencesFromResource(R.xml.preferencias);
         }
    }
}
