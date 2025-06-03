/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.X4;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.s;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class X7
extends n {
    public final X4 q;
    public final Map r = new HashMap();

    public X7(X4 x42) {
        super("require");
        this.q = x42;
    }

    @Override
    public final s b(f3 object, List object2) {
        C2.g("require", 1, (List)object2);
        object = object.b((s)object2.get(0)).g();
        if (this.r.containsKey(object)) {
            return (s)this.r.get(object);
        }
        object2 = this.q.a((String)object);
        if (object2 instanceof n) {
            this.r.put(object, (Object)((n)object2));
        }
        return object2;
    }
}

