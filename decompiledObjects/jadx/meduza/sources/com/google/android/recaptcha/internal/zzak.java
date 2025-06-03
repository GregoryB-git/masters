package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzak extends c {
    public Object zza;
    public /* synthetic */ Object zzb;
    public final /* synthetic */ zzan zzc;
    public int zzd;
    public zzan zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzak(zzan zzanVar, e eVar) {
        super(eVar);
        this.zzc = zzanVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zze(this);
    }
}
