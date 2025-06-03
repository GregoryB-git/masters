/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Object
 */
package com.twitter.sdk.android.core.internal.persistence;

import android.content.SharedPreferences;

public interface PreferenceStore {
    public SharedPreferences.Editor edit();

    public SharedPreferences get();

    public boolean save(SharedPreferences.Editor var1);
}

