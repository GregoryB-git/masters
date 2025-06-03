/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.hintsolutions.raintv.common.BaseActivity
 *  java.lang.Object
 *  java.lang.ref.WeakReference
 */
package com.hintsolutions.raintv.utils;

import com.hintsolutions.raintv.common.BaseActivity;
import java.lang.ref.WeakReference;

public class CurrentActivityHolder {
    private static WeakReference<BaseActivity> mActivityRef;

    public static void clearActivity() {
        mActivityRef = null;
    }

    public static BaseActivity getActivity() {
        WeakReference<BaseActivity> weakReference = mActivityRef;
        if (weakReference == null) {
            return null;
        }
        return (BaseActivity)weakReference.get();
    }

    public static void setActivity(BaseActivity baseActivity) {
        mActivityRef = new WeakReference((Object)baseActivity);
    }
}

