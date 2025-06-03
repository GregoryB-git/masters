/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Locale
 */
package com.onesignal.language;

import androidx.annotation.NonNull;
import com.onesignal.language.LanguageProvider;
import java.util.Locale;

public class LanguageProviderDevice
implements LanguageProvider {
    private static final String CHINESE = "zh";
    private static final String HEBREW_CORRECTED = "he";
    private static final String HEBREW_INCORRECT = "iw";
    private static final String INDONESIAN_CORRECTED = "id";
    private static final String INDONESIAN_INCORRECT = "in";
    private static final String YIDDISH_CORRECTED = "yi";
    private static final String YIDDISH_INCORRECT = "ji";

    @Override
    @NonNull
    public String getLanguage() {
        String string2 = Locale.getDefault().getLanguage();
        string2.getClass();
        string2.hashCode();
        int n = -1;
        switch (string2.hashCode()) {
            default: {
                break;
            }
            case 3886: {
                if (!string2.equals((Object)CHINESE)) break;
                n = 3;
                break;
            }
            case 3391: {
                if (!string2.equals((Object)YIDDISH_INCORRECT)) break;
                n = 2;
                break;
            }
            case 3374: {
                if (!string2.equals((Object)HEBREW_INCORRECT)) break;
                n = 1;
                break;
            }
            case 3365: {
                if (!string2.equals((Object)INDONESIAN_INCORRECT)) break;
                n = 0;
            }
        }
        switch (n) {
            default: {
                return string2;
            }
            case 3: {
                string2 = z2.u(string2, "-");
                string2.append(Locale.getDefault().getCountry());
                return string2.toString();
            }
            case 2: {
                return YIDDISH_CORRECTED;
            }
            case 1: {
                return HEBREW_CORRECTED;
            }
            case 0: 
        }
        return INDONESIAN_CORRECTED;
    }
}

