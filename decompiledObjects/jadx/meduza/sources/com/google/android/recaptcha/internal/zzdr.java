package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzdr extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzdt zzb;
    public int zzc;
    public zzdt zzd;
    public zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdr(zzdt zzdtVar, e eVar) {
        super(eVar);
        this.zzb = zzdtVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzo(0L, this);
    }
}
