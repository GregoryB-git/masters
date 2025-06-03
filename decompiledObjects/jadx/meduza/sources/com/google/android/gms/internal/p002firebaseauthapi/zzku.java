package com.google.android.gms.internal.p002firebaseauthapi;

import a0.j;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
final class zzku implements zzll {
    private final int zza;

    public zzku(int i10) {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(j.g("Unsupported key length: ", i10));
        }
        this.zza = i10;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, byte[] bArr4) {
        if (bArr.length == this.zza) {
            return new zzhk(bArr).zza(bArr2, bArr3, i10, bArr4);
        }
        throw new InvalidAlgorithmParameterException(j.g("Unexpected key length: ", bArr.length));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final byte[] zzc() {
        int i10 = this.zza;
        if (i10 == 16) {
            return zzlu.zzi;
        }
        if (i10 == 32) {
            return zzlu.zzj;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }
}
