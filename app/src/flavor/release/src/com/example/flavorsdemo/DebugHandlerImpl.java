package com.example.flavorsdemo;

import com.example.lib_common.IDebugHandler;

/**
 * DebugHandler Debug
 */
public class DebugHandlerImpl implements IDebugHandler {

    private static final String TAG = DebugHandlerImpl.class.getSimpleName();

    public DebugHandlerImpl() {

    }

    @Override
    public boolean isDebug() {
        return false;
    }

    @Override
    public String getText() {
        return "no debug";
    }
}
