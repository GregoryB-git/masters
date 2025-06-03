package com.google.android.recaptcha.internal;

import dc.p;
import nc.d0;
import rb.f;
import rb.h;
import ub.e;
import wb.i;
import x6.b;

/* loaded from: classes.dex */
final class zzds extends i implements p {
    public int zza;
    public final /* synthetic */ zzdt zzb;
    public final /* synthetic */ zzen zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzdt zzdtVar, zzen zzenVar, e eVar) {
        super(2, eVar);
        this.zzb = zzdtVar;
        this.zzc = zzenVar;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zzds(this.zzb, this.zzc, eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzds) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        vb.a aVar = vb.a.f16085a;
        int i10 = this.zza;
        f.b(obj);
        if (i10 == 0) {
            zzdt zzdtVar = this.zzb;
            this.zza = 1;
            obj = b.z0(this, zzdtVar.zzi.zza().f(), new zzdh(zzdtVar, null));
            if (obj == aVar) {
                return aVar;
            }
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zza();
        return zzscVar;
    }
}
