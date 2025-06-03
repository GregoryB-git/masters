package com.google.android.gms.internal.p002firebaseauthapi;

import a0.j;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzjk implements zzbk {
    private final zzbk zza;
    private final zzxd zzb;
    private final byte[] zzc;

    private zzjk(zzbk zzbkVar, zzxd zzxdVar, byte[] bArr) {
        this.zza = zzbkVar;
        this.zzb = zzxdVar;
        this.zzc = bArr;
    }

    public static zzbk zza(zznn zznnVar) {
        zzzn zzznVar;
        zzpn zza = zznnVar.zza(zzbl.zza());
        zzwb zzwbVar = (zzwb) ((zzakg) zzwb.zza().zza(zza.zzf()).zza(zza.zzd()).zza(zza.zza()).zze());
        zzpr.zza();
        zzbk zzbkVar = (zzbk) zzpr.zza(zzwbVar, zzbk.class);
        zzxd zzc = zza.zzc();
        int i10 = zzjj.zza[zzc.ordinal()];
        if (i10 == 1) {
            zzznVar = zzor.zza;
        } else if (i10 == 2 || i10 == 3) {
            zzznVar = zzor.zza(zznnVar.zza().intValue());
        } else {
            if (i10 != 4) {
                throw new GeneralSecurityException(j.g("unknown output prefix type ", zzc.zza()));
            }
            zzznVar = zzor.zzb(zznnVar.zza().intValue());
        }
        return new zzjk(zzbkVar, zzc, zzznVar.zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbk
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (this.zzb == zzxd.RAW) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzpy.zza(this.zzc, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
