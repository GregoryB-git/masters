package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
abstract class zzhi {
    public final Unsafe zza;

    public zzhi(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j10);

    public abstract float zzb(Object obj, long j10);

    public abstract void zzc(Object obj, long j10, boolean z10);

    public abstract void zzd(Object obj, long j10, double d10);

    public abstract void zze(Object obj, long j10, float f);

    public abstract boolean zzf(Object obj, long j10);
}
