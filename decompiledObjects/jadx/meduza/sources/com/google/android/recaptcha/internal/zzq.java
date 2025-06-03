package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzq extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzv zzb;
    public int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzq(zzv zzvVar, e eVar) {
        super(eVar);
        this.zzb = zzvVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzf = this.zzb.zzf(null, this);
        return zzf == vb.a.f16085a ? zzf : new rb.e(zzf);
    }
}
