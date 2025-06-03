package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzcx extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzdc zzb;
    public int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzdc zzdcVar, e eVar) {
        super(eVar);
        this.zzb = zzdcVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object mo4executegIAlus = this.zzb.mo4executegIAlus(null, this);
        return mo4executegIAlus == vb.a.f16085a ? mo4executegIAlus : new rb.e(mo4executegIAlus);
    }
}
