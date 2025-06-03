package com.google.android.recaptcha.internal;

import java.util.concurrent.Executors;
import nc.a2;
import nc.c1;
import nc.d0;
import nc.e0;
import nc.r0;
import sc.d;
import sc.n;
import tc.c;
import x6.b;

/* loaded from: classes.dex */
public final class zzbi {
    private final d0 zza;
    private final d0 zzb;
    private final d0 zzc;
    private final d0 zzd;

    public zzbi() {
        a2 a2Var = new a2(null);
        c cVar = r0.f11545a;
        this.zza = new d(a2Var.plus(n.f14360a));
        d a10 = e0.a(new c1(Executors.newSingleThreadExecutor()));
        b.g0(a10, null, new zzbh(null), 3);
        this.zzb = a10;
        this.zzc = e0.a(r0.f11546b);
        d a11 = e0.a(new c1(Executors.newSingleThreadExecutor()));
        b.g0(a11, null, new zzbg(null), 3);
        this.zzd = a11;
    }

    public final d0 zza() {
        return this.zzc;
    }

    public final d0 zzb() {
        return this.zza;
    }

    public final d0 zzc() {
        return this.zzd;
    }

    public final d0 zzd() {
        return this.zzb;
    }
}
