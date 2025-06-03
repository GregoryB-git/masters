package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.f;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class zzmb implements zzlo {
    private final zzyl zza;
    private final zzli zzb;

    private zzmb(zzli zzliVar, zzyl zzylVar) {
        this.zzb = zzliVar;
        this.zza = zzylVar;
    }

    public static zzmb zza(zzyl zzylVar) {
        int i10 = zzma.zza[zzylVar.ordinal()];
        if (i10 == 1) {
            return new zzmb(new zzli("HmacSha256"), zzyl.NIST_P256);
        }
        if (i10 == 2) {
            return new zzmb(new zzli("HmacSha384"), zzyl.NIST_P384);
        }
        if (i10 == 3) {
            return new zzmb(new zzli("HmacSha512"), zzyl.NIST_P521);
        }
        throw new GeneralSecurityException(f.j("invalid curve type: ", String.valueOf(zzylVar)));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlo
    public final byte[] zza() {
        int i10 = zzma.zza[this.zza.ordinal()];
        if (i10 == 1) {
            return zzlu.zzc;
        }
        if (i10 == 2) {
            return zzlu.zzd;
        }
        if (i10 == 3) {
            return zzlu.zze;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlo
    public final byte[] zza(byte[] bArr, zzlr zzlrVar) {
        byte[] zza = zzyi.zza(zzyi.zza(this.zza, zzlrVar.zza().zzb()), zzyi.zza(zzyi.zza(this.zza), zzyk.UNCOMPRESSED, bArr));
        byte[] zza2 = zzyc.zza(bArr, zzlrVar.zzb().zzb());
        byte[] zza3 = zzlu.zza(zza());
        zzli zzliVar = this.zzb;
        return zzliVar.zza(null, zza, "eae_prk", zza2, "shared_secret", zza3, zzliVar.zza());
    }
}
