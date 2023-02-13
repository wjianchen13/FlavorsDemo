package com.example.lib_common.flavor;

import android.content.Context;

public interface IFlavorHandler {

    boolean isMain();
    String getText();
    void showToast(Context context);

}
