package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzdj extends c {
    public Object zza;
    public /* synthetic */ Object zzb;
    public final /* synthetic */ zzdt zzc;
    public int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdj(zzdt zzdtVar, e eVar) {
        super(eVar);
        this.zzc = zzdtVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Object zzv;
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        zzv = this.zzc.zzv(null, 0L, this);
        return zzv;
    }
}
