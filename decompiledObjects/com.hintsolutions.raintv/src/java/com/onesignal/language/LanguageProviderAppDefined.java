/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.onesignal.language;

import androidx.annotation.NonNull;
import com.onesignal.OSSharedPreferences;
import com.onesignal.language.LanguageProvider;

public class LanguageProviderAppDefined
implements LanguageProvider {
    private static final String DEFAULT_LANGUAGE = "en";
    public static final String PREFS_OS_LANGUAGE = "PREFS_OS_LANGUAGE";
    private final OSSharedPreferences preferences;

    public LanguageProviderAppDefined(OSSharedPreferences oSSharedPreferences) {
        this.preferences = oSSharedPreferences;
    }

    @Override
    @NonNull
    public String getLanguage() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getString(oSSharedPreferences.getPreferencesName(), PREFS_OS_LANGUAGE, DEFAULT_LANGUAGE);
    }

    public void setLanguage(String string2) {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        oSSharedPreferences.saveString(oSSharedPreferences.getPreferencesName(), PREFS_OS_LANGUAGE, string2);
    }
}

