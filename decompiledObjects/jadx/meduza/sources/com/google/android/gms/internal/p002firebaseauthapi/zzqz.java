package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzqz implements zzcd {
    private final zzpg<zzcd> zza;
    private final zznv zzb;
    private final zznv zzc;

    private zzqz(zzpg<zzcd> zzpgVar) {
        zznv zznvVar;
        this.zza = zzpgVar;
        if (zzpgVar.zzf()) {
            zzns zza = zzoj.zzb().zza();
            zznu zza2 = zzny.zza(zzpgVar);
            this.zzb = zza.zza(zza2, "mac", "compute");
            zznvVar = zza.zza(zza2, "mac", "verify");
        } else {
            zznvVar = zzny.zza;
            this.zzb = zznvVar;
        }
        this.zzc = zznvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcd
    public final void zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 5) {
            this.zzc.zza();
            throw new GeneralSecurityException("tag too short");
        }
        for (zzpi<zzcd> zzpiVar : this.zza.zza(Arrays.copyOf(bArr, 5))) {
            try {
                zzpiVar.zzd().zza(bArr, bArr2);
                this.zzc.zza(zzpiVar.zza(), bArr2.length);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        for (zzpi<zzcd> zzpiVar2 : this.zza.zze()) {
            try {
                zzpiVar2.zzd().zza(bArr, bArr2);
                this.zzc.zza(zzpiVar2.zza(), bArr2.length);
                return;
            } catch (GeneralSecurityException unused2) {
            }
        }
        this.zzc.zza();
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcd
    public final byte[] zza(byte[] bArr) {
        try {
            byte[] zza = this.zza.zzb().zzd().zza(bArr);
            this.zzb.zza(this.zza.zzb().zza(), bArr.length);
            return zza;
        } catch (GeneralSecurityException e10) {
            this.zzb.zza();
            throw e10;
        }
    }
}
