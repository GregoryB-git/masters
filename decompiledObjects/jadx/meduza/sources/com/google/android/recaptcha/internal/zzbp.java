package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzbp extends c {
    public Object zza;
    public Object zzb;
    public long zzc;
    public long zzd;
    public double zze;
    public /* synthetic */ Object zzf;
    public final /* synthetic */ zzbq zzg;
    public int zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbp(zzbq zzbqVar, e eVar) {
        super(eVar);
        this.zzg = zzbqVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.zzf = obj;
        this.zzh |= Integer.MIN_VALUE;
        return this.zzg.zza(null, 0L, 0L, 0.0d, null, this);
    }
}
