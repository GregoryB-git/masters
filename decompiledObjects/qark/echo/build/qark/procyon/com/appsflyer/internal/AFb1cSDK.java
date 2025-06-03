// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import android.content.SharedPreferences;

public final class AFb1cSDK implements AFb1dSDK
{
    private final SharedPreferences values;
    
    public AFb1cSDK(final SharedPreferences values) {
        this.values = values;
    }
    
    @Override
    public final void AFInAppEventParameterName(final String s, final long n) {
        this.values.edit().putLong(s, n).apply();
    }
    
    @Override
    public final void AFInAppEventParameterName(final String s, final String s2) {
        this.values.edit().putString(s, s2).apply();
    }
    
    @Override
    public final void AFInAppEventType(final String s) {
        this.values.edit().remove(s).apply();
    }
    
    @Override
    public final void AFInAppEventType(final String s, final int n) {
        this.values.edit().putInt(s, n).apply();
    }
    
    @Override
    public final long valueOf(final String obj, final long n) {
        try {
            return this.values.getLong(obj, n);
        }
        catch (ClassCastException ex) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(obj)), ex);
            return n;
        }
    }
    
    @Override
    public final boolean valueOf(final String obj) {
        try {
            return this.values.getBoolean(obj, false);
        }
        catch (ClassCastException ex) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(obj)), ex);
            return false;
        }
    }
    
    @Override
    public final int values(final String obj, final int n) {
        try {
            return this.values.getInt(obj, n);
        }
        catch (ClassCastException ex) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(obj)), ex);
            return n;
        }
    }
    
    @Override
    public final String values(final String obj, final String s) {
        try {
            return this.values.getString(obj, s);
        }
        catch (ClassCastException ex) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(obj)), ex);
            return s;
        }
    }
    
    @Override
    public final void values(final String s, final boolean b) {
        this.values.edit().putBoolean(s, b).apply();
    }
    
    @Override
    public final boolean values(final String s) {
        return this.values.contains(s);
    }
}
