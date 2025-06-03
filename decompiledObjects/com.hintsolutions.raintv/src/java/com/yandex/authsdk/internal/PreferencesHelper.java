/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.authsdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class PreferencesHelper {
    private static final String KEY_STATE_VALUE = "state_value";
    private static final String PREFERENCES_NAME = "authsdk";
    @NonNull
    private final SharedPreferences preferences;

    public PreferencesHelper(@NonNull Context context) {
        this.preferences = context.getSharedPreferences(PREFERENCES_NAME, 0);
    }

    @Nullable
    public String restoreStateValue() {
        return this.preferences.getString(KEY_STATE_VALUE, null);
    }

    public void saveStateValue(@NonNull String string2) {
        this.preferences.edit().putString(KEY_STATE_VALUE, string2).apply();
    }
}

