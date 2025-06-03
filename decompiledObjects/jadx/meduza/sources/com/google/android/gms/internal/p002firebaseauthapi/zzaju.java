package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
final class zzaju {
    private final Object zza;
    private final int zzb;

    public zzaju(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaju)) {
            return false;
        }
        zzaju zzajuVar = (zzaju) obj;
        return this.zza == zzajuVar.zza && this.zzb == zzajuVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
