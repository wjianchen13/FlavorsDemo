package com.example.lib_main;

import android.content.Context;
import android.widget.Toast;

public class MainTest {

    public MainTest() {
    }

    public void showToast(Context context) {
        if(context != null) {
            Toast.makeText(context, "main", Toast.LENGTH_SHORT).show();
        }

    }
}
