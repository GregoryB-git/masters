package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class A3 extends B3 {

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f10289s;

    public A3(byte[] bArr) {
        bArr.getClass();
        this.f10289s = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1003q3
    public final void D(AbstractC1011r3 abstractC1011r3) {
        abstractC1011r3.a(this.f10289s, Y(), S());
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1003q3
    public byte M(int i7) {
        return this.f10289s[i7];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1003q3
    public int S() {
        return this.f10289s.length;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1003q3
    public final int T(int i7, int i8, int i9) {
        return AbstractC0860a4.a(i7, this.f10289s, Y(), i9);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1003q3
    public final boolean W() {
        int Y6 = Y();
        return E5.f(this.f10289s, Y6, S() + Y6);
    }

    @Override // com.google.android.gms.internal.measurement.B3
    public final boolean X(AbstractC1003q3 abstractC1003q3, int i7, int i8) {
        if (i8 > abstractC1003q3.S()) {
            throw new IllegalArgumentException("Length too large: " + i8 + S());
        }
        if (i8 > abstractC1003q3.S()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i8 + ", " + abstractC1003q3.S());
        }
        if (!(abstractC1003q3 instanceof A3)) {
            return abstractC1003q3.i(0, i8).equals(i(0, i8));
        }
        A3 a32 = (A3) abstractC1003q3;
        byte[] bArr = this.f10289s;
        byte[] bArr2 = a32.f10289s;
        int Y6 = Y() + i8;
        int Y7 = Y();
        int Y8 = a32.Y();
        while (Y7 < Y6) {
            if (bArr[Y7] != bArr2[Y8]) {
                return false;
            }
            Y7++;
            Y8++;
        }
        return true;
    }

    public int Y() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1003q3
    public byte a(int i7) {
        return this.f10289s[i7];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1003q3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1003q3) || S() != ((AbstractC1003q3) obj).S()) {
            return false;
        }
        if (S() == 0) {
            return true;
        }
        if (!(obj instanceof A3)) {
            return obj.equals(this);
        }
        A3 a32 = (A3) obj;
        int d7 = d();
        int d8 = a32.d();
        if (d7 == 0 || d8 == 0 || d7 == d8) {
            return X(a32, 0, S());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1003q3
    public final AbstractC1003q3 i(int i7, int i8) {
        int g7 = AbstractC1003q3.g(0, i8, S());
        return g7 == 0 ? AbstractC1003q3.f11110p : new C1038u3(this.f10289s, Y(), g7);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1003q3
    public final String s(Charset charset) {
        return new String(this.f10289s, Y(), S(), charset);
    }
}
