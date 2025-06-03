/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 */
package com.devbrackets.android.exomedia.util;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MediaSourceUtil {
    @Nullable
    public static String getExtension(@NonNull Uri uri) {
        String string2 = uri.getLastPathSegment();
        if (string2 == null) {
            return null;
        }
        int n = string2.lastIndexOf(46);
        String string3 = string2;
        int n2 = n;
        if (n == -1) {
            string3 = string2;
            n2 = n;
            if (uri.getPathSegments().size() > 1) {
                string3 = (String)uri.getPathSegments().get(uri.getPathSegments().size() - 2);
                n2 = string3.lastIndexOf(46);
            }
        }
        n = n2;
        if (n2 == -1) {
            n = 0;
            string3 = z2.t(".");
            string3.append(uri.getLastPathSegment());
            string3 = string3.toString();
        }
        return string3.substring(n).toLowerCase();
    }
}

