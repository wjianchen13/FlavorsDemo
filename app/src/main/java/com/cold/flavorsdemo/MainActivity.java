package com.cold.flavorsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.lib_common.debug.DebugHandler;
import com.example.lib_common.flavor.FlavorHandler;

public class MainActivity extends AppCompatActivity {

    private TextView tvTest1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTest1 = findViewById(R.id.tv_test1);
    }

    public void onDebug(View v) {
        String test = DebugHandler.getInstance().getText();
        tvTest1.setText(test);
    }

    public void onShow(View v) {
        FlavorHandler.getInstance().showToast(this);
    }

}
