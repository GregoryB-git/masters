package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.f;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzps {
    private final Map<zzpu, zznh<?, ?>> zza;
    private final Map<zzpv, zznd<?>> zzb;
    private final Map<zzpu, zzou<?, ?>> zzc;
    private final Map<zzpv, zzoq<?>> zzd;

    public zzps() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public zzps(zzpt zzptVar) {
        this.zza = new HashMap(zzptVar.zza);
        this.zzb = new HashMap(zzptVar.zzb);
        this.zzc = new HashMap(zzptVar.zzc);
        this.zzd = new HashMap(zzptVar.zzd);
    }

    public final <SerializationT extends zzpq> zzps zza(zznd<SerializationT> zzndVar) {
        zzpv zzpvVar = new zzpv(zzndVar.zzb(), zzndVar.zza());
        if (this.zzb.containsKey(zzpvVar)) {
            zznd<?> zzndVar2 = this.zzb.get(zzpvVar);
            if (!zzndVar2.equals(zzndVar) || !zzndVar.equals(zzndVar2)) {
                throw new GeneralSecurityException(f.j("Attempt to register non-equal parser for already existing object of type: ", String.valueOf(zzpvVar)));
            }
        } else {
            this.zzb.put(zzpvVar, zzndVar);
        }
        return this;
    }

    public final zzpt zza() {
        return new zzpt(this);
    }

    public final <KeyT extends zzbo, SerializationT extends zzpq> zzps zza(zznh<KeyT, SerializationT> zznhVar) {
        zzpu zzpuVar = new zzpu(zznhVar.zza(), zznhVar.zzb());
        if (this.zza.containsKey(zzpuVar)) {
            zznh<?, ?> zznhVar2 = this.zza.get(zzpuVar);
            if (!zznhVar2.equals(zznhVar) || !zznhVar.equals(zznhVar2)) {
                throw new GeneralSecurityException(f.j("Attempt to register non-equal serializer for already existing object of type: ", String.valueOf(zzpuVar)));
            }
        } else {
            this.zza.put(zzpuVar, zznhVar);
        }
        return this;
    }

    public final <SerializationT extends zzpq> zzps zza(zzoq<SerializationT> zzoqVar) {
        zzpv zzpvVar = new zzpv(zzoqVar.zzb(), zzoqVar.zza());
        if (this.zzd.containsKey(zzpvVar)) {
            zzoq<?> zzoqVar2 = this.zzd.get(zzpvVar);
            if (!zzoqVar2.equals(zzoqVar) || !zzoqVar.equals(zzoqVar2)) {
                throw new GeneralSecurityException(f.j("Attempt to register non-equal parser for already existing object of type: ", String.valueOf(zzpvVar)));
            }
        } else {
            this.zzd.put(zzpvVar, zzoqVar);
        }
        return this;
    }

    public final <ParametersT extends zzcg, SerializationT extends zzpq> zzps zza(zzou<ParametersT, SerializationT> zzouVar) {
        zzpu zzpuVar = new zzpu(zzouVar.zza(), zzouVar.zzb());
        if (this.zzc.containsKey(zzpuVar)) {
            zzou<?, ?> zzouVar2 = this.zzc.get(zzpuVar);
            if (!zzouVar2.equals(zzouVar) || !zzouVar.equals(zzouVar2)) {
                throw new GeneralSecurityException(f.j("Attempt to register non-equal serializer for already existing object of type: ", String.valueOf(zzpuVar)));
            }
        } else {
            this.zzc.put(zzpuVar, zzouVar);
        }
        return this;
    }
}
