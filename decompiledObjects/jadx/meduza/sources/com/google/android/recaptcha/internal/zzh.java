package com.google.android.recaptcha.internal;

import dc.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import nc.d;
import nc.d0;
import nc.j0;
import rb.e;
import rb.f;
import rb.h;
import ub.e;
import wb.i;
import x6.b;

/* loaded from: classes.dex */
final class zzh extends i implements p {
    public int zza;
    public final /* synthetic */ zzl zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(zzl zzlVar, String str, long j10, e eVar) {
        super(2, eVar);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j10;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, eVar);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        zzek zzekVar;
        zzen zzenVar;
        zzen zzenVar2;
        vb.a aVar = vb.a.f16085a;
        if (this.zza != 0) {
            zzenVar2 = (zzen) this.zze;
            f.b(obj);
        } else {
            f.b(obj);
            d0 d0Var = (d0) this.zze;
            zzekVar = this.zzb.zzb;
            if (zzekVar != null) {
                zzekVar.zzc(this.zzc);
                zzenVar = zzekVar.zzf(31);
            } else {
                zzenVar = null;
            }
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    arrayList.add(b.h(d0Var, new zzg(zzeVar, this.zzc, this.zzd, null)));
                }
            }
            j0[] j0VarArr = (j0[]) arrayList.toArray(new j0[0]);
            j0[] j0VarArr2 = (j0[]) Arrays.copyOf(j0VarArr, j0VarArr.length);
            this.zze = zzenVar;
            this.zza = 1;
            obj = d.a(j0VarArr2, this);
            if (obj == aVar) {
                return aVar;
            }
            zzenVar2 = zzenVar;
        }
        String str = this.zzc;
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object obj2 = ((rb.e) it.next()).f13846a;
            if (!(obj2 instanceof e.a)) {
                zzf.zzh((zzsi) obj2);
            }
        }
        zzsi zzsiVar = (zzsi) zzf.zzk();
        if (zzenVar2 != null) {
            zzenVar2.zza();
        }
        return zzsiVar;
    }
}
