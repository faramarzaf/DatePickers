package com.faramarz.tictacdev.dateandcalendarsample;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import com.faramarz.tictacdev.dateandcalendarsample.persian_calendar.PersianDateSample1Activity;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2, button3, button4, button5, button6;
    DialogFragment dialogfragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bind();
        clickEvents();
    }

    private void bind() {
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
    }

    private void clickEvents() {
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                dialogfragment = new DatePickerDialogTheme1();
                dialogfragment.show(getSupportFragmentManager(), "Theme 1");

                break;
            case R.id.button2:
                dialogfragment = new DatePickerDialogTheme2();
                dialogfragment.show(getSupportFragmentManager(), "Theme 2");
                break;
            case R.id.button3:
                dialogfragment = new DatePickerDialogTheme3();
                dialogfragment.show(getSupportFragmentManager(), "Theme 3");
                break;
            case R.id.button4:
                dialogfragment = new DatePickerDialogTheme4();
                dialogfragment.show(getSupportFragmentManager(), "Theme 4");
                break;
            case R.id.button5:
                dialogfragment = new DatePickerDialogTheme5();
                dialogfragment.show(getSupportFragmentManager(), "Theme 5");
                break;

            case R.id.button6:
                startActivity(new Intent(this, PersianDateSample1Activity.class));
                break;
        }
    }


    public static class DatePickerDialogTheme1 extends DialogFragment implements DatePickerDialog.OnDateSetListener {
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            final Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog datepickerdialog = new DatePickerDialog(getActivity(), AlertDialog.THEME_DEVICE_DEFAULT_DARK, this, year, month, day);

            return datepickerdialog;
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            TextView textview = getActivity().findViewById(R.id.textView1);
            textview.setText(day + ":" + (month + 1) + ":" + year);

        }
    }

    public static class DatePickerDialogTheme2 extends DialogFragment implements DatePickerDialog.OnDateSetListener {
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            final Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog datepickerdialog = new DatePickerDialog(getActivity(), AlertDialog.THEME_DEVICE_DEFAULT_LIGHT, this, year, month, day);
            return datepickerdialog;
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {

            TextView textview = getActivity().findViewById(R.id.textView1);
            textview.setText(day + ":" + (month + 1) + ":" + year);

        }
    }

    public static class DatePickerDialogTheme3 extends DialogFragment implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            final Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datepickerdialog = new DatePickerDialog(getActivity(), AlertDialog.THEME_HOLO_DARK, this, year, month, day);
            return datepickerdialog;
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            TextView textview = getActivity().findViewById(R.id.textView1);
            textview.setText(day + ":" + (month + 1) + ":" + year);

        }
    }

    public static class DatePickerDialogTheme4 extends DialogFragment implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            final Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog datepickerdialog = new DatePickerDialog(getActivity(), AlertDialog.THEME_HOLO_LIGHT, this, year, month, day);
            return datepickerdialog;
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            TextView textview = getActivity().findViewById(R.id.textView1);
            textview.setText(day + ":" + (month + 1) + ":" + year);
        }
    }

    public static class DatePickerDialogTheme5 extends DialogFragment implements DatePickerDialog.OnDateSetListener {
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            final Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog datepickerdialog = new DatePickerDialog(getActivity(), AlertDialog.THEME_TRADITIONAL, this, year, month, day);
            return datepickerdialog;
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            TextView textview = getActivity().findViewById(R.id.textView1);
            textview.setText(day + ":" + (month + 1) + ":" + year);
        }

    }

}
