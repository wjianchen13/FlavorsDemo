package com.example.lib_market;

import android.content.Context;
import android.widget.Toast;

public class MarketTest {

    public MarketTest() {
    }

    public void showToast(Context context) {
        if(context != null) {
            Toast.makeText(context, "market", Toast.LENGTH_SHORT).show();
        }

    }
}
