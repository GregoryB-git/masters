package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.f;

/* loaded from: classes.dex */
final class zzalc implements zzalk {
    private zzalk[] zza;

    public zzalc(zzalk... zzalkVarArr) {
        this.zza = zzalkVarArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalk
    public final zzall zza(Class<?> cls) {
        for (zzalk zzalkVar : this.zza) {
            if (zzalkVar.zzb(cls)) {
                return zzalkVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException(f.j("No factory is available for message type: ", cls.getName()));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalk
    public final boolean zzb(Class<?> cls) {
        for (zzalk zzalkVar : this.zza) {
            if (zzalkVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
