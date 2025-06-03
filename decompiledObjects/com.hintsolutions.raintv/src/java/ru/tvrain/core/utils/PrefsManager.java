/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  java.lang.Boolean
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package ru.tvrain.core.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefsManager {
    public static final String PREFS_NAME = "RainPrefsFile";
    private static SharedPreferences prefs;

    public static void clearPrefs() {
        PrefsManager.getInstance().edit().clear().apply();
    }

    public static boolean getBoolean(String string2, boolean bl) {
        return PrefsManager.getInstance().getBoolean(string2, bl);
    }

    public static SharedPreferences getInstance() {
        SharedPreferences sharedPreferences = prefs;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw new IllegalStateException("Preferences is not initialized");
    }

    public static String getString(String string2) {
        return PrefsManager.getString(string2, null);
    }

    public static String getString(String string2, String string3) {
        return PrefsManager.getInstance().getString(string2, string3);
    }

    public static void init(Context context) {
        prefs = context.getApplicationContext().getSharedPreferences(PREFS_NAME, 0);
    }

    public static void putBoolean(String string2, Boolean bl) {
        PrefsManager.getInstance().edit().putBoolean(string2, bl.booleanValue()).commit();
    }

    public static void putString(String string2, String string3) {
        PrefsManager.getInstance().edit().putString(string2, string3).commit();
    }

    public static void remove(String string2) {
        PrefsManager.getInstance().edit().remove(string2).apply();
    }
}

