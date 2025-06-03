/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.ClassCastException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1dSDK;

public final class AFb1cSDK
implements AFb1dSDK {
    private final SharedPreferences values;

    public AFb1cSDK(SharedPreferences sharedPreferences) {
        this.values = sharedPreferences;
    }

    @Override
    public final void AFInAppEventParameterName(String string2, long l8) {
        this.values.edit().putLong(string2, l8).apply();
    }

    @Override
    public final void AFInAppEventParameterName(String string2, String string3) {
        this.values.edit().putString(string2, string3).apply();
    }

    @Override
    public final void AFInAppEventType(String string2) {
        this.values.edit().remove(string2).apply();
    }

    @Override
    public final void AFInAppEventType(String string2, int n8) {
        this.values.edit().putInt(string2, n8).apply();
    }

    @Override
    public final long valueOf(String string2, long l8) {
        try {
            long l9 = this.values.getLong(string2, l8);
            return l9;
        }
        catch (ClassCastException classCastException) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf((Object)string2)), (Throwable)classCastException);
            return l8;
        }
    }

    @Override
    public final boolean valueOf(String string2) {
        try {
            boolean bl = this.values.getBoolean(string2, false);
            return bl;
        }
        catch (ClassCastException classCastException) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf((Object)string2)), (Throwable)classCastException);
            return false;
        }
    }

    @Override
    public final int values(String string2, int n8) {
        try {
            int n9 = this.values.getInt(string2, n8);
            return n9;
        }
        catch (ClassCastException classCastException) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf((Object)string2)), (Throwable)classCastException);
            return n8;
        }
    }

    @Override
    public final String values(String string2, String string3) {
        try {
            String string4 = this.values.getString(string2, string3);
            return string4;
        }
        catch (ClassCastException classCastException) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf((Object)string2)), (Throwable)classCastException);
            return string3;
        }
    }

    @Override
    public final void values(String string2, boolean bl) {
        this.values.edit().putBoolean(string2, bl).apply();
    }

    @Override
    public final boolean values(String string2) {
        return this.values.contains(string2);
    }
}

