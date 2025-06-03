package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import dc.p;
import nc.d0;
import rb.f;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzda extends i implements p {
    public int zza;
    public final /* synthetic */ zzdc zzb;
    public final /* synthetic */ RecaptchaAction zzc;
    public final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzda(zzdc zzdcVar, RecaptchaAction recaptchaAction, long j10, e eVar) {
        super(2, eVar);
        this.zzb = zzdcVar;
        this.zzc = recaptchaAction;
        this.zzd = j10;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zzda(this.zzb, this.zzc, this.zzd, eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzda) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Object zzf;
        vb.a aVar = vb.a.f16085a;
        int i10 = this.zza;
        f.b(obj);
        if (i10 != 0) {
            zzf = ((rb.e) obj).f13846a;
        } else {
            zzdc zzdcVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j10 = this.zzd;
            this.zza = 1;
            zzf = zzdcVar.zzf(recaptchaAction, j10, this);
            if (zzf == aVar) {
                return aVar;
            }
        }
        f.b(zzf);
        return zzf;
    }
}
