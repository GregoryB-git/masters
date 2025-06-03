package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.z3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1082z3 {

    /* renamed from: a, reason: collision with root package name */
    public final J3 f11232a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f11233b;

    public C1082z3(int i7) {
        byte[] bArr = new byte[i7];
        this.f11233b = bArr;
        this.f11232a = J3.D(bArr);
    }

    public final AbstractC1003q3 a() {
        this.f11232a.E();
        return new A3(this.f11233b);
    }

    public final J3 b() {
        return this.f11232a;
    }
}
