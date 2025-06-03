package com.google.android.recaptcha.internal;

import android.content.Context;
import ec.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Timer;
import kc.c;
import n7.w;
import nc.d0;
import p2.m0;
import rb.h;
import sb.b0;
import sb.r;
import x6.b;

/* loaded from: classes.dex */
public final class zzes implements zzeo {
    private static Timer zza;
    private final Context zzb;
    private final zzet zzc;
    private final d0 zzd;
    private final zzei zze;

    public zzes(Context context, zzet zzetVar, d0 d0Var) {
        zzei zzeiVar;
        this.zzb = context;
        this.zzc = zzetVar;
        this.zzd = d0Var;
        zzei zzeiVar2 = null;
        try {
            zzeiVar = zzei.zzd;
            zzeiVar = zzeiVar == null ? new zzei(context, null) : zzeiVar;
            zzei.zzd = zzeiVar;
            zzeiVar2 = zzeiVar;
        } catch (Exception unused) {
        }
        this.zze = zzeiVar2;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        ArrayList<List> arrayList;
        Iterator it;
        zzei zzeiVar;
        zztx zzk;
        int zzN;
        int i10;
        zzei zzeiVar2 = this.zze;
        if (zzeiVar2 != null) {
            List zzd = zzeiVar2.zzd();
            i.e(zzd, "<this>");
            if (zzd instanceof RandomAccess) {
                int size = zzd.size();
                arrayList = new ArrayList((size / 20) + (size % 20 == 0 ? 0 : 1));
                int i11 = 0;
                while (true) {
                    if (!(i11 >= 0 && i11 < size)) {
                        break;
                    }
                    int i12 = size - i11;
                    if (20 <= i12) {
                        i12 = 20;
                    }
                    ArrayList arrayList2 = new ArrayList(i12);
                    for (int i13 = 0; i13 < i12; i13++) {
                        arrayList2.add(zzd.get(i13 + i11));
                    }
                    arrayList.add(arrayList2);
                    i11 += 20;
                }
            } else {
                arrayList = new ArrayList();
                Iterator it2 = zzd.iterator();
                i.e(it2, "iterator");
                if (it2.hasNext()) {
                    b0 b0Var = new b0(20, 20, it2, false, true, null);
                    c cVar = new c();
                    cVar.f9246c = m0.u(cVar, cVar, b0Var);
                    it = cVar;
                } else {
                    it = r.f14323a;
                }
                while (it.hasNext()) {
                    arrayList.add((List) it.next());
                }
            }
            for (List<zzej> list : arrayList) {
                zzrd zzi = zzrf.zzi();
                ArrayList arrayList3 = new ArrayList();
                for (zzej zzejVar : list) {
                    try {
                        zzk = zztx.zzk(zzkh.zzg().zzj(zzejVar.zzc()));
                        zzN = zzk.zzN();
                        i10 = zzN - 1;
                    } catch (Exception unused) {
                        zzei zzeiVar3 = this.zze;
                        if (zzeiVar3 != null) {
                            zzeiVar3.zzf(zzejVar);
                        }
                    }
                    if (zzN == 0) {
                        throw null;
                    }
                    if (i10 == 0) {
                        zzi.zzq(zzk.zzf());
                    } else if (i10 == 1) {
                        zzi.zzr(zzk.zzg());
                    } else {
                        if (i10 != 2) {
                            throw new w();
                        }
                        h hVar = h.f13851a;
                    }
                    arrayList3.add(zzejVar);
                }
                if (zzi.zzf() + zzi.zze() != 0) {
                    if (this.zzc.zza(((zzrf) zzi.zzk()).zzd()) && (zzeiVar = this.zze) != null) {
                        zzeiVar.zza(arrayList3);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzep(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzeo
    public final void zza(zztx zztxVar) {
        b.g0(this.zzd, null, new zzer(this, zztxVar, null), 3);
        zzh();
    }
}
