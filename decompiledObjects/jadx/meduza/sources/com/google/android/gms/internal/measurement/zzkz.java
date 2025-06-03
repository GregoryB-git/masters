package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
final class zzkz implements zzkw {
    private static <E> zzkm<E> zzc(Object obj, long j10) {
        return (zzkm) zzmz.zze(obj, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzkw
    public final <L> List<L> zza(Object obj, long j10) {
        zzkm zzc = zzc(obj, j10);
        if (zzc.zzc()) {
            return zzc;
        }
        int size = zzc.size();
        zzkm zza = zzc.zza(size == 0 ? 10 : size << 1);
        zzmz.zza(obj, j10, zza);
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkw
    public final <E> void zza(Object obj, Object obj2, long j10) {
        zzkm zzc = zzc(obj, j10);
        zzkm zzc2 = zzc(obj2, j10);
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
        zzmz.zza(obj, j10, zzc2);
    }

    @Override // com.google.android.gms.internal.measurement.zzkw
    public final void zzb(Object obj, long j10) {
        zzc(obj, j10).zzb();
    }
}
