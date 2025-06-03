package com.google.android.gms.internal.p002firebaseauthapi;

import a0.j;
import com.google.android.gms.internal.p002firebaseauthapi.zzfy;
import defpackage.f;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzfv extends zzcp {
    private final zzfy zza;
    private final zzzo zzb;
    private final zzzn zzc;
    private final Integer zzd;

    private zzfv(zzfy zzfyVar, zzzo zzzoVar, zzzn zzznVar, Integer num) {
        this.zza = zzfyVar;
        this.zzb = zzzoVar;
        this.zzc = zzznVar;
        this.zzd = num;
    }

    public static zzfv zza(zzfy.zza zzaVar, zzzo zzzoVar, Integer num) {
        zzzn zzb;
        zzfy.zza zzaVar2 = zzfy.zza.zzc;
        if (zzaVar != zzaVar2 && num == null) {
            throw new GeneralSecurityException(j.j("For given Variant ", String.valueOf(zzaVar), " the value of idRequirement must be non-null"));
        }
        if (zzaVar == zzaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzzoVar.zza() != 32) {
            throw new GeneralSecurityException(j.g("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", zzzoVar.zza()));
        }
        zzfy zza = zzfy.zza(zzaVar);
        if (zza.zzb() == zzaVar2) {
            zzb = zzor.zza;
        } else if (zza.zzb() == zzfy.zza.zzb) {
            zzb = zzor.zza(num.intValue());
        } else {
            if (zza.zzb() != zzfy.zza.zza) {
                throw new IllegalStateException(f.j("Unknown Variant: ", String.valueOf(zza.zzb())));
            }
            zzb = zzor.zzb(num.intValue());
        }
        return new zzfv(zza, zzzoVar, zzb, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final Integer zza() {
        return this.zzd;
    }

    public final zzfy zzb() {
        return this.zza;
    }

    public final zzzn zzc() {
        return this.zzc;
    }

    public final zzzo zzd() {
        return this.zzb;
    }
}
