package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzix extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzja zzb;
    public int zzc;
    public zzja zzd;
    public String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzix(zzja zzjaVar, e eVar) {
        super(eVar);
        this.zzb = zzjaVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Object zzG;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzG = this.zzb.zzG(null, this);
        return zzG;
    }
}
