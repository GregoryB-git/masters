package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzny {
    public static final zznv zza = new zzoa();

    public static <P> zznu zza(zzpg<P> zzpgVar) {
        zzbq zzbqVar;
        zznx zznxVar = new zznx();
        zznxVar.zza(zzpgVar.zza());
        Iterator<List<zzpi<P>>> it = zzpgVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzpi<P> zzpiVar : it.next()) {
                int i10 = zzob.zza[zzpiVar.zzb().ordinal()];
                if (i10 == 1) {
                    zzbqVar = zzbq.zza;
                } else if (i10 == 2) {
                    zzbqVar = zzbq.zzb;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzbqVar = zzbq.zzc;
                }
                int zza2 = zzpiVar.zza();
                String zze = zzpiVar.zze();
                if (zze.startsWith("type.googleapis.com/google.crypto.")) {
                    zze = zze.substring(34);
                }
                zznxVar.zza(zzbqVar, zza2, zze, zzpiVar.zzc().name());
            }
        }
        if (zzpgVar.zzb() != null) {
            zznxVar.zza(zzpgVar.zzb().zza());
        }
        try {
            return zznxVar.zza();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
