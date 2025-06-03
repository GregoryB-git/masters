package com.google.android.gms.internal.measurement;

import defpackage.f;

/* loaded from: classes.dex */
final class zzcd extends zzcn {
    private String zza;
    private zzcq zzb;
    private zzcp zzc;
    private byte zzd;

    @Override // com.google.android.gms.internal.measurement.zzcn
    public final zzcn zza(zzcp zzcpVar) {
        if (zzcpVar == null) {
            throw new NullPointerException("Null filePurpose");
        }
        this.zzc = zzcpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcn
    public final zzcn zza(zzcq zzcqVar) {
        if (zzcqVar == null) {
            throw new NullPointerException("Null fileChecks");
        }
        this.zzb = zzcqVar;
        return this;
    }

    public final zzcn zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcn
    public final zzcn zza(boolean z10) {
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcn
    public final zzco zza() {
        if (this.zzd == 1 && this.zza != null && this.zzb != null && this.zzc != null) {
            return new zzce(this.zza, this.zzb, this.zzc);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" fileOwner");
        }
        if ((1 & this.zzd) == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.zzb == null) {
            sb2.append(" fileChecks");
        }
        if (this.zzc == null) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException(f.j("Missing required properties:", String.valueOf(sb2)));
    }
}
