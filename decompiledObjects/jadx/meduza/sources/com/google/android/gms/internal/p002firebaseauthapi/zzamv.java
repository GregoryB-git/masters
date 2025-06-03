package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
abstract class zzamv<T, B> {
    private static volatile int zza = 100;

    public abstract int zza(T t);

    public abstract B zza();

    public abstract T zza(T t, T t10);

    public abstract void zza(B b10, int i10, int i11);

    public abstract void zza(B b10, int i10, long j10);

    public abstract void zza(B b10, int i10, zzaiw zzaiwVar);

    public abstract void zza(B b10, int i10, T t);

    public abstract void zza(T t, zzanm zzanmVar);

    public abstract boolean zza(zzamd zzamdVar);

    public final boolean zza(B b10, zzamd zzamdVar, int i10) {
        int zzd = zzamdVar.zzd();
        int i11 = zzd >>> 3;
        int i12 = zzd & 7;
        if (i12 == 0) {
            zzb(b10, i11, zzamdVar.zzl());
            return true;
        }
        if (i12 == 1) {
            zza((zzamv<T, B>) b10, i11, zzamdVar.zzk());
            return true;
        }
        if (i12 == 2) {
            zza((zzamv<T, B>) b10, i11, zzamdVar.zzp());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                if (i10 != 0) {
                    return false;
                }
                throw zzakm.zzb();
            }
            if (i12 != 5) {
                throw zzakm.zza();
            }
            zza((zzamv<T, B>) b10, i11, zzamdVar.zzf());
            return true;
        }
        B zza2 = zza();
        int i13 = 4 | (i11 << 3);
        int i14 = i10 + 1;
        if (i14 >= zza) {
            throw zzakm.zzh();
        }
        while (zzamdVar.zzc() != Integer.MAX_VALUE && zza((zzamv<T, B>) zza2, zzamdVar, i14)) {
        }
        if (i13 != zzamdVar.zzd()) {
            throw zzakm.zzb();
        }
        zza((zzamv<T, B>) b10, i11, (int) zze(zza2));
        return true;
    }

    public abstract int zzb(T t);

    public abstract void zzb(B b10, int i10, long j10);

    public abstract void zzb(T t, zzanm zzanmVar);

    public abstract void zzb(Object obj, B b10);

    public abstract B zzc(Object obj);

    public abstract void zzc(Object obj, T t);

    public abstract T zzd(Object obj);

    public abstract T zze(B b10);

    public abstract void zzf(Object obj);
}
