/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Set
 */
package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.OSSharedPreferences;
import com.onesignal.OneSignalPrefs;
import java.util.Set;

class OSSharedPreferencesWrapper
implements OSSharedPreferences {
    @Override
    public boolean getBool(String string2, String string3, boolean bl) {
        return OneSignalPrefs.getBool(string2, string3, bl);
    }

    @Override
    public int getInt(String string2, String string3, int n) {
        return OneSignalPrefs.getInt(string2, string3, n);
    }

    @Override
    public long getLong(String string2, String string3, long l) {
        return OneSignalPrefs.getLong(string2, string3, l);
    }

    @Override
    public Object getObject(String string2, String string3, Object object) {
        return OneSignalPrefs.getObject(string2, string3, object);
    }

    @Override
    public String getOutcomesV2KeyName() {
        return "PREFS_OS_OUTCOMES_V2";
    }

    @Override
    public String getPreferencesName() {
        return OneSignalPrefs.PREFS_ONESIGNAL;
    }

    @Override
    public String getString(String string2, String string3, String string4) {
        return OneSignalPrefs.getString(string2, string3, string4);
    }

    @Override
    @Nullable
    public Set<String> getStringSet(@NonNull String string2, @NonNull String string3, @Nullable Set<String> set) {
        return OneSignalPrefs.getStringSet(string2, string3, set);
    }

    @Override
    public void saveBool(String string2, String string3, boolean bl) {
        OneSignalPrefs.saveBool(string2, string3, bl);
    }

    @Override
    public void saveInt(String string2, String string3, int n) {
        OneSignalPrefs.saveInt(string2, string3, n);
    }

    @Override
    public void saveLong(String string2, String string3, long l) {
        OneSignalPrefs.saveLong(string2, string3, l);
    }

    @Override
    public void saveObject(String string2, String string3, Object object) {
        OneSignalPrefs.saveObject(string2, string3, object);
    }

    @Override
    public void saveString(String string2, String string3, String string4) {
        OneSignalPrefs.saveString(string2, string3, string4);
    }

    @Override
    public void saveStringSet(@NonNull String string2, @NonNull String string3, @NonNull Set<String> set) {
        OneSignalPrefs.saveStringSet(string2, string3, set);
    }
}

