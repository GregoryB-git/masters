package com.google.android.gms.internal.measurement;

import n7.q;
import n7.t;

/* loaded from: classes.dex */
public final class zzpe implements q<zzpd> {
    private static zzpe zza = new zzpe();
    private final q<zzpd> zzb = new t(new zzpg());

    public static boolean zza() {
        return ((zzpd) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzpd) zza.get()).zzb();
    }

    @Override // n7.q
    public final /* synthetic */ zzpd get() {
        return this.zzb.get();
    }
}
