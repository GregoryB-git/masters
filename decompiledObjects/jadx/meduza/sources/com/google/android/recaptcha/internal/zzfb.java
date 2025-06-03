package com.google.android.recaptcha.internal;

import dc.p;
import nc.d0;
import rb.f;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzfb extends i implements p {
    public final /* synthetic */ zzff zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzto zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfb(zzff zzffVar, String str, zzto zztoVar, e eVar) {
        super(2, eVar);
        this.zza = zzffVar;
        this.zzb = str;
        this.zzc = zztoVar;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zzfb(this.zza, this.zzb, this.zzc, eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfb) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        zzey zzg;
        vb.a aVar = vb.a.f16085a;
        f.b(obj);
        try {
            if (!zzff.zzb(this.zza).zzb(this.zzb)) {
                throw new zzbd(zzbb.zzc, zzba.zzQ, null);
            }
            zzg = this.zza.zzg();
            return zzg.zza(this.zzb, this.zzc);
        } catch (zzbd e10) {
            throw e10;
        } catch (Exception e11) {
            throw new zzbd(zzbb.zzb, zzba.zzaw, e11.getMessage());
        }
    }
}
