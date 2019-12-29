# DatePickers  

<p align="center">
  <img src="https://cdn.jsdelivr.net/npm/react-native-datepicker-modal@1.3.0/android-example.png"
   height=300 height=140/> 
</p>

```java
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
```

When you want to show dialog:  
```java
  dialogfragment = new DatePickerDialogTheme1();
  dialogfragment.show(getSupportFragmentManager(), "Theme 1");
```

