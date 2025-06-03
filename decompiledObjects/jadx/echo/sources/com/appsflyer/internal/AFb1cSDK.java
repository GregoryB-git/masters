package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;

/* loaded from: classes.dex */
public final class AFb1cSDK implements AFb1dSDK {
    private final SharedPreferences values;

    public AFb1cSDK(SharedPreferences sharedPreferences) {
        this.values = sharedPreferences;
    }

    @Override // com.appsflyer.internal.AFb1dSDK
    public final void AFInAppEventParameterName(String str, long j7) {
        this.values.edit().putLong(str, j7).apply();
    }

    @Override // com.appsflyer.internal.AFb1dSDK
    public final void AFInAppEventType(String str) {
        this.values.edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFb1dSDK
    public final long valueOf(String str, long j7) {
        try {
            return this.values.getLong(str, j7);
        } catch (ClassCastException e7) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e7);
            return j7;
        }
    }

    @Override // com.appsflyer.internal.AFb1dSDK
    public final int values(String str, int i7) {
        try {
            return this.values.getInt(str, i7);
        } catch (ClassCastException e7) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e7);
            return i7;
        }
    }

    @Override // com.appsflyer.internal.AFb1dSDK
    public final void AFInAppEventParameterName(String str, String str2) {
        this.values.edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFb1dSDK
    public final void AFInAppEventType(String str, int i7) {
        this.values.edit().putInt(str, i7).apply();
    }

    @Override // com.appsflyer.internal.AFb1dSDK
    public final boolean valueOf(String str) {
        try {
            return this.values.getBoolean(str, false);
        } catch (ClassCastException e7) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e7);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFb1dSDK
    public final String values(String str, String str2) {
        try {
            return this.values.getString(str, str2);
        } catch (ClassCastException e7) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e7);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFb1dSDK
    public final void values(String str, boolean z7) {
        this.values.edit().putBoolean(str, z7).apply();
    }

    @Override // com.appsflyer.internal.AFb1dSDK
    public final boolean values(String str) {
        return this.values.contains(str);
    }
}
