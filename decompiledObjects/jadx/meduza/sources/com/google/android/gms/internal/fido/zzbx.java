package com.google.android.gms.internal.fido;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzbx {
    public static int zza(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 += next != null ? next.hashCode() : 0;
        }
        return i10;
    }
}
