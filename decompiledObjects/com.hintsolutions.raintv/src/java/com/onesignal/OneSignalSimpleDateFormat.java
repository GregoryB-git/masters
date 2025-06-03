/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.text.SimpleDateFormat
 *  java.util.Locale
 */
package com.onesignal;

import java.text.SimpleDateFormat;
import java.util.Locale;

class OneSignalSimpleDateFormat {
    public static SimpleDateFormat iso8601Format() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
    }
}

