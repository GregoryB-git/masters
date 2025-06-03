package com.google.android.recaptcha.internal;

import dc.p;
import nc.d0;
import rb.f;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzj extends i implements p {
    public int zza;
    public final /* synthetic */ zze zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ zzsc zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzj(zze zzeVar, long j10, zzsc zzscVar, e eVar) {
        super(2, eVar);
        this.zzb = zzeVar;
        this.zzc = j10;
        this.zzd = zzscVar;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zzj(this.zzb, this.zzc, this.zzd, eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzj) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Object zze;
        vb.a aVar = vb.a.f16085a;
        int i10 = this.zza;
        f.b(obj);
        if (i10 != 0) {
            zze = ((rb.e) obj).f13846a;
        } else {
            zze zzeVar = this.zzb;
            long j10 = this.zzc;
            zzsc zzscVar = this.zzd;
            this.zza = 1;
            zze = zzeVar.zze(j10, zzscVar, this);
            if (zze == aVar) {
                return aVar;
            }
        }
        return new rb.e(zze);
    }
}
