package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
abstract class zzpr {
    public final Unsafe zza;

    public zzpr(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j10);

    public abstract float zzb(Object obj, long j10);

    public abstract void zzc(Object obj, long j10, boolean z10);

    public abstract void zzd(Object obj, long j10, byte b10);

    public abstract void zze(Object obj, long j10, double d10);

    public abstract void zzf(Object obj, long j10, float f);

    public abstract boolean zzg(Object obj, long j10);
}
