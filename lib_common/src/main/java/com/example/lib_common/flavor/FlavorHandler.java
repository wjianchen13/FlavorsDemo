package com.example.lib_common.flavor;

import android.content.Context;

public class FlavorHandler implements IFlavorHandler {

    private static FlavorHandler INSTANCE;
    IFlavorHandler mDebugHandler;

    public static FlavorHandler getInstance() {

        if (INSTANCE == null) {
            synchronized (FlavorHandler.class) {
                if (INSTANCE == null) {
                    INSTANCE = new FlavorHandler();
                }
            }
        }
        return INSTANCE;
    }

    private IFlavorHandler getDebugHandler() {
        if(mDebugHandler == null) {
            Class<?> cls = null;
            try {
                cls = Class.forName("com.example.flavor.FlavorHandlerImpl");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            try {
                mDebugHandler = (IFlavorHandler) cls.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return mDebugHandler;
    }

    @Override
    public boolean isMain() {
        return getDebugHandler() != null ? getDebugHandler().isMain() : false;
    }

    @Override
    public String getText() {
        return getDebugHandler() != null ? getDebugHandler().getText() : "";
    }

    @Override
    public void showToast(Context context) {
        if(getDebugHandler() != null) {
            getDebugHandler().showToast(context);
        }
    }
}
