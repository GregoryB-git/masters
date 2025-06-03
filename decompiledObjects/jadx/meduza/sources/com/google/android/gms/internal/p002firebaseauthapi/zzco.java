package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzco {
    public static zzcg zza(byte[] bArr) {
        try {
            zzwf zza = zzwf.zza(bArr, zzajv.zza());
            zzom zza2 = zzom.zza();
            zzpm zza3 = zzpm.zza(zza);
            return !zza2.zzc(zza3) ? new zznp(zza3) : zza2.zza((zzom) zza3);
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }

    public static byte[] zza(zzcg zzcgVar) {
        return (zzcgVar instanceof zznp ? ((zznp) zzcgVar).zzb() : (zzpm) zzom.zza().zza((zzom) zzcgVar, zzpm.class)).zza().zzk();
    }
}
