package com.example.lib_common.debug;

public class DebugHandler implements IDebugHandler{

    private static DebugHandler INSTANCE;
    IDebugHandler mDebugHandler;

    public static DebugHandler getInstance() {

        if (INSTANCE == null) {
            synchronized (DebugHandler.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DebugHandler();
                }
            }
        }
        return INSTANCE;
    }

    private IDebugHandler getDebugHandler() {
        if(mDebugHandler == null) {
            Class<?> cls = null;
            try {
                cls = Class.forName("com.example.flavorsdemo.DebugHandlerImpl");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            try {
                mDebugHandler = (IDebugHandler) cls.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return mDebugHandler;
    }

    @Override
    public boolean isDebug() {
        return getDebugHandler() != null ? getDebugHandler().isDebug() : false;
    }

    @Override
    public String getText() {
        return getDebugHandler() != null ? getDebugHandler().getText() : "";
    }
}
