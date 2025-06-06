package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.g;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzpe {
    private final Class<?> zza;
    private final Class<?> zzb;

    private zzpe(Class<?> cls, Class<?> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpe)) {
            return false;
        }
        zzpe zzpeVar = (zzpe) obj;
        return zzpeVar.zza.equals(this.zza) && zzpeVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return g.e(this.zza.getSimpleName(), " with primitive type: ", this.zzb.getSimpleName());
    }
}
