package com.google.android.recaptcha.internal;

import dc.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
final class zzk extends i implements p {
    public int zza;
    public final /* synthetic */ zzl zzb;
    public final /* synthetic */ zzek zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ zzsc zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzl zzlVar, zzek zzekVar, long j10, zzsc zzscVar, e eVar) {
        super(2, eVar);
        this.zzb = zzlVar;
        this.zzc = zzekVar;
        this.zzd = j10;
        this.zze = zzscVar;
    }

    @Override // wb.a
    public final e create(Object obj, e eVar) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, eVar);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // dc.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((d0) obj, (e) obj2)).invokeSuspend(h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        zzen zzenVar;
        Object obj2;
        vb.a aVar = vb.a.f16085a;
        if (this.zza != 0) {
            zzenVar = (zzen) this.zzf;
            f.b(obj);
        } else {
            f.b(obj);
            d0 d0Var = (d0) this.zzf;
            this.zzb.zzb = this.zzc;
            zzek zzekVar = this.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzen zzf = zzekVar.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(b.h(d0Var, new zzj((zze) it.next(), this.zzd, this.zze, null)));
            }
            j0[] j0VarArr = (j0[]) arrayList.toArray(new j0[0]);
            j0[] j0VarArr2 = (j0[]) Arrays.copyOf(j0VarArr, j0VarArr.length);
            this.zzf = zzf;
            this.zza = 1;
            obj = d.a(j0VarArr2, this);
            if (obj == aVar) {
                return aVar;
            }
            zzenVar = zzf;
        }
        List list = (List) obj;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((rb.e) it2.next()).f13846a instanceof e.a)) {
                    zzenVar.zza();
                    obj2 = h.f13851a;
                    break;
                }
            }
        }
        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzY, null);
        zzenVar.zzb(zzbdVar);
        obj2 = f.a(zzbdVar);
        return new rb.e(obj2);
    }
}
