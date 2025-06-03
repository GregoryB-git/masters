package com.google.android.recaptcha.internal;

import dc.p;
import nc.d0;
import rb.f;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzdl extends i implements p {
    public int zza;
    public final /* synthetic */ zzdt zzb;
    public final /* synthetic */ zzsc zzc;
    public final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdl(zzdt zzdtVar, zzsc zzscVar, long j10, e eVar) {
        super(2, eVar);
        this.zzb = zzdtVar;
        this.zzc = zzscVar;
        this.zzd = j10;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zzdl(this.zzb, this.zzc, this.zzd, eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdl) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Object zzv;
        vb.a aVar = vb.a.f16085a;
        int i10 = this.zza;
        f.b(obj);
        if (i10 == 0) {
            zzdt zzdtVar = this.zzb;
            zzsc zzscVar = this.zzc;
            long j10 = this.zzd;
            this.zza = 1;
            zzv = zzdtVar.zzv(zzscVar, j10, this);
            if (zzv == aVar) {
                return aVar;
            }
        }
        return h.f13851a;
    }
}
