package com.google.android.gms.internal.fido;

/* loaded from: classes.dex */
final class zzdb extends zzdd {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public /* synthetic */ zzdb(byte[] bArr, int i10, int i11, boolean z10, zzda zzdaVar) {
        super(null);
        this.zze = Integer.MAX_VALUE;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i10) {
        int i11 = this.zze;
        this.zze = 0;
        int i12 = this.zzc + this.zzd;
        this.zzc = i12;
        if (i12 > 0) {
            this.zzd = i12;
            this.zzc = i12 - i12;
        } else {
            this.zzd = 0;
        }
        return i11;
    }
}
