package com.shellvarsproject.shellparams;

import android.os.Bundle;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.IllegalViewOperationException;

public class ShellParamsModule extends ReactContextBaseJavaModule {

    ShellParamsModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "ShellParams";
    }

    @SuppressWarnings("unused")
    @ReactMethod
    public void getParams(Callback successCallback) {
        try {
            Bundle paramsBundle = ShellParams.getParams();

            // if we don't have a value, we can ignore it and invoke no callback
            if (paramsBundle != null) {
                WritableMap paramsMap = Arguments.fromBundle(paramsBundle);
                successCallback.invoke(paramsMap);
            }
        } catch (IllegalViewOperationException e) {
            // do nothing, noone cares
        }
    }

    @SuppressWarnings("unused")
    @ReactMethod
    public void getParam(String identifier, Callback successCallback) {
        try {
            String param = ShellParams.getParam(identifier);

            // if we don't have a value, we can ignore it and invoke no callback
            if (param != null) {
                successCallback.invoke(param);
            }
        } catch (IllegalViewOperationException e) {
            // do nothing, noone cares
        }
    }
}
