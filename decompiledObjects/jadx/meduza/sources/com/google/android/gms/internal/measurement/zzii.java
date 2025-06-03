package com.google.android.gms.internal.measurement;

import x6.b;

/* loaded from: classes.dex */
public final class zzii {
    private final boolean zza;

    public zzii(zzil zzilVar) {
        b.y(zzilVar, "BuildInfo must be non-null");
        this.zza = !zzilVar.zza();
    }

    public final boolean zza(String str) {
        b.y(str, "flagName must not be null");
        if (this.zza) {
            return zzik.zza.get().b(str);
        }
        return true;
    }
}
