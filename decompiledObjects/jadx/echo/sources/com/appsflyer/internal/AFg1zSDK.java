package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFg1zSDK {
    public static long[] AFInAppEventType(int i7, int i8) {
        long[] jArr = new long[4];
        jArr[0] = (i8 & 4294967295L) | ((i7 & 4294967295L) << 32);
        for (int i9 = 1; i9 < 4; i9++) {
            long j7 = jArr[i9 - 1];
            jArr[i9] = ((j7 ^ (j7 >> 30)) * 1812433253) + i9;
        }
        return jArr;
    }
}
