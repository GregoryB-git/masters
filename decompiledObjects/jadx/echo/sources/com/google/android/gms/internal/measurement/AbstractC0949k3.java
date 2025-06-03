package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.k3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0949k3 implements L4 {
    public abstract /* synthetic */ Object clone();

    public abstract AbstractC0949k3 g(byte[] bArr, int i7, int i8);

    public abstract AbstractC0949k3 j(byte[] bArr, int i7, int i8, M3 m32);

    @Override // com.google.android.gms.internal.measurement.L4
    public final /* synthetic */ L4 m(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.L4
    public final /* synthetic */ L4 r(byte[] bArr, M3 m32) {
        return j(bArr, 0, bArr.length, m32);
    }
}
