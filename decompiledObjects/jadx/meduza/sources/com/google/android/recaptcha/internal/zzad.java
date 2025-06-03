package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzad extends c {
    public Object zza;
    public /* synthetic */ Object zzb;
    public final /* synthetic */ zzae zzc;
    public int zzd;
    public zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzad(zzae zzaeVar, e eVar) {
        super(eVar);
        this.zzc = zzaeVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzd(null, this);
    }
}
