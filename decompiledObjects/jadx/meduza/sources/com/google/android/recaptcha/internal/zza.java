package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zza extends c {
    public Object zza;
    public long zzb;
    public /* synthetic */ Object zzc;
    public final /* synthetic */ zze zzd;
    public int zze;
    public String zzf;
    public zzen zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(zze zzeVar, e eVar) {
        super(eVar);
        this.zzd = zzeVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        Object zzc = this.zzd.zzc(null, 0L, this);
        return zzc == vb.a.f16085a ? zzc : new rb.e(zzc);
    }
}
