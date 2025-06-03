package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import n7.q;
import n7.r;
import n7.s;
import o7.l;
import o7.o;
import o7.u;
import o7.x;
import o7.y;

/* loaded from: classes.dex */
public final class zzik {
    public static final q<y<String, String>> zza;

    static {
        q<y<String, String>> qVar = new q() { // from class: com.google.android.gms.internal.measurement.zzim
            @Override // n7.q
            public final Object get() {
                return zzik.zza();
            }
        };
        if (!(qVar instanceof s) && !(qVar instanceof r)) {
            qVar = qVar instanceof Serializable ? new r<>(qVar) : new s<>(qVar);
        }
        zza = qVar;
    }

    public static y zza() {
        Collection entrySet = new l().entrySet();
        if (((AbstractCollection) entrySet).isEmpty()) {
            return o.f;
        }
        l.a aVar = (l.a) entrySet;
        u.a aVar2 = new u.a(aVar.size());
        Iterator it = aVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            x q10 = x.q((Collection) entry.getValue());
            if (!q10.isEmpty()) {
                aVar2.b(key, q10);
                i10 += q10.size();
            }
        }
        return new y(aVar2.a(), i10);
    }
}
