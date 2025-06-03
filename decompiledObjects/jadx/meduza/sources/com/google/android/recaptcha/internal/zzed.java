package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzed extends c {
    public double zza;
    public /* synthetic */ Object zzb;
    public final /* synthetic */ zzef zzc;
    public int zzd;
    public zzef zze;
    public String zzf;
    public RecaptchaAction zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzed(zzef zzefVar, e eVar) {
        super(eVar);
        this.zzc = zzefVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zza(null, null, 0L, this);
    }
}
