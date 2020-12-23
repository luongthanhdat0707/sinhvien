package com.example.appsinhvien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class NhapActivity extends AppCompatActivity {

    EditText edtmaso,edthoten,edtdc;
    RadioButton rdnam,rdnu;
    Button btnthoat,btnluu;
    DBHelper dbHelper;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhap);

        edtmaso= (EditText) findViewById(R.id.edtms);
        edthoten = (EditText) findViewById(R.id.edtten);
        edtdc = (EditText) findViewById(R.id.edtdc);
        rdnam = (RadioButton)

    }
}
