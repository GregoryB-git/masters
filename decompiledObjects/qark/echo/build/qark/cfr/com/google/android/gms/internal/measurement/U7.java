/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.b;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.r;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.t;
import java.util.List;

public final class U7
extends n {
    public b q;

    public U7(b b8) {
        super("internal.registerCallback");
        this.q = b8;
    }

    @Override
    public final s b(f3 object, List object2) {
        C2.g(this.o, 3, (List)object2);
        String string2 = object.b((s)object2.get(0)).g();
        s s8 = object.b((s)object2.get(1));
        if (s8 instanceof t) {
            if ((object = object.b((s)object2.get(2))) instanceof r) {
                if ((object = (r)object).q("type")) {
                    object2 = object.i("type").g();
                    int n8 = object.q("priority") ? C2.i(object.i("priority").f()) : 1000;
                    this.q.c(string2, n8, (t)s8, (String)object2);
                    return s.d;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}

