package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.f;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzlz implements zzbm {
    private zzlz(zzbm zzbmVar, byte[] bArr) {
    }

    public static zzbm zza(zznn zznnVar) {
        zzzn zzznVar;
        zzpn zza = zznnVar.zza(zzbl.zza());
        zzbm zzbmVar = (zzbm) zzcj.zza((zzwb) ((zzakg) zzwb.zza().zza(zza.zzf()).zza(zza.zzd()).zza(zza.zza()).zze()), zzbm.class);
        zzxd zzc = zza.zzc();
        int i10 = zzly.zza[zzc.ordinal()];
        if (i10 == 1) {
            zzznVar = zzor.zza;
        } else if (i10 == 2 || i10 == 3) {
            zzznVar = zzor.zza(zznnVar.zza().intValue());
        } else {
            if (i10 != 4) {
                throw new GeneralSecurityException(f.j("unknown output prefix type ", String.valueOf(zzc)));
            }
            zzznVar = zzor.zzb(zznnVar.zza().intValue());
        }
        return new zzlz(zzbmVar, zzznVar.zzb());
    }
}
