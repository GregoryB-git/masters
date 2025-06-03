package com.google.android.recaptcha.internal;

import dc.p;
import ec.i;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import sb.s;

/* loaded from: classes.dex */
public final class zzfy extends zzfx {
    private final p zza;
    private final String zzb;

    public zzfy(p pVar, String str, Object obj) {
        super(obj);
        this.zza = pVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List list;
        if (!i.a(method.getName(), this.zzb)) {
            return false;
        }
        zztf zzf = zzti.zzf();
        if (objArr != null) {
            list = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zztg zzf2 = zzth.zzf();
                zzf2.zzw(obj2.toString());
                list.add((zzth) zzf2.zzk());
            }
        } else {
            list = s.f14324a;
        }
        zzf.zze(list);
        zzti zztiVar = (zzti) zzf.zzk();
        p pVar = this.zza;
        byte[] zzd = zztiVar.zzd();
        pVar.invoke(objArr, zzkh.zzh().zzi(zzd, 0, zzd.length));
        return true;
    }
}
