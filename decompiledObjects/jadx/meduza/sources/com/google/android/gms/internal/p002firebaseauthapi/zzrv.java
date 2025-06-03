package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzrv implements zzcd {
    private static final byte[] zza = {0};
    private final zzcd zzb;
    private final zzxd zzc;
    private final byte[] zzd;

    private zzrv(zzcd zzcdVar, zzxd zzxdVar, byte[] bArr) {
        this.zzb = zzcdVar;
        this.zzc = zzxdVar;
        this.zzd = bArr;
    }

    public static zzcd zza(zznn zznnVar) {
        zzzn zzznVar;
        zzpn zza2 = zznnVar.zza(zzbl.zza());
        zzwb zzwbVar = (zzwb) ((zzakg) zzwb.zza().zza(zza2.zzf()).zza(zza2.zzd()).zza(zza2.zza()).zze());
        zzpr.zza();
        zzcd zzcdVar = (zzcd) zzpr.zza(zzwbVar, zzcd.class);
        zzxd zzc = zza2.zzc();
        int i10 = zzry.zza[zzc.ordinal()];
        if (i10 == 1) {
            zzznVar = zzor.zza;
        } else if (i10 == 2 || i10 == 3) {
            zzznVar = zzor.zza(zznnVar.zza().intValue());
        } else {
            if (i10 != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            zzznVar = zzor.zzb(zznnVar.zza().intValue());
        }
        return new zzrv(zzcdVar, zzc, zzznVar.zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcd
    public final void zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 10) {
            throw new GeneralSecurityException("tag too short");
        }
        if (this.zzc.equals(zzxd.LEGACY)) {
            bArr2 = zzyc.zza(bArr2, zza);
        }
        byte[] bArr3 = new byte[0];
        if (!this.zzc.equals(zzxd.RAW)) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
            bArr3 = copyOf;
        }
        if (!Arrays.equals(this.zzd, bArr3)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        this.zzb.zza(bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcd
    public final byte[] zza(byte[] bArr) {
        if (this.zzc.equals(zzxd.LEGACY)) {
            bArr = zzyc.zza(bArr, zza);
        }
        return zzyc.zza(this.zzd, this.zzb.zza(bArr));
    }
}
