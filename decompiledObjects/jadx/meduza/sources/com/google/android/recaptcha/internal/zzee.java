package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzee extends c {
    public double zza;
    public /* synthetic */ Object zzb;
    public final /* synthetic */ zzef zzc;
    public int zzd;
    public zzef zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzee(zzef zzefVar, e eVar) {
        super(eVar);
        this.zzc = zzefVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzb(0L, this);
    }
}
