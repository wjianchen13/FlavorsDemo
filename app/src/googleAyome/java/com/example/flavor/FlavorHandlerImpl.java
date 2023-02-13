package com.example.flavor;

import android.content.Context;

import com.example.lib_common.flavor.IFlavorHandler;
import com.example.lib_main.MainTest;

/**
 * FlavorHandler
 */
public class FlavorHandlerImpl implements IFlavorHandler {

    private static final String TAG = FlavorHandlerImpl.class.getSimpleName();

    public FlavorHandlerImpl() {

    }

    @Override
    public boolean isMain() {
        return true;
    }

    @Override
    public String getText() {
        return "google";
    }

    @Override
    public void showToast(Context context) {
        new MainTest().showToast(context);
    }
}
