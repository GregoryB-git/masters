package com.google.android.recaptcha.internal;

import ec.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sb.k;
import sb.s;

/* loaded from: classes.dex */
public final class zzhy {
    private List zza = s.f14324a;

    public final long zza(long[] jArr) {
        List list = this.zza;
        List<Long> q10 = k.q(jArr);
        i.e(list, "<this>");
        ArrayList arrayList = new ArrayList(q10.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(q10);
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = k.q(jArr);
    }
}
