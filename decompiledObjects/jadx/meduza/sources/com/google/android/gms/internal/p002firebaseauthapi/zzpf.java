package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.f;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzpf {
    private final Map<zzpe, zzoy<?, ?>> zza;
    private final Map<Class<?>, zzpk<?, ?>> zzb;

    private zzpf() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    private zzpf(zzpc zzpcVar) {
        this.zza = new HashMap(zzpcVar.zza);
        this.zzb = new HashMap(zzpcVar.zzb);
    }

    public final zzpc zza() {
        return new zzpc(this);
    }

    public final <KeyT extends zzbo, PrimitiveT> zzpf zza(zzoy<KeyT, PrimitiveT> zzoyVar) {
        if (zzoyVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzpe zzpeVar = new zzpe(zzoyVar.zza(), zzoyVar.zzb());
        if (this.zza.containsKey(zzpeVar)) {
            zzoy<?, ?> zzoyVar2 = this.zza.get(zzpeVar);
            if (!zzoyVar2.equals(zzoyVar) || !zzoyVar.equals(zzoyVar2)) {
                throw new GeneralSecurityException(f.j("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ", String.valueOf(zzpeVar)));
            }
        } else {
            this.zza.put(zzpeVar, zzoyVar);
        }
        return this;
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> zzpf zza(zzpk<InputPrimitiveT, WrapperPrimitiveT> zzpkVar) {
        if (zzpkVar == null) {
            throw new NullPointerException("wrapper must be non-null");
        }
        Class<WrapperPrimitiveT> zzb = zzpkVar.zzb();
        if (this.zzb.containsKey(zzb)) {
            zzpk<?, ?> zzpkVar2 = this.zzb.get(zzb);
            if (!zzpkVar2.equals(zzpkVar) || !zzpkVar.equals(zzpkVar2)) {
                throw new GeneralSecurityException(f.j("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type", String.valueOf(zzb)));
            }
        } else {
            this.zzb.put(zzb, zzpkVar);
        }
        return this;
    }
}
