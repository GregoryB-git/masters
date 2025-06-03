package com.google.android.recaptcha.internal;

import dc.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import nc.d;
import nc.d0;
import nc.j1;
import rb.f;
import rb.h;
import ub.e;
import wb.i;
import x6.b;

/* loaded from: classes.dex */
final class zzs extends i implements p {
    public int zza;
    public final /* synthetic */ zzv zzb;
    public final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzv zzvVar, String str, e eVar) {
        super(2, eVar);
        this.zzb = zzvVar;
        this.zzc = str;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        zzs zzsVar = new zzs(this.zzb, this.zzc, eVar);
        zzsVar.zzd = obj;
        return zzsVar;
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        zzsi zzq;
        List list;
        vb.a aVar = vb.a.f16085a;
        int i10 = this.zza;
        f.b(obj);
        if (i10 == 0) {
            d0 d0Var = (d0) this.zzd;
            ArrayList arrayList = new ArrayList();
            zzv zzvVar = this.zzb;
            zzvVar.zzo().put(this.zzc, arrayList);
            ArrayList arrayList2 = new ArrayList();
            list = this.zzb.zzb;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzy) obj2).zzf()) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.g0(d0Var, null, new zzr((zzy) it.next(), this.zzc, arrayList, null), 3));
            }
            j1[] j1VarArr = (j1[]) arrayList2.toArray(new j1[0]);
            j1[] j1VarArr2 = (j1[]) Arrays.copyOf(j1VarArr, j1VarArr.length);
            this.zza = 1;
            if (d.c(j1VarArr2, this) == aVar) {
                return aVar;
            }
        }
        zzq = this.zzb.zzq(this.zzc);
        return new rb.e(zzq);
    }
}
