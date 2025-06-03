package com.google.android.gms.internal.p002firebaseauthapi;

import a0.j;
import defpackage.f;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzpc {
    private final Map<zzpe, zzoy<?, ?>> zza;
    private final Map<Class<?>, zzpk<?, ?>> zzb;

    private zzpc(zzpf zzpfVar) {
        Map map;
        Map map2;
        map = zzpfVar.zza;
        this.zza = new HashMap(map);
        map2 = zzpfVar.zzb;
        this.zzb = new HashMap(map2);
    }

    public static zzpf zza() {
        return new zzpf();
    }

    public static zzpf zza(zzpc zzpcVar) {
        return new zzpf(zzpcVar);
    }

    public final Class<?> zza(Class<?> cls) {
        if (this.zzb.containsKey(cls)) {
            return this.zzb.get(cls).zza();
        }
        throw new GeneralSecurityException(j.j("No input primitive class for ", String.valueOf(cls), " available"));
    }

    public final <KeyT extends zzbo, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) {
        zzpe zzpeVar = new zzpe(keyt.getClass(), cls);
        if (this.zza.containsKey(zzpeVar)) {
            return (PrimitiveT) this.zza.get(zzpeVar).zza(keyt);
        }
        throw new GeneralSecurityException(j.j("No PrimitiveConstructor for ", String.valueOf(zzpeVar), " available"));
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT zza(zzpg<InputPrimitiveT> zzpgVar, Class<WrapperPrimitiveT> cls) {
        if (!this.zzb.containsKey(cls)) {
            throw new GeneralSecurityException(f.j("No wrapper found for ", String.valueOf(cls)));
        }
        zzpk<?, ?> zzpkVar = this.zzb.get(cls);
        if (zzpgVar.zzc().equals(zzpkVar.zza()) && zzpkVar.zza().equals(zzpgVar.zzc())) {
            return (WrapperPrimitiveT) zzpkVar.zza(zzpgVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
