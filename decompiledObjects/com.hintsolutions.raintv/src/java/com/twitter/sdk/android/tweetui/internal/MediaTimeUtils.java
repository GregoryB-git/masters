/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Locale
 */
package com.twitter.sdk.android.tweetui.internal;

import java.util.Locale;

final class MediaTimeUtils {
    private static final String TIME_FORMAT_LONG = "%1$d:%2$02d:%3$02d";
    private static final String TIME_FORMAT_SHORT = "%1$d:%2$02d";

    private MediaTimeUtils() {
    }

    public static String getPlaybackTime(long l2) {
        int n = (int)(l2 / 1000L);
        int n3 = n % 60;
        int n4 = n / 60 % 60;
        if ((n /= 3600) > 0) {
            return String.format((Locale)Locale.getDefault(), (String)TIME_FORMAT_LONG, (Object[])new Object[]{n, n4, n3});
        }
        return String.format((Locale)Locale.getDefault(), (String)TIME_FORMAT_SHORT, (Object[])new Object[]{n4, n3});
    }
}

