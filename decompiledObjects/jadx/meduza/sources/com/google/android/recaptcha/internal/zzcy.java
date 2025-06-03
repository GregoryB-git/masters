package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzcy extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzdc zzb;
    public int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcy(zzdc zzdcVar, e eVar) {
        super(eVar);
        this.zzb = zzdcVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Object zzf;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzf = this.zzb.zzf(null, 0L, this);
        return zzf == vb.a.f16085a ? zzf : new rb.e(zzf);
    }
}
