package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzcu extends c {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzcv zzb;
    public int zzc;
    public zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcu(zzcv zzcvVar, e eVar) {
        super(eVar);
        this.zzb = zzcvVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Object zzj;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzj = this.zzb.zzj(null, 0, null, this);
        return zzj;
    }
}
