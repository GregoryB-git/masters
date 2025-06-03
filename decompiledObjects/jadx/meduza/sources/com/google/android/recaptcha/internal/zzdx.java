package com.google.android.recaptcha.internal;

import dc.p;
import nc.d0;
import nc.r;
import rb.f;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzdx extends i implements p {
    public int zza;
    public final /* synthetic */ zzec zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(zzec zzecVar, e eVar) {
        super(2, eVar);
        this.zzb = zzecVar;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zzdx(this.zzb, eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        r rVar;
        vb.a aVar = vb.a.f16085a;
        int i10 = this.zza;
        f.b(obj);
        if (i10 == 0) {
            rVar = this.zzb.zzc;
            this.zza = 1;
            if (rVar.await(this) == aVar) {
                return aVar;
            }
        }
        return h.f13851a;
    }
}
