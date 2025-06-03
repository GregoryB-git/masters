package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzi extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzl zzb;
    public int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzi(zzl zzlVar, e eVar) {
        super(eVar);
        this.zzb = zzlVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzc = this.zzb.zzc(0L, null, null, this);
        return zzc == vb.a.f16085a ? zzc : new rb.e(zzc);
    }
}
