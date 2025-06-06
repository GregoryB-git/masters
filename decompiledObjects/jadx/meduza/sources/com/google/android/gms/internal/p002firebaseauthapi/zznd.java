package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzpq;

/* loaded from: classes.dex */
public abstract class zznd<SerializationT extends zzpq> {
    private final zzzn zza;
    private final Class<SerializationT> zzb;

    private zznd(zzzn zzznVar, Class<SerializationT> cls) {
        this.zza = zzznVar;
        this.zzb = cls;
    }

    public static <SerializationT extends zzpq> zznd<SerializationT> zza(zznf<SerializationT> zznfVar, zzzn zzznVar, Class<SerializationT> cls) {
        return new zznc(zzznVar, cls, zznfVar);
    }

    public abstract zzbo zza(SerializationT serializationt, zzcm zzcmVar);

    public final zzzn zza() {
        return this.zza;
    }

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }
}
