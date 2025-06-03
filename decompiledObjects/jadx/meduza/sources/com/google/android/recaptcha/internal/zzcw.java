package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzcw extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzdc zzb;
    public int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(zzdc zzdcVar, e eVar) {
        super(eVar);
        this.zzb = zzdcVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object mo3execute0E7RQCE = this.zzb.mo3execute0E7RQCE(null, 0L, this);
        return mo3execute0E7RQCE == vb.a.f16085a ? mo3execute0E7RQCE : new rb.e(mo3execute0E7RQCE);
    }
}
