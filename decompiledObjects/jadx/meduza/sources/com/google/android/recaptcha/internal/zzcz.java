package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import dc.p;
import rb.f;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzcz extends i implements p {
    public int zza;
    public final /* synthetic */ zzdc zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ RecaptchaAction zzd;
    public final /* synthetic */ String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcz(zzdc zzdcVar, long j10, RecaptchaAction recaptchaAction, String str, e eVar) {
        super(2, eVar);
        this.zzb = zzdcVar;
        this.zzc = j10;
        this.zzd = recaptchaAction;
        this.zze = str;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zzcz(this.zzb, this.zzc, this.zzd, this.zze, eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcz) create((zzek) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        zzcn zzcnVar;
        vb.a aVar = vb.a.f16085a;
        int i10 = this.zza;
        f.b(obj);
        if (i10 == 0) {
            zzdc.zze(this.zzb, this.zzc, this.zzd);
            zzdc zzdcVar = this.zzb;
            String str = this.zze;
            RecaptchaAction recaptchaAction = this.zzd;
            long j10 = this.zzc;
            zzcnVar = zzdcVar.zzb;
            this.zza = 1;
            obj = zzcnVar.zza(str, recaptchaAction, j10, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new rb.e((String) obj);
    }
}
