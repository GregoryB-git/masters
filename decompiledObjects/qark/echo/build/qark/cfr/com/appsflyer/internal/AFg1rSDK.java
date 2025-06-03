/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.appsflyer.internal;

public final class AFg1rSDK {
    public static final Object AFInAppEventParameterName = new Object();
    public static int AFInAppEventType;
    public static int AFKeystoreWrapper;

    public static char[] AFInAppEventType(long l8, char[] arrc, int n8) {
        int n9 = arrc.length;
        char[] arrc2 = new char[n9];
        int n10 = 0;
        int n11 = 4;
        for (int i8 = 0; i8 < arrc.length; ++i8) {
            if (((l8 >>> i8 & 1L) != (long)n8 || n10 >= 4) && n11 < n9) {
                arrc2[n11] = arrc[i8];
                ++n11;
                continue;
            }
            arrc2[n10] = arrc[i8];
            ++n10;
        }
        return arrc2;
    }
}

