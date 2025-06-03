package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.a4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0860a4 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f10822a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f10823b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f10824c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f10825d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f10826e;

    /* renamed from: f, reason: collision with root package name */
    public static final G3 f10827f;

    static {
        byte[] bArr = new byte[0];
        f10825d = bArr;
        f10826e = ByteBuffer.wrap(bArr);
        f10827f = G3.c(bArr, 0, bArr.length, false);
    }

    public static int a(int i7, byte[] bArr, int i8, int i9) {
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            i7 = (i7 * 31) + bArr[i10];
        }
        return i7;
    }

    public static int b(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }

    public static int c(boolean z7) {
        return z7 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        int length = bArr.length;
        int a7 = a(length, bArr, 0, length);
        if (a7 == 0) {
            return 1;
        }
        return a7;
    }

    public static Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object f(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static boolean g(I4 i42) {
        return false;
    }

    public static String h(byte[] bArr) {
        return new String(bArr, f10823b);
    }

    public static boolean i(byte[] bArr) {
        return E5.d(bArr);
    }
}
