package com.om.fontandotherthings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner dropdown = findViewById(R.id.dropdown);
        String[] dropdownData = new String[]{"Hiii","hello","nothing","kya","ho rha h"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,dropdownData);
        dropdown .setAdapter(adapter);

        AutoCompleteTextView autocomplete = findViewById(R.id.autoComplete);
        String[] data = {"iphone","ipsad","mac","imac","apple","AppleWatch","appleTv","airpods"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,data);
        autocomplete.setAdapter(adapter1);

        CheckBox checkbox = findViewById(R.id.checkBox);
        if(checkbox.isChecked())
        {
            //checked
        }
        else
        {
            //not checked
        }

        RadioGroup rdbGroup = findViewById(R.id.rdg);
        int selectedbtnId = rdbGroup.getCheckedRadioButtonId();
        RadioButton rdbselectedbtn = findViewById(selectedbtnId);



    }

}