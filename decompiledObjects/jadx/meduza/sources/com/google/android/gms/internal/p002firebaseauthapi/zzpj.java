package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwl;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzpj<P> {
    private final Class<P> zza;
    private Map<zzzn, List<zzpi<P>>> zzb;
    private final List<zzpi<P>> zzc;
    private zzpi<P> zzd;
    private zznr zze;

    private zzpj(Class<P> cls) {
        this.zzb = new HashMap();
        this.zzc = new ArrayList();
        this.zza = cls;
        this.zze = zznr.zza;
    }

    private final zzpj<P> zza(P p10, zzbo zzboVar, zzwl.zza zzaVar, boolean z10) {
        zzzn zzznVar;
        zzzn zzznVar2;
        if (this.zzb == null) {
            throw new IllegalStateException("addEntry cannot be called after build");
        }
        if (p10 == null) {
            throw new NullPointerException("`fullPrimitive` must not be null");
        }
        if (zzaVar.zzc() != zzwc.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        zzpi<P> zzpiVar = new zzpi<>(p10, zzzn.zza(zzbi.zza(zzaVar)), zzaVar.zzc(), zzaVar.zzf(), zzaVar.zza(), zzaVar.zzb().zzf(), zzboVar);
        Map<zzzn, List<zzpi<P>>> map = this.zzb;
        List<zzpi<P>> list = this.zzc;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzpiVar);
        zzznVar = ((zzpi) zzpiVar).zzb;
        List<zzpi<P>> put = map.put(zzznVar, Collections.unmodifiableList(arrayList));
        if (put != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(put);
            arrayList2.add(zzpiVar);
            zzznVar2 = ((zzpi) zzpiVar).zzb;
            map.put(zzznVar2, Collections.unmodifiableList(arrayList2));
        }
        list.add(zzpiVar);
        if (z10) {
            if (this.zzd != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.zzd = zzpiVar;
        }
        return this;
    }

    public final zzpg<P> zza() {
        Map<zzzn, List<zzpi<P>>> map = this.zzb;
        if (map == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        zzpg<P> zzpgVar = new zzpg<>(map, this.zzc, this.zzd, this.zze, this.zza);
        this.zzb = null;
        return zzpgVar;
    }

    public final zzpj<P> zza(zznr zznrVar) {
        if (this.zzb == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.zze = zznrVar;
        return this;
    }

    public final zzpj<P> zza(P p10, zzbo zzboVar, zzwl.zza zzaVar) {
        return zza(p10, zzboVar, zzaVar, false);
    }

    public final zzpj<P> zzb(P p10, zzbo zzboVar, zzwl.zza zzaVar) {
        return zza(p10, zzboVar, zzaVar, true);
    }
}
