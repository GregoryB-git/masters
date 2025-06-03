package com.google.android.gms.internal.measurement;

import n7.q;
import n7.t;

/* loaded from: classes.dex */
public final class zznp implements q<zzns> {
    private static zznp zza = new zznp();
    private final q<zzns> zzb = new t(new zznr());

    public static boolean zza() {
        return ((zzns) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzns) zza.get()).zzb();
    }

    @Override // n7.q
    public final /* synthetic */ zzns get() {
        return this.zzb.get();
    }
}
