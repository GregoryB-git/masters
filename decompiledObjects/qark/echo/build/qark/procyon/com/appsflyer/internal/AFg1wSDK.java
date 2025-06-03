// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

public class AFg1wSDK
{
    public static void AFInAppEventParameterName(final byte[] array, final byte b, final long n) {
        for (int i = 0; i < array.length; ++i) {
            if ((1L << i & n) != 0x0L) {
                array[i] ^= b;
            }
        }
    }
}
