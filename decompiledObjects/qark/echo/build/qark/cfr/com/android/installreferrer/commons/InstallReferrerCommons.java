/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 */
package com.android.installreferrer.commons;

import android.util.Log;

public final class InstallReferrerCommons {
    public static void logVerbose(String string2, String string3) {
        if (Log.isLoggable((String)string2, (int)2)) {
            Log.v((String)string2, (String)string3);
        }
    }

    public static void logWarn(String string2, String string3) {
        if (Log.isLoggable((String)string2, (int)5)) {
            Log.w((String)string2, (String)string3);
        }
    }
}

