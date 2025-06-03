package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzag extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzan zzb;
    public int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(zzan zzanVar, e eVar) {
        super(eVar);
        this.zzb = zzanVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Object zzi;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzi = this.zzb.zzi(this);
        return zzi;
    }
}
