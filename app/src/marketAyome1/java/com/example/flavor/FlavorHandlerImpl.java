package com.example.flavor;

import android.content.Context;

import com.example.lib_common.flavor.IFlavorHandler;
import com.example.lib_market.MarketTest;

/**
 * FlavorHandler
 */
public class FlavorHandlerImpl implements IFlavorHandler {

    private static final String TAG = FlavorHandlerImpl.class.getSimpleName();

    public FlavorHandlerImpl() {

    }

    @Override
    public boolean isMain() {
        return false;
    }

    @Override
    public String getText() {
        return "market";
    }

    @Override
    public void showToast(Context context) {
        new MarketTest().showToast(context);
    }
}
