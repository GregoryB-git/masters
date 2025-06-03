package com.google.android.gms.internal.auth;

import defpackage.g;
import java.io.Serializable;

/* loaded from: classes.dex */
final class zzdk implements Serializable, zzdj {
    public final zzdj zza;
    public volatile transient boolean zzb;
    public transient Object zzc;

    public zzdk(zzdj zzdjVar) {
        this.zza = zzdjVar;
    }

    public final String toString() {
        return g.e("Suppliers.memoize(", (this.zzb ? g.e("<supplier that returned ", String.valueOf(this.zzc), ">") : this.zza).toString(), ")");
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    Object zza = this.zza.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
