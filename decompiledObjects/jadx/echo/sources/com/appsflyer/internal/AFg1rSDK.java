package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFg1rSDK {
    public static final Object AFInAppEventParameterName = new Object();
    public static int AFInAppEventType;
    public static int AFKeystoreWrapper;

    public static char[] AFInAppEventType(long j7, char[] cArr, int i7) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i8 = 0;
        int i9 = 4;
        for (int i10 = 0; i10 < cArr.length; i10++) {
            if ((((j7 >>> i10) & 1) != i7 || i8 >= 4) && i9 < length) {
                cArr2[i9] = cArr[i10];
                i9++;
            } else {
                cArr2[i8] = cArr[i10];
                i8++;
            }
        }
        return cArr2;
    }
}
