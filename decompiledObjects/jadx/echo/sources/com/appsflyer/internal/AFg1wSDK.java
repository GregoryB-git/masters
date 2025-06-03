package com.appsflyer.internal;

/* loaded from: classes.dex */
public class AFg1wSDK {
    public static void AFInAppEventParameterName(byte[] bArr, byte b7, long j7) {
        for (int i7 = 0; i7 < bArr.length; i7++) {
            if (((1 << i7) & j7) != 0) {
                bArr[i7] = (byte) (bArr[i7] ^ b7);
            }
        }
    }
}
