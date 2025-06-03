package com.google.android.gms.internal.p002firebaseauthapi;

import a0.j;
import defpackage.g;

/* loaded from: classes.dex */
final class zzaja extends zzajh {
    private final int zzc;
    private final int zzd;

    public zzaja(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzaiw.zza(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajh, com.google.android.gms.internal.p002firebaseauthapi.zzaiw
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajh, com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public final void zza(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, zze(), bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajh, com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public final byte zzb(int i10) {
        return this.zzb[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajh, com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajh
    public final int zze() {
        return this.zzc;
    }
}
