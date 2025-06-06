package com.google.android.gms.internal.auth;

import defpackage.g;

/* loaded from: classes.dex */
final class zzdm implements zzdj {
    private static final zzdj zza = new zzdj() { // from class: com.google.android.gms.internal.auth.zzdl
        @Override // com.google.android.gms.internal.auth.zzdj
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private volatile zzdj zzb;
    private Object zzc;

    public zzdm(zzdj zzdjVar) {
        this.zzb = zzdjVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == zza) {
            obj = g.e("<supplier that returned ", String.valueOf(this.zzc), ">");
        }
        return g.e("Suppliers.memoize(", String.valueOf(obj), ")");
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        zzdj zzdjVar = this.zzb;
        zzdj zzdjVar2 = zza;
        if (zzdjVar != zzdjVar2) {
            synchronized (this) {
                if (this.zzb != zzdjVar2) {
                    Object zza2 = this.zzb.zza();
                    this.zzc = zza2;
                    this.zzb = zzdjVar2;
                    return zza2;
                }
            }
        }
        return this.zzc;
    }
}
