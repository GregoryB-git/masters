package com.google.android.recaptcha.internal;

import dc.p;
import nc.d0;
import rb.f;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzg extends i implements p {
    public int zza;
    public final /* synthetic */ zze zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(zze zzeVar, String str, long j10, e eVar) {
        super(2, eVar);
        this.zzb = zzeVar;
        this.zzc = str;
        this.zzd = j10;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zzg(this.zzb, this.zzc, this.zzd, eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzg) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Object zzc;
        vb.a aVar = vb.a.f16085a;
        int i10 = this.zza;
        f.b(obj);
        if (i10 != 0) {
            zzc = ((rb.e) obj).f13846a;
        } else {
            zze zzeVar = this.zzb;
            String str = this.zzc;
            long j10 = this.zzd;
            this.zza = 1;
            zzc = zzeVar.zzc(str, j10, this);
            if (zzc == aVar) {
                return aVar;
            }
        }
        return new rb.e(zzc);
    }
}
