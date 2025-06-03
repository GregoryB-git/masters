package com.google.android.recaptcha.internal;

import ub.e;
import wb.c;

/* loaded from: classes.dex */
final class zzcs extends c {
    public Object zza;
    public Object zzb;
    public Object zzc;
    public long zzd;
    public /* synthetic */ Object zze;
    public final /* synthetic */ zzcv zzf;
    public int zzg;
    public String zzh;
    public zzch zzi;
    public zzbi zzj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcs(zzcv zzcvVar, e eVar) {
        super(eVar);
        this.zzf = zzcvVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.zze = obj;
        this.zzg |= Integer.MIN_VALUE;
        return this.zzf.zzg(null, 0L, null, null, null, this);
    }
}
