package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import com.google.android.gms.internal.p002firebaseauthapi.zzwl;
import com.google.android.gms.internal.p002firebaseauthapi.zzwo;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class zzcn {
    static {
        Charset.forName("UTF-8");
    }

    public static zzwo zza(zzwl zzwlVar) {
        zzwo.zzb zza = zzwo.zza().zza(zzwlVar.zzb());
        for (zzwl.zza zzaVar : zzwlVar.zze()) {
            zza.zza((zzwo.zza) ((zzakg) zzwo.zza.zza().zza(zzaVar.zzb().zzf()).zza(zzaVar.zzc()).zza(zzaVar.zzf()).zza(zzaVar.zza()).zze()));
        }
        return (zzwo) ((zzakg) zza.zze());
    }

    public static void zzb(zzwl zzwlVar) {
        int zzb = zzwlVar.zzb();
        boolean z10 = true;
        int i10 = 0;
        boolean z11 = false;
        for (zzwl.zza zzaVar : zzwlVar.zze()) {
            if (zzaVar.zzc() == zzwc.ENABLED) {
                if (!zzaVar.zzg()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzaVar.zza())));
                }
                if (zzaVar.zzf() == zzxd.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzaVar.zza())));
                }
                if (zzaVar.zzc() == zzwc.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzaVar.zza())));
                }
                if (zzaVar.zza() == zzb) {
                    if (z11) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z11 = true;
                }
                if (zzaVar.zzb().zzb() != zzwb.zza.ASYMMETRIC_PUBLIC) {
                    z10 = false;
                }
                i10++;
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z11 && !z10) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
