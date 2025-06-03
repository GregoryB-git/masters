package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzdu extends c {
    public double zza;
    public /* synthetic */ Object zzb;
    public final /* synthetic */ zzec zzc;
    public int zzd;
    public zzec zze;
    public String zzf;
    public RecaptchaAction zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdu(zzec zzecVar, e eVar) {
        super(eVar);
        this.zzc = zzecVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zza(null, null, 0L, this);
    }
}
