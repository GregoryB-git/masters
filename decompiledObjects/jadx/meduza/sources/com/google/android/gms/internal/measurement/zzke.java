package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkg;
import defpackage.f;

/* loaded from: classes.dex */
final class zzke implements zzln {
    private static final zzke zza = new zzke();

    private zzke() {
    }

    public static zzke zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final zzlk zza(Class<?> cls) {
        if (!zzkg.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(f.j("Unsupported message type: ", cls.getName()));
        }
        try {
            return (zzlk) zzkg.zza(cls.asSubclass(zzkg.class)).zza(zzkg.zzf.zzc, (Object) null, (Object) null);
        } catch (Exception e10) {
            throw new RuntimeException(f.j("Unable to get message info for ", cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final boolean zzb(Class<?> cls) {
        return zzkg.class.isAssignableFrom(cls);
    }
}
