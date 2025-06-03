package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
abstract class zzmu<T, B> {
    private static volatile int zza = 100;

    public abstract int zza(T t);

    public abstract B zza();

    public abstract T zza(T t, T t10);

    public abstract void zza(B b10, int i10, int i11);

    public abstract void zza(B b10, int i10, long j10);

    public abstract void zza(B b10, int i10, zziy zziyVar);

    public abstract void zza(B b10, int i10, T t);

    public abstract void zza(T t, zznl zznlVar);

    public abstract boolean zza(zzmf zzmfVar);

    public final boolean zza(B b10, zzmf zzmfVar, int i10) {
        int zzd = zzmfVar.zzd();
        int i11 = zzd >>> 3;
        int i12 = zzd & 7;
        if (i12 == 0) {
            zzb(b10, i11, zzmfVar.zzl());
            return true;
        }
        if (i12 == 1) {
            zza((zzmu<T, B>) b10, i11, zzmfVar.zzk());
            return true;
        }
        if (i12 == 2) {
            zza((zzmu<T, B>) b10, i11, zzmfVar.zzp());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                if (i10 != 0) {
                    return false;
                }
                throw zzkp.zzb();
            }
            if (i12 != 5) {
                throw zzkp.zza();
            }
            zza((zzmu<T, B>) b10, i11, zzmfVar.zzf());
            return true;
        }
        B zza2 = zza();
        int i13 = 4 | (i11 << 3);
        int i14 = i10 + 1;
        if (i14 >= zza) {
            throw zzkp.zzh();
        }
        while (zzmfVar.zzc() != Integer.MAX_VALUE && zza((zzmu<T, B>) zza2, zzmfVar, i14)) {
        }
        if (i13 != zzmfVar.zzd()) {
            throw zzkp.zzb();
        }
        zza((zzmu<T, B>) b10, i11, (int) zze(zza2));
        return true;
    }

    public abstract int zzb(T t);

    public abstract void zzb(B b10, int i10, long j10);

    public abstract void zzb(T t, zznl zznlVar);

    public abstract void zzb(Object obj, B b10);

    public abstract B zzc(Object obj);

    public abstract void zzc(Object obj, T t);

    public abstract T zzd(Object obj);

    public abstract T zze(B b10);

    public abstract void zzf(Object obj);
}
