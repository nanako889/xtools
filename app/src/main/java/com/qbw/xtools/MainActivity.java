package com.qbw.xtools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = findViewById(R.id.tv);
        String text = XTools.getHourMinuteSecondVideoDuration(1000);
        mTextView.setText(text);

        text = XTools.getHourMinuteSecondVideoDuration(10);
        mTextView.setText(mTextView.getText() + "\n" + text);

        text = XTools.getHourMinuteSecondVideoDuration(10000);
        mTextView.setText(mTextView.getText() + "\n" + text);

        /*String phone = XTools.replaceChar("12345678901", 3, 4, '*');
        Log.i("xtools", phone);
        phone = XTools.replaceChar("abcd", 3, 4, '*');
        Log.i("xtools", phone);
        phone = XTools.replaceChar("abc", 3, 4, '*');
        Log.i("xtools", phone);
        phone = XTools.replaceChar("12345",3, 4,  '*');
        Log.i("xtools", phone);
        phone = XTools.replaceChar("abcd", 4, 4, '*');
        Log.i("xtools", phone);
        phone = XTools.replaceChar("12345678901", 5, 4, '*');
        Log.i("xtools", phone);*/

    }
}