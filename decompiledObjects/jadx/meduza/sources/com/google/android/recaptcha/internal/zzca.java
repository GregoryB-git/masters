package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzca extends c {
    public Object zza;
    public /* synthetic */ Object zzb;
    public final /* synthetic */ zzcb zzc;
    public int zzd;
    public zzcb zze;
    public zzje zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzca(zzcb zzcbVar, e eVar) {
        super(eVar);
        this.zzc = zzcbVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzc(null, this);
    }
}
