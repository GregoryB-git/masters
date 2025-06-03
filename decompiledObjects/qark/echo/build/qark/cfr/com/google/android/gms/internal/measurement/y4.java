/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.d;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.r;
import com.google.android.gms.internal.measurement.s;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class y4
extends n {
    public final d q;

    public y4(d d8) {
        super("internal.eventLogger");
        this.q = d8;
    }

    @Override
    public final s b(f3 object, List list) {
        C2.g(this.o, 3, list);
        String string2 = object.b((s)list.get(0)).g();
        long l8 = (long)C2.a(object.b((s)list.get(1)).f());
        object = object.b((s)list.get(2));
        object = object instanceof r ? C2.e((r)object) : new HashMap();
        this.q.c(string2, l8, (Map)object);
        return s.d;
    }
}

