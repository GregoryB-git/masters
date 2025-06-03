package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzim extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzja zzb;
    public int zzc;
    public zzja zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzim(zzja zzjaVar, e eVar) {
        super(eVar);
        this.zzb = zzjaVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Object zzE;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzE = this.zzb.zzE(null, this);
        return zzE;
    }
}
