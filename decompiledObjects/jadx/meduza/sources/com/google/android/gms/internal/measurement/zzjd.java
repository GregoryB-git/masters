package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzjd {
    private final zzjn zza;
    private final byte[] zzb;

    private zzjd(int i10) {
        byte[] bArr = new byte[i10];
        this.zzb = bArr;
        this.zza = zzjn.zzb(bArr);
    }

    public final zziy zza() {
        this.zza.zzb();
        return new zzjf(this.zzb);
    }

    public final zzjn zzb() {
        return this.zza;
    }
}
