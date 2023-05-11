package sg.edu.rp.c346.id21017809.week04;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    Button btnReset;
    TextView tvDisplay;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.btnDisplayDate);
        btnDisplayTime = findViewById(R.id.btnDisplayTime);
        btnReset = findViewById(R.id.btnReset);
        tvDisplay = findViewById(R.id.textViewDisplay);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp.setIs24HourView(true);
                int h = tp.getHour();
                int m = tp.getMinute();
                tvDisplay.setText("Time is " + h + ":" + m);
            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int d = dp.getDayOfMonth();
                int m = dp.getMonth();
                int y = dp.getYear();
                if (d < 10) {
                    tvDisplay.setText("Date is 0" + d + "/" + (m+1) + "/" + y);
                }
                else if (m < 10) {
                    tvDisplay.setText("Date is " + d + "/0" + (m+1) + "/" + y);
                }
                else if (d < 10 && m < 10) {
                    tvDisplay.setText("Date is 0" + d + "/0" + (m+1) + "/" + y);
                }
                else {
                    tvDisplay.setText("Date is " + d + "/" + (m+1) + "/" + y);
                }


            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//IDK THIS SO WE COME BACK LATER
            }
        });



    }
}