/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.b3;

public final class e3
implements SharedPreferences.OnSharedPreferenceChangeListener {
    public /* synthetic */ b3 a;

    public /* synthetic */ e3(b3 b32) {
        this.a = b32;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String string2) {
        this.a.d(sharedPreferences, string2);
    }
}

