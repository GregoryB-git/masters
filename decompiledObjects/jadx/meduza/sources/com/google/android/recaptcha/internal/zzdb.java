package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzdb extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzdc zzb;
    public int zzc;
    public zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdb(zzdc zzdcVar, e eVar) {
        super(eVar);
        this.zzb = zzdcVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Object zzg;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzg = this.zzb.zzg(null, null, this);
        return zzg;
    }
}
