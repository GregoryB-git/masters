package com.google.android.recaptcha.internal;

import dc.p;
import java.util.List;
import nc.d0;
import nc.j1;
import rb.f;
import rb.h;
import sb.q;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzfq extends i implements p {
    public int zza;
    public final /* synthetic */ zzgd zzb;
    public final /* synthetic */ List zzc;
    public final /* synthetic */ zzft zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzgd zzgdVar, List list, zzft zzftVar, e eVar) {
        super(2, eVar);
        this.zzb = zzgdVar;
        this.zzc = list;
        this.zzd = zzftVar;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        zzfq zzfqVar = new zzfq(this.zzb, this.zzc, this.zzd, eVar);
        zzfqVar.zze = obj;
        return zzfqVar;
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfq) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        vb.a aVar = vb.a.f16085a;
        int i10 = this.zza;
        f.b(obj);
        if (i10 == 0) {
            d0 d0Var = (d0) this.zze;
            while (true) {
                zzgd zzgdVar = this.zzb;
                if (zzgdVar.zza() < 0) {
                    break;
                }
                if (zzgdVar.zza() < this.zzc.size()) {
                    j1 j1Var = (j1) d0Var.f().get(j1.b.f11509a);
                    if (!(j1Var != null ? j1Var.isActive() : true)) {
                        break;
                    }
                    zzuf zzufVar = (zzuf) this.zzc.get(this.zzb.zza());
                    try {
                        zzft.zzf(this.zzd, zzufVar, this.zzb);
                    } catch (Exception e10) {
                        zzufVar.zzk();
                        new Integer(zzufVar.zzg());
                        q.p(zzufVar.zzj(), null, null, null, new zzfp(this.zzd), 31);
                        zzft zzftVar = this.zzd;
                        zzgd zzgdVar2 = this.zzb;
                        this.zza = 1;
                        zzh = zzftVar.zzh(e10, zzgdVar2, this);
                        if (zzh == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    break;
                }
            }
            return h.f13851a;
        }
        return h.f13851a;
    }
}
