package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzc extends c {
    public Object zza;
    public /* synthetic */ Object zzb;
    public final /* synthetic */ zze zzc;
    public int zzd;
    public zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zze zzeVar, e eVar) {
        super(eVar);
        this.zzc = zzeVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object zze = this.zzc.zze(0L, null, this);
        return zze == vb.a.f16085a ? zze : new rb.e(zze);
    }
}
