package com.google.android.recaptcha.internal;

import dc.p;
import nc.d0;
import nc.r;
import rb.f;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzeb extends i implements p {
    public int zza;
    public final /* synthetic */ zzec zzb;
    public final /* synthetic */ r zzc;
    public final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzec zzecVar, r rVar, long j10, e eVar) {
        super(2, eVar);
        this.zzb = zzecVar;
        this.zzc = rVar;
        this.zzd = j10;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zzeb(this.zzb, this.zzc, this.zzd, eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        zzci zzciVar;
        vb.a aVar = vb.a.f16085a;
        try {
            if (this.zza != 0) {
                f.b(obj);
            } else {
                f.b(obj);
                zzbq zzbqVar = zzbq.zza;
                zzdz zzdzVar = new zzdz(this.zzb);
                zzea zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            ((Boolean) obj).booleanValue();
        } catch (zzbd e10) {
            zzec zzecVar = this.zzb;
            zzciVar = zzcm.zzd;
            zzecVar.zzf = zzciVar;
            this.zzc.h0(e10);
        }
        return h.f13851a;
    }
}
