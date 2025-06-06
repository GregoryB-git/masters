package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzju;
import defpackage.f;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzjx extends zzks {
    private final zzkf zza;
    private final zzzo zzb;

    private zzjx(zzkf zzkfVar, zzzo zzzoVar) {
        this.zza = zzkfVar;
        this.zzb = zzzoVar;
    }

    public static zzjx zza(zzkf zzkfVar, zzzo zzzoVar) {
        ECParameterSpec eCParameterSpec;
        if (zzkfVar == null) {
            throw new GeneralSecurityException("HPKE private key cannot be constructed without an HPKE public key");
        }
        if (zzzoVar == null) {
            throw new GeneralSecurityException("HPKE private key cannot be constructed without secret");
        }
        zzju.zzd zze = zzkfVar.zzb().zze();
        int zza = zzzoVar.zza();
        String str = "Encoded private key byte length for " + String.valueOf(zze) + " must be %d, not " + zza;
        zzju.zzd zzdVar = zzju.zzd.zza;
        if (zze == zzdVar) {
            if (zza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else if (zze == zzju.zzd.zzb) {
            if (zza != 48) {
                throw new GeneralSecurityException(String.format(str, 48));
            }
        } else if (zze == zzju.zzd.zzc) {
            if (zza != 66) {
                throw new GeneralSecurityException(String.format(str, 66));
            }
        } else {
            if (zze != zzju.zzd.zzd) {
                throw new GeneralSecurityException(f.j("Unable to validate private key length for ", String.valueOf(zze)));
            }
            if (zza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        zzju.zzd zze2 = zzkfVar.zzb().zze();
        byte[] zzb = zzkfVar.zzd().zzb();
        byte[] zza2 = zzzoVar.zza(zzbl.zza());
        if (zze2 == zzdVar || zze2 == zzju.zzd.zzb || zze2 == zzju.zzd.zzc) {
            if (zze2 == zzdVar) {
                eCParameterSpec = zzmt.zza;
            } else if (zze2 == zzju.zzd.zzb) {
                eCParameterSpec = zzmt.zzb;
            } else {
                if (zze2 != zzju.zzd.zzc) {
                    throw new IllegalArgumentException(f.j("Unable to determine NIST curve params for ", String.valueOf(zze2)));
                }
                eCParameterSpec = zzmt.zzc;
            }
            BigInteger order = eCParameterSpec.getOrder();
            BigInteger zza3 = zzmo.zza(zza2);
            if (zza3.signum() <= 0 || zza3.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private key.");
            }
            if (!zzmt.zza(zza3, eCParameterSpec).equals(zzyi.zza(eCParameterSpec.getCurve(), zzyk.UNCOMPRESSED, zzb))) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        } else {
            if (zze2 != zzju.zzd.zzd) {
                throw new IllegalArgumentException(f.j("Unable to validate key pair for ", String.valueOf(zze2)));
            }
            if (!Arrays.equals(zzzl.zza(zza2), zzb)) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        }
        return new zzjx(zzkfVar, zzzoVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzks, com.google.android.gms.internal.p002firebaseauthapi.zzcf
    public final /* synthetic */ zzbo zzb() {
        return (zzkf) zzb();
    }

    public final zzju zzc() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzks
    /* renamed from: zzd */
    public final /* synthetic */ zzkv zzb() {
        return this.zza;
    }

    public final zzzo zze() {
        return this.zzb;
    }
}
