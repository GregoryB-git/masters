package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzdv extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzec zzb;
    public int zzc;
    public zzbn zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdv(zzec zzecVar, e eVar) {
        super(eVar);
        this.zzb = zzecVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Object zzl;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzl = this.zzb.zzl(null, this);
        return zzl;
    }
}
