package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import dc.p;
import java.util.List;
import nc.d0;
import rb.f;
import rb.h;
import sb.q;
import ub.e;
import wb.i;

/* loaded from: classes.dex */
final class zzer extends i implements p {
    public final /* synthetic */ zzes zza;
    public final /* synthetic */ zztx zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzer(zzes zzesVar, zztx zztxVar, e eVar) {
        super(2, eVar);
        this.zza = zzesVar;
        this.zzb = zztxVar;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        return new zzer(this.zza, this.zzb, eVar);
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzer) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        zzei zzeiVar;
        zzei zzeiVar2;
        zzei zzeiVar3;
        zzei zzeiVar4;
        zzei zzeiVar5;
        zzei zzeiVar6;
        vb.a aVar = vb.a.f16085a;
        f.b(obj);
        zztx zztxVar = this.zzb;
        zzes zzesVar = this.zza;
        synchronized (zzeo.class) {
            zzeiVar = zzesVar.zze;
            if (zzeiVar != null) {
                byte[] zzd = zztxVar.zzd();
                zzej zzejVar = new zzej(zzkh.zzg().zzi(zzd, 0, zzd.length), System.currentTimeMillis(), 0);
                zzeiVar2 = zzesVar.zze;
                ContentValues contentValues = new ContentValues();
                contentValues.put("ss", zzejVar.zzc());
                contentValues.put("ts", Long.valueOf(zzejVar.zzb()));
                zzeiVar2.getWritableDatabase().insert("ce", null, contentValues);
                zzeiVar3 = zzesVar.zze;
                int zzb = zzeiVar3.zzb() - 500;
                if (zzb > 0) {
                    zzeiVar5 = zzesVar.zze;
                    List q10 = q.q(zzeiVar5.zzd(), zzb);
                    zzeiVar6 = zzesVar.zze;
                    zzeiVar6.zza(q10);
                }
                zzeiVar4 = zzesVar.zze;
                if (zzeiVar4.zzb() >= 20) {
                    zzesVar.zzg();
                }
            }
        }
        return h.f13851a;
    }
}
