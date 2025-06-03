package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* loaded from: classes.dex */
final class zzakw implements zzakx {
    private static <E> zzakn<E> zzc(Object obj, long j10) {
        return (zzakn) zzana.zze(obj, j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakx
    public final <L> List<L> zza(Object obj, long j10) {
        zzakn zzc = zzc(obj, j10);
        if (zzc.zzc()) {
            return zzc;
        }
        int size = zzc.size();
        zzakn zza = zzc.zza(size == 0 ? 10 : size << 1);
        zzana.zza(obj, j10, zza);
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakx
    public final <E> void zza(Object obj, Object obj2, long j10) {
        zzakn zzc = zzc(obj, j10);
        zzakn zzc2 = zzc(obj2, j10);
        int size = zzc.size();
        int size2 = zzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzc.zzc()) {
                zzc = zzc.zza(size2 + size);
            }
            zzc.addAll(zzc2);
        }
        if (size > 0) {
            zzc2 = zzc;
        }
        zzana.zza(obj, j10, zzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakx
    public final void zzb(Object obj, long j10) {
        zzc(obj, j10).zzb();
    }
}
