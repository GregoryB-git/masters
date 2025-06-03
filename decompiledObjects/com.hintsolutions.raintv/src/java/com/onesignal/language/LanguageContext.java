/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.onesignal.language.LanguageProviderAppDefined
 *  com.onesignal.language.LanguageProviderDevice
 *  java.lang.Object
 *  java.lang.String
 */
package com.onesignal.language;

import androidx.annotation.NonNull;
import com.onesignal.OSSharedPreferences;
import com.onesignal.language.LanguageProvider;
import com.onesignal.language.LanguageProviderAppDefined;
import com.onesignal.language.LanguageProviderDevice;

public class LanguageContext {
    private static LanguageContext instance;
    private LanguageProvider strategy;

    public LanguageContext(OSSharedPreferences oSSharedPreferences) {
        instance = this;
        this.strategy = oSSharedPreferences.getString(oSSharedPreferences.getPreferencesName(), "PREFS_OS_LANGUAGE", null) != null ? new LanguageProviderAppDefined(oSSharedPreferences) : new LanguageProviderDevice();
    }

    public static LanguageContext getInstance() {
        return instance;
    }

    @NonNull
    public String getLanguage() {
        return this.strategy.getLanguage();
    }

    public void setStrategy(LanguageProvider languageProvider) {
        this.strategy = languageProvider;
    }
}

