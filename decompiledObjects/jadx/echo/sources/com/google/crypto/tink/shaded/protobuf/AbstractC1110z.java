package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1110z {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f11552a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f11553b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f11554c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f11555d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f11556e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC1094i f11557f;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$a */
    public interface a {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$b */
    public interface b {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$c */
    public interface c {
        boolean a(int i7);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$d */
    public interface d extends List, RandomAccess {
        d h(int i7);

        void j();

        boolean p();
    }

    static {
        byte[] bArr = new byte[0];
        f11555d = bArr;
        f11556e = ByteBuffer.wrap(bArr);
        f11557f = AbstractC1094i.h(bArr);
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z7) {
        return z7 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static int e(byte[] bArr, int i7, int i8) {
        int h7 = h(i8, bArr, i7, i8);
        if (h7 == 0) {
            return 1;
        }
        return h7;
    }

    public static int f(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return p0.m(bArr);
    }

    public static int h(int i7, byte[] bArr, int i8, int i9) {
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            i7 = (i7 * 31) + bArr[i10];
        }
        return i7;
    }

    public static String i(byte[] bArr) {
        return new String(bArr, f11553b);
    }
}
