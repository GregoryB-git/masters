package com.google.android.recaptcha.internal;

import dc.p;
import java.util.List;
import nc.d0;
import rb.f;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzr extends i implements p {
    public int zza;
    public final /* synthetic */ zzy zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ List zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(zzy zzyVar, String str, List list, e eVar) {
        super(2, eVar);
        this.zzb = zzyVar;
        this.zzc = str;
        this.zzd = list;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zzr(this.zzb, this.zzc, this.zzd, eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        vb.a aVar = vb.a.f16085a;
        int i10 = this.zza;
        f.b(obj);
        if (i10 == 0) {
            zzy zzyVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            obj = zzyVar.zzc(str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        this.zzd.add((zzaa) obj);
        return h.f13851a;
    }
}
