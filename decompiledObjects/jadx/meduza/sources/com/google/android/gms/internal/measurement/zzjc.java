package com.google.android.gms.internal.measurement;

import a0.j;
import defpackage.g;

/* loaded from: classes.dex */
final class zzjc extends zzjf {
    private final int zzc;
    private final int zzd;

    public zzjc(byte[] bArr, int i10, int i11) {
        super(bArr);
        zziy.zza(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzjf, com.google.android.gms.internal.measurement.zziy
    public final byte zza(int i10) {
        int zzb = zzb();
        if (((zzb - (i10 + 1)) | i10) >= 0) {
            return this.zzb[this.zzc + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(j.g("Index < 0: ", i10));
        }
        throw new ArrayIndexOutOfBoundsException(g.c("Index > length: ", i10, ", ", zzb));
    }

    @Override // com.google.android.gms.internal.measurement.zzjf, com.google.android.gms.internal.measurement.zziy
    public final byte zzb(int i10) {
        return this.zzb[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzjf, com.google.android.gms.internal.measurement.zziy
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzjf
    public final int zzc() {
        return this.zzc;
    }
}
