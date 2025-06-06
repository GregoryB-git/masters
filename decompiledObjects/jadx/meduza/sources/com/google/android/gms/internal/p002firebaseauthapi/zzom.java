package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzom {
    private static final zzom zza = (zzom) zzpw.zza(new zzpz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzop
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
        public final Object zza() {
            zzom zzomVar = new zzom();
            zzomVar.zza(zznh.zza(new zznj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzoo
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zznj
                public final zzpq zza(zzbo zzboVar, zzcm zzcmVar) {
                    return ((zznn) zzboVar).zza(zzcmVar);
                }
            }, zznn.class, zzpn.class));
            return zzomVar;
        }
    });
    private final AtomicReference<zzpt> zzb = new AtomicReference<>(new zzps().zza());

    public static zzom zza() {
        return zza;
    }

    public final <SerializationT extends zzpq> zzbo zza(SerializationT serializationt, zzcm zzcmVar) {
        return this.zzb.get().zza((zzpt) serializationt, zzcmVar);
    }

    public final <SerializationT extends zzpq> zzcg zza(SerializationT serializationt) {
        return this.zzb.get().zza((zzpt) serializationt);
    }

    public final <KeyT extends zzbo, SerializationT extends zzpq> SerializationT zza(KeyT keyt, Class<SerializationT> cls, zzcm zzcmVar) {
        return (SerializationT) this.zzb.get().zza(keyt, cls, zzcmVar);
    }

    public final <ParametersT extends zzcg, SerializationT extends zzpq> SerializationT zza(ParametersT parameterst, Class<SerializationT> cls) {
        return (SerializationT) this.zzb.get().zza((zzpt) parameterst, (Class) cls);
    }

    public final synchronized <SerializationT extends zzpq> void zza(zznd<SerializationT> zzndVar) {
        this.zzb.set(new zzps(this.zzb.get()).zza(zzndVar).zza());
    }

    public final synchronized <KeyT extends zzbo, SerializationT extends zzpq> void zza(zznh<KeyT, SerializationT> zznhVar) {
        this.zzb.set(new zzps(this.zzb.get()).zza(zznhVar).zza());
    }

    public final synchronized <SerializationT extends zzpq> void zza(zzoq<SerializationT> zzoqVar) {
        this.zzb.set(new zzps(this.zzb.get()).zza(zzoqVar).zza());
    }

    public final synchronized <ParametersT extends zzcg, SerializationT extends zzpq> void zza(zzou<ParametersT, SerializationT> zzouVar) {
        this.zzb.set(new zzps(this.zzb.get()).zza(zzouVar).zza());
    }

    public final <SerializationT extends zzpq> boolean zzb(SerializationT serializationt) {
        return this.zzb.get().zzb((zzpt) serializationt);
    }

    public final <SerializationT extends zzpq> boolean zzc(SerializationT serializationt) {
        return this.zzb.get().zzc((zzpt) serializationt);
    }
}
