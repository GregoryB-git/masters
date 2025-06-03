// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

public final class AFg1zSDK
{
    public static long[] AFInAppEventType(int i, final int n) {
        final long[] array = new long[4];
        array[0] = (((long)n & 0xFFFFFFFFL) | ((long)i & 0xFFFFFFFFL) << 32);
        long n2;
        for (i = 1; i < 4; ++i) {
            n2 = array[i - 1];
            array[i] = (n2 ^ n2 >> 30) * 1812433253L + i;
        }
        return array;
    }
}
