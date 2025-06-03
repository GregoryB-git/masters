package com.google.android.recaptcha.internal;

import dc.p;
import java.util.Iterator;
import java.util.List;
import nc.d0;
import rb.f;
import rb.h;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzu extends i implements p {
    public Object zza;
    public Object zzb;
    public int zzc;
    public final /* synthetic */ zzsc zzd;
    public final /* synthetic */ zzv zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(zzsc zzscVar, zzv zzvVar, e eVar) {
        super(2, eVar);
        this.zzd = zzscVar;
        this.zze = zzvVar;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zzu(this.zzd, this.zze, eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzu) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        zzse zzj;
        List list;
        Iterator it;
        vb.a aVar = vb.a.f16085a;
        if (this.zzc != 0) {
            it = (Iterator) this.zzb;
            zzj = (zzse) this.zza;
            f.b(obj);
        } else {
            f.b(obj);
            if (!this.zzd.zzS()) {
                return new rb.e(f.a(new zzbd(zzbb.zzb, zzba.zzab, null)));
            }
            zzj = this.zzd.zzj();
            if (zzj.zzi().zzd() == 0) {
                return new rb.e(f.a(new zzbd(zzbb.zzb, zzba.zzab, null)));
            }
            this.zze.zzc = zzj.zzi();
            list = this.zze.zzb;
            it = list.iterator();
        }
        while (it.hasNext()) {
            zzy zzyVar = (zzy) it.next();
            this.zza = zzj;
            this.zzb = it;
            this.zzc = 1;
            if (zzyVar.zzd(zzj, this) == aVar) {
                return aVar;
            }
        }
        return new rb.e(h.f13851a);
    }
}
