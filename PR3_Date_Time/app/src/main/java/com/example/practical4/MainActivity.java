package com.example.practical4;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

@RequiresApi(api = Build.VERSION_CODES.N)
public class MainActivity extends AppCompatActivity {
    DatePickerDialog d1;
    TimePickerDialog t1;
    EditText e1,e2;
    Button b1,b2;
    int year, month, day,hour,minute;
    Calendar c = Calendar.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        hour = c.get(Calendar.HOUR_OF_DAY);
        minute = c.get(Calendar.MINUTE);
        year= c.get(Calendar.YEAR);
        month= c.get(Calendar.MONTH);
        day= c.get(Calendar.DAY_OF_MONTH);
        b1.setOnClickListener(view -> {

            d1 = new DatePickerDialog(this,
                    (datePicker, i, i1, i2) -> e1.setText(i2 + "/" + i1 + "/" + i),
                    year,
                    month,
                    day);
            d1.show();
        });
        b2.setOnClickListener(view -> {
            t1 = new TimePickerDialog(this,
                    (tp, sHour, sMinute) -> e2.setText(sHour + ":" + sMinute),
                    hour,
                    minute,
                    true);
            t1.show();
        });
    }
}