package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.g;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzpv {
    private final Class<? extends zzpq> zza;
    private final zzzn zzb;

    private zzpv(Class<? extends zzpq> cls, zzzn zzznVar) {
        this.zza = cls;
        this.zzb = zzznVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpv)) {
            return false;
        }
        zzpv zzpvVar = (zzpv) obj;
        return zzpvVar.zza.equals(this.zza) && zzpvVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return g.e(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }
}
