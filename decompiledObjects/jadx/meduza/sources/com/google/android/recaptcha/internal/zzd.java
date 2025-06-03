package com.google.android.recaptcha.internal;

import dc.p;
import nc.d0;
import rb.f;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzd extends i implements p {
    public int zza;
    public final /* synthetic */ zze zzb;
    public final /* synthetic */ zzsc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(zze zzeVar, zzsc zzscVar, e eVar) {
        super(2, eVar);
        this.zzb = zzeVar;
        this.zzc = zzscVar;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zzd(this.zzb, this.zzc, eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        vb.a aVar = vb.a.f16085a;
        int i10 = this.zza;
        f.b(obj);
        if (i10 != 0) {
            zzh = ((rb.e) obj).f13846a;
        } else {
            zze zzeVar = this.zzb;
            zzsc zzscVar = this.zzc;
            this.zza = 1;
            zzh = zzeVar.zzh(zzscVar, this);
            if (zzh == aVar) {
                return aVar;
            }
        }
        return new rb.e(zzh);
    }
}
