package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzpq;

/* loaded from: classes.dex */
public abstract class zzoq<SerializationT extends zzpq> {
    private final zzzn zza;
    private final Class<SerializationT> zzb;

    private zzoq(zzzn zzznVar, Class<SerializationT> cls) {
        this.zza = zzznVar;
        this.zzb = cls;
    }

    public static <SerializationT extends zzpq> zzoq<SerializationT> zza(zzos<SerializationT> zzosVar, zzzn zzznVar, Class<SerializationT> cls) {
        return new zzot(zzznVar, cls, zzosVar);
    }

    public abstract zzcg zza(SerializationT serializationt);

    public final zzzn zza() {
        return this.zza;
    }

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }
}
