/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.appsflyer.internal;

public final class AFg1zSDK {
    public static long[] AFInAppEventType(int n8, int n9) {
        long[] arrl = new long[4];
        long l8 = n8;
        arrl[0] = (long)n9 & 0xFFFFFFFFL | (l8 & 0xFFFFFFFFL) << 32;
        for (n8 = 1; n8 < 4; ++n8) {
            l8 = arrl[n8 - 1];
            arrl[n8] = (l8 ^ l8 >> 30) * 1812433253L + (long)n8;
        }
        return arrl;
    }
}

