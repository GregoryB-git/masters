package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class zzma {
    private static final zzma zza = new zzma();
    private final ConcurrentMap<Class<?>, zzme<?>> zzc = new ConcurrentHashMap();
    private final zzmh zzb = new zzla();

    private zzma() {
    }

    public static zzma zza() {
        return zza;
    }

    public final <T> zzme<T> zza(Class<T> cls) {
        zzkj.zza(cls, "messageType");
        zzme<T> zzmeVar = (zzme) this.zzc.get(cls);
        if (zzmeVar != null) {
            return zzmeVar;
        }
        zzme<T> zza2 = this.zzb.zza(cls);
        zzkj.zza(cls, "messageType");
        zzkj.zza(zza2, "schema");
        zzme<T> zzmeVar2 = (zzme) this.zzc.putIfAbsent(cls, zza2);
        return zzmeVar2 != null ? zzmeVar2 : zza2;
    }

    public final <T> zzme<T> zza(T t) {
        return zza((Class) t.getClass());
    }
}
