package com.faramarz.tictacdev.dateandcalendarsample.persian_calendar;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.faramarz.tictacdev.dateandcalendarsample.R;
import ir.hamsaa.persiandatepicker.Listener;
import ir.hamsaa.persiandatepicker.PersianDatePickerDialog;
import ir.hamsaa.persiandatepicker.util.PersianCalendar;

public class PersianDateSample1Activity extends AppCompatActivity {

    PersianDatePickerDialog picker;
    TextView txtDate;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persian_date_sample1);
        txtDate = findViewById(R.id.txtDate);

      /* PersianCalendar initDate = new PersianCalendar();
        initDate.setPersianDate(1370, 3, 13);
        picker.setInitDate(initDate);*/

    }

    public void showCalendar(View view) {
        picker = new PersianDatePickerDialog(this)
                .setPositiveButtonString("باشه")
                .setNegativeButton("بیخیال")
                .setTodayButton("امروز")
                .setTodayButtonVisible(true)
                .setMinYear(1300)
                .setMaxYear(PersianDatePickerDialog.THIS_YEAR)
                // .setMaxYear(1500)
                .setActionTextColor(Color.GRAY)
                // .setTypeFace(typeface)

                .setListener(new Listener() {
                    @Override
                    public void onDateSelected(PersianCalendar persianCalendar) {
                        txtDate.setText(persianCalendar.getPersianYear() + "/" + persianCalendar.getPersianMonth() + "/" + persianCalendar.getPersianDay());
                    }
                    @Override
                    public void onDismissed() {

                    }
                });

        picker.show();
    }


}
