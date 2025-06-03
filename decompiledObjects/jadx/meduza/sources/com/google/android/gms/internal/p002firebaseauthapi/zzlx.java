package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.f;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzlx implements zzbj {
    private final zzbj zza;
    private final byte[] zzb;

    private zzlx(zzbj zzbjVar, byte[] bArr) {
        this.zza = zzbjVar;
        this.zzb = bArr;
    }

    public static zzbj zza(zznn zznnVar) {
        zzzn zzznVar;
        zzpn zza = zznnVar.zza(zzbl.zza());
        zzbj zzbjVar = (zzbj) zzcj.zza((zzwb) ((zzakg) zzwb.zza().zza(zza.zzf()).zza(zza.zzd()).zza(zza.zza()).zze()), zzbj.class);
        zzxd zzc = zza.zzc();
        int i10 = zzlw.zza[zzc.ordinal()];
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
        return new zzlx(zzbjVar, zzznVar.zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbj
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (!zzpy.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        return this.zza.zza(Arrays.copyOfRange(bArr, this.zzb.length, bArr.length), bArr2);
    }
}
