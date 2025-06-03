package com.google.android.recaptcha.internal;

import dc.p;
import java.util.Timer;
import nc.d0;
import rb.f;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzeq extends i implements p {
    public final /* synthetic */ zzes zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeq(zzes zzesVar, e eVar) {
        super(2, eVar);
        this.zza = zzesVar;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zzeq(this.zza, eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeq) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        zzei zzeiVar;
        Timer timer;
        vb.a aVar = vb.a.f16085a;
        f.b(obj);
        zzes zzesVar = this.zza;
        synchronized (zzeo.class) {
            zzeiVar = zzesVar.zze;
            if (zzeiVar != null && zzeiVar.zzb() == 0) {
                timer = zzes.zza;
                if (timer != null) {
                    timer.cancel();
                }
                zzes.zza = null;
            }
            zzesVar.zzg();
        }
        return h.f13851a;
    }
}
