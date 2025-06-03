package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.u3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1038u3 extends A3 {

    /* renamed from: t, reason: collision with root package name */
    public final int f11181t;

    /* renamed from: u, reason: collision with root package name */
    public final int f11182u;

    public C1038u3(byte[] bArr, int i7, int i8) {
        super(bArr);
        AbstractC1003q3.g(i7, i7 + i8, bArr.length);
        this.f11181t = i7;
        this.f11182u = i8;
    }

    @Override // com.google.android.gms.internal.measurement.A3, com.google.android.gms.internal.measurement.AbstractC1003q3
    public final byte M(int i7) {
        return this.f10289s[this.f11181t + i7];
    }

    @Override // com.google.android.gms.internal.measurement.A3, com.google.android.gms.internal.measurement.AbstractC1003q3
    public final int S() {
        return this.f11182u;
    }

    @Override // com.google.android.gms.internal.measurement.A3
    public final int Y() {
        return this.f11181t;
    }

    @Override // com.google.android.gms.internal.measurement.A3, com.google.android.gms.internal.measurement.AbstractC1003q3
    public final byte a(int i7) {
        int S6 = S();
        if (((S6 - (i7 + 1)) | i7) >= 0) {
            return this.f10289s[this.f11181t + i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i7);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i7 + ", " + S6);
    }
}
