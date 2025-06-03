package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.g;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzpu {
    private final Class<?> zza;
    private final Class<? extends zzpq> zzb;

    private zzpu(Class<?> cls, Class<? extends zzpq> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpu)) {
            return false;
        }
        zzpu zzpuVar = (zzpu) obj;
        return zzpuVar.zza.equals(this.zza) && zzpuVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return g.e(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }
}
