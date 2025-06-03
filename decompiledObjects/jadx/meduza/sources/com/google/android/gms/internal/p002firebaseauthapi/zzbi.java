package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwl;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzbi {
    public static final byte[] zza = new byte[0];

    public static byte[] zza(zzwl.zza zzaVar) {
        zzzn zza2;
        int i10 = zzbh.zza[zzaVar.zzf().ordinal()];
        if (i10 == 1 || i10 == 2) {
            zza2 = zzor.zza(zzaVar.zza());
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    return zza;
                }
                throw new GeneralSecurityException("unknown output prefix type");
            }
            zza2 = zzor.zzb(zzaVar.zza());
        }
        return zza2.zzb();
    }
}
