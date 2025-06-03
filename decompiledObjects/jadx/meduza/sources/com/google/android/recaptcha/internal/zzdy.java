package com.google.android.recaptcha.internal;

import b.a0;
import dc.l;
import rb.f;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzdy extends i implements l {
    public int zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzec zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(long j10, zzec zzecVar, e eVar) {
        super(1, eVar);
        this.zzb = j10;
        this.zzc = zzecVar;
    }

    @Override // wb.a
    public final e create(e eVar) {
        return new zzdy(this.zzb, this.zzc, eVar);
    }

    @Override // dc.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzdy) create((e) obj)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        vb.a aVar = vb.a.f16085a;
        int i10 = this.zza;
        f.b(obj);
        if (i10 == 0) {
            long j10 = this.zzb;
            zzdx zzdxVar = new zzdx(this.zzc, null);
            this.zza = 1;
            if (a0.M(j10, zzdxVar, this) == aVar) {
                return aVar;
            }
        }
        return h.f13851a;
    }
}
