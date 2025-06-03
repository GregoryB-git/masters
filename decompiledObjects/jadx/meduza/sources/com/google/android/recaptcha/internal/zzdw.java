package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzdw extends c {
    public long zza;
    public /* synthetic */ Object zzb;
    public final /* synthetic */ zzec zzc;
    public int zzd;
    public zzec zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdw(zzec zzecVar, e eVar) {
        super(eVar);
        this.zzc = zzecVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Object zzm;
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        zzm = this.zzc.zzm(0L, this);
        return zzm;
    }
}
