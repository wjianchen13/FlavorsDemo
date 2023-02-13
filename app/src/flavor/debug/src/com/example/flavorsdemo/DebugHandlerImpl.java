package com.example.flavorsdemo;

import com.example.lib_common.debug.IDebugHandler;

/**
 * DebugHandler Debug
 */
public class DebugHandlerImpl implements IDebugHandler {

    private static final String TAG = DebugHandlerImpl.class.getSimpleName();

    public DebugHandlerImpl() {

    }

    @Override
    public boolean isDebug() {
        return true;
    }

    @Override
    public String getText() {
        return "debug";
    }
}
