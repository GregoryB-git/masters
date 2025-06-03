package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class F3 extends G3 {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f10372e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10373f;

    /* renamed from: g, reason: collision with root package name */
    public int f10374g;

    /* renamed from: h, reason: collision with root package name */
    public int f10375h;

    /* renamed from: i, reason: collision with root package name */
    public int f10376i;

    /* renamed from: j, reason: collision with root package name */
    public int f10377j;

    /* renamed from: k, reason: collision with root package name */
    public int f10378k;

    public F3(byte[] bArr, int i7, int i8, boolean z7) {
        super();
        this.f10378k = Integer.MAX_VALUE;
        this.f10372e = bArr;
        this.f10374g = i8 + i7;
        this.f10376i = i7;
        this.f10377j = i7;
        this.f10373f = z7;
    }

    @Override // com.google.android.gms.internal.measurement.G3
    public final int a(int i7) {
        if (i7 < 0) {
            throw C0950k4.d();
        }
        int d7 = i7 + d();
        if (d7 < 0) {
            throw C0950k4.e();
        }
        int i8 = this.f10378k;
        if (d7 > i8) {
            throw C0950k4.f();
        }
        this.f10378k = d7;
        f();
        return i8;
    }

    @Override // com.google.android.gms.internal.measurement.G3
    public final int d() {
        return this.f10376i - this.f10377j;
    }

    public final void f() {
        int i7 = this.f10374g + this.f10375h;
        this.f10374g = i7;
        int i8 = i7 - this.f10377j;
        int i9 = this.f10378k;
        if (i8 <= i9) {
            this.f10375h = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f10375h = i10;
        this.f10374g = i7 - i10;
    }
}
