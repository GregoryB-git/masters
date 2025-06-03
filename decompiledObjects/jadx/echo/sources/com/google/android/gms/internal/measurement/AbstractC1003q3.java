package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.q3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1003q3 implements Serializable, Iterable {

    /* renamed from: p, reason: collision with root package name */
    public static final AbstractC1003q3 f11110p = new A3(AbstractC0860a4.f10825d);

    /* renamed from: q, reason: collision with root package name */
    public static final InterfaceC1065x3 f11111q = new D3();

    /* renamed from: r, reason: collision with root package name */
    public static final Comparator f11112r = new C1020s3();

    /* renamed from: o, reason: collision with root package name */
    public int f11113o = 0;

    public static C1082z3 U(int i7) {
        return new C1082z3(i7);
    }

    public static /* synthetic */ int f(byte b7) {
        return b7 & 255;
    }

    public static int g(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) >= 0) {
            return i10;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i7 + " < 0");
        }
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i7 + ", " + i8);
        }
        throw new IndexOutOfBoundsException("End index: " + i8 + " >= " + i9);
    }

    public static AbstractC1003q3 k(String str) {
        return new A3(str.getBytes(AbstractC0860a4.f10823b));
    }

    public static AbstractC1003q3 q(byte[] bArr, int i7, int i8) {
        g(i7, i7 + i8, bArr.length);
        return new A3(f11111q.a(bArr, i7, i8));
    }

    public abstract void D(AbstractC1011r3 abstractC1011r3);

    public abstract byte M(int i7);

    public abstract int S();

    public abstract int T(int i7, int i8, int i9);

    public final String V() {
        return S() == 0 ? "" : s(AbstractC0860a4.f10823b);
    }

    public abstract boolean W();

    public abstract byte a(int i7);

    public final int d() {
        return this.f11113o;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i7 = this.f11113o;
        if (i7 == 0) {
            int S6 = S();
            i7 = T(S6, 0, S6);
            if (i7 == 0) {
                i7 = 1;
            }
            this.f11113o = i7;
        }
        return i7;
    }

    public abstract AbstractC1003q3 i(int i7, int i8);

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return new C1029t3(this);
    }

    public abstract String s(Charset charset);

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(S());
        if (S() <= 50) {
            str = AbstractC1022s5.a(this);
        } else {
            str = AbstractC1022s5.a(i(0, 47)) + "...";
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
