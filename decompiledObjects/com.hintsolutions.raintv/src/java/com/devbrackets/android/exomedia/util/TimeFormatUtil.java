/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Appendable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Formatter
 *  java.util.Locale
 */
package com.devbrackets.android.exomedia.util;

import java.util.Formatter;
import java.util.Locale;

public class TimeFormatUtil {
    private static StringBuilder formatBuilder = new StringBuilder();
    private static Formatter formatter = new Formatter((Appendable)formatBuilder, Locale.getDefault());

    public static String formatMs(long l) {
        if (l < 0L) {
            return "--:--";
        }
        long l2 = l % 60000L / 1000L;
        long l3 = l % 3600000L / 60000L;
        l = l % 86400000L / 3600000L;
        formatBuilder.setLength(0);
        if (l > 0L) {
            return formatter.format("%d:%02d:%02d", new Object[]{l, l3, l2}).toString();
        }
        return formatter.format("%02d:%02d", new Object[]{l3, l2}).toString();
    }
}

