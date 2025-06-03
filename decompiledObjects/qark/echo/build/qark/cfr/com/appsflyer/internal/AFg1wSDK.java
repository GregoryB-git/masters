/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.appsflyer.internal;

public class AFg1wSDK {
    public static void AFInAppEventParameterName(byte[] arrby, byte by, long l8) {
        for (int i8 = 0; i8 < arrby.length; ++i8) {
            if ((1L << i8 & l8) == 0L) continue;
            arrby[i8] = (byte)(arrby[i8] ^ by);
        }
    }
}

