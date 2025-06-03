package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzir extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzja zzb;
    public int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzir(zzja zzjaVar, e eVar) {
        super(eVar);
        this.zzb = zzjaVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzh = this.zzb.zzh(null, this);
        return zzh == vb.a.f16085a ? zzh : new rb.e(zzh);
    }
}
