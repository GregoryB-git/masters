package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzah extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzan zzb;
    public int zzc;
    public String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzah(zzan zzanVar, e eVar) {
        super(eVar);
        this.zzb = zzanVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Object zzj;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzj = this.zzb.zzj(null, this);
        return zzj;
    }
}
