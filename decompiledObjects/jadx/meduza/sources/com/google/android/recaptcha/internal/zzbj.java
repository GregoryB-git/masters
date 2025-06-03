package com.google.android.recaptcha.internal;

import lc.k;
import p2.m0;

/* loaded from: classes.dex */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        return "avgExecutionTime: " + k.v0(String.valueOf(this.zzb / this.zza), 10) + " us| maxExecutionTime: " + k.v0(String.valueOf(this.zzc), 10) + " us| totalTime: " + k.v0(String.valueOf(this.zzb), 10) + " us| #Usages: " + k.v0(String.valueOf(this.zza), 5);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzbj zzbjVar) {
        return m0.s(Long.valueOf(this.zzb), Long.valueOf(zzbjVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j10) {
        this.zzc = j10;
    }

    public final void zzf(long j10) {
        this.zzb = j10;
    }

    public final void zzg(int i10) {
        this.zza = i10;
    }
}
