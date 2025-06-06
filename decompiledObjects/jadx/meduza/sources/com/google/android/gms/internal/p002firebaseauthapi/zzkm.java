package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzkm implements zzbj {
    private final zzpg<zzbj> zza;
    private final zznv zzb;

    public zzkm(zzpg<zzbj> zzpgVar) {
        this.zza = zzpgVar;
        this.zzb = zzpgVar.zzf() ? zzoj.zzb().zza().zza(zzny.zza(zzpgVar), "hybrid_decrypt", "decrypt") : zzny.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbj
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            for (zzpi<zzbj> zzpiVar : this.zza.zza(Arrays.copyOfRange(bArr, 0, 5))) {
                try {
                    byte[] zza = zzpiVar.zzd().zza(bArr, bArr2);
                    this.zzb.zza(zzpiVar.zza(), bArr.length);
                    return zza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzpi<zzbj> zzpiVar2 : this.zza.zza(zzbi.zza)) {
            try {
                byte[] zza2 = zzpiVar2.zzd().zza(bArr, bArr2);
                this.zzb.zza(zzpiVar2.zza(), bArr.length);
                return zza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        this.zzb.zza();
        throw new GeneralSecurityException("decryption failed");
    }
}
