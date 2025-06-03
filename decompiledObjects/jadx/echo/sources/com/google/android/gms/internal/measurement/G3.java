package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public abstract class G3 {

    /* renamed from: d, reason: collision with root package name */
    public static volatile int f10382d = 100;

    /* renamed from: a, reason: collision with root package name */
    public int f10383a;

    /* renamed from: b, reason: collision with root package name */
    public int f10384b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10385c;

    public G3() {
        this.f10383a = f10382d;
        this.f10384b = Integer.MAX_VALUE;
        this.f10385c = false;
    }

    public static long b(long j7) {
        return (-(j7 & 1)) ^ (j7 >>> 1);
    }

    public static G3 c(byte[] bArr, int i7, int i8, boolean z7) {
        F3 f32 = new F3(bArr, i8);
        try {
            f32.a(i8);
            return f32;
        } catch (C0950k4 e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static int e(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    public abstract int a(int i7);

    public abstract int d();
}
