/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 */
package com.devbrackets.android.exomedia.util;

import android.net.Uri;

public class MediaUtil {
    private MediaUtil() {
    }

    public static String getUriWithProtocol(String string2) {
        if (string2 == null) {
            return "";
        }
        String string3 = string2;
        if (Uri.parse((String)string2).getScheme() == null) {
            string3 = z2.o("file://", string2);
        }
        return string3;
    }
}

