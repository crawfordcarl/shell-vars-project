package com.shellvarsproject.shellparams;

import android.os.Bundle;
import javax.annotation.Nullable;

public class ShellParams {
    private static Bundle mParams;

    public static void setParams(@Nullable Bundle params) {
        mParams = params;
    }

    public static Bundle getParams() {
        return mParams;
    }

    public static String getParam(String identifier) {
        if (mParams != null) {
            return mParams.getString(identifier);
        }

        return null;
    }
}
