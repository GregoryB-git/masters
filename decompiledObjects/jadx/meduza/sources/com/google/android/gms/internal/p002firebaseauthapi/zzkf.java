package com.google.android.gms.internal.p002firebaseauthapi;

import a0.j;
import com.google.android.gms.internal.p002firebaseauthapi.zzju;
import defpackage.f;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.EllipticCurve;

/* loaded from: classes.dex */
public final class zzkf extends zzkv {
    private final zzju zza;
    private final zzzn zzb;
    private final zzzn zzc;
    private final Integer zzd;

    private zzkf(zzju zzjuVar, zzzn zzznVar, zzzn zzznVar2, Integer num) {
        this.zza = zzjuVar;
        this.zzb = zzznVar;
        this.zzc = zzznVar2;
        this.zzd = num;
    }

    public static zzkf zza(zzju zzjuVar, zzzn zzznVar, Integer num) {
        zzzn zzb;
        ECParameterSpec eCParameterSpec;
        zzju.zzf zzf = zzjuVar.zzf();
        zzju.zzf zzfVar = zzju.zzf.zzc;
        if (!zzf.equals(zzfVar) && num == null) {
            throw new GeneralSecurityException(j.j("'idRequirement' must be non-null for ", String.valueOf(zzf), " variant."));
        }
        if (zzf.equals(zzfVar) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
        zzju.zzd zze = zzjuVar.zze();
        int zza = zzznVar.zza();
        String str = "Encoded public key byte length for " + String.valueOf(zze) + " must be %d, not " + zza;
        zzju.zzd zzdVar = zzju.zzd.zza;
        if (zze == zzdVar) {
            if (zza != 65) {
                throw new GeneralSecurityException(String.format(str, 65));
            }
        } else if (zze == zzju.zzd.zzb) {
            if (zza != 97) {
                throw new GeneralSecurityException(String.format(str, 97));
            }
        } else if (zze == zzju.zzd.zzc) {
            if (zza != 133) {
                throw new GeneralSecurityException(String.format(str, 133));
            }
        } else {
            if (zze != zzju.zzd.zzd) {
                throw new GeneralSecurityException(f.j("Unable to validate public key length for ", String.valueOf(zze)));
            }
            if (zza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        if (zze == zzdVar || zze == zzju.zzd.zzb || zze == zzju.zzd.zzc) {
            if (zze == zzdVar) {
                eCParameterSpec = zzmt.zza;
            } else if (zze == zzju.zzd.zzb) {
                eCParameterSpec = zzmt.zzb;
            } else {
                if (zze != zzju.zzd.zzc) {
                    throw new IllegalArgumentException(f.j("Unable to determine NIST curve type for ", String.valueOf(zze)));
                }
                eCParameterSpec = zzmt.zzc;
            }
            EllipticCurve curve = eCParameterSpec.getCurve();
            zzmt.zza(zzyi.zza(curve, zzyk.UNCOMPRESSED, zzznVar.zzb()), curve);
        }
        zzju.zzf zzf2 = zzjuVar.zzf();
        if (zzf2 == zzfVar) {
            zzb = zzor.zza;
        } else {
            if (num == null) {
                throw new IllegalStateException(f.j("idRequirement must be non-null for HpkeParameters.Variant ", String.valueOf(zzf2)));
            }
            if (zzf2 == zzju.zzf.zzb) {
                zzb = zzor.zza(num.intValue());
            } else {
                if (zzf2 != zzju.zzf.zza) {
                    throw new IllegalStateException(f.j("Unknown HpkeParameters.Variant: ", String.valueOf(zzf2)));
                }
                zzb = zzor.zzb(num.intValue());
            }
        }
        return new zzkf(zzjuVar, zzznVar, zzb, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final Integer zza() {
        return this.zzd;
    }

    public final zzju zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkv
    public final zzzn zzc() {
        return this.zzc;
    }

    public final zzzn zzd() {
        return this.zzb;
    }
}
