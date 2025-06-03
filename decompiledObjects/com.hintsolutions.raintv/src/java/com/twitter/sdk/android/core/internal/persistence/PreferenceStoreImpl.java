/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.twitter.sdk.android.core.internal.persistence;

import android.content.Context;
import android.content.SharedPreferences;
import com.twitter.sdk.android.core.internal.persistence.PreferenceStore;

public class PreferenceStoreImpl
implements PreferenceStore {
    private final SharedPreferences sharedPreferences;

    public PreferenceStoreImpl(Context context, String string2) {
        if (context != null) {
            this.sharedPreferences = context.getSharedPreferences(string2, 0);
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }

    @Override
    public SharedPreferences.Editor edit() {
        return this.sharedPreferences.edit();
    }

    @Override
    public SharedPreferences get() {
        return this.sharedPreferences;
    }

    @Override
    public boolean save(SharedPreferences.Editor editor) {
        editor.apply();
        return true;
    }
}

