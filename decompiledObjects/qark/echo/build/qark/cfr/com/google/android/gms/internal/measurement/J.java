/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.A;
import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.M;
import com.google.android.gms.internal.measurement.Z;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.internal.measurement.s;
import java.util.List;

public final class J
extends A {
    public J() {
        this.a.add((Object)Z.q);
        this.a.add((Object)Z.k0);
        this.a.add((Object)Z.n0);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final s b(String object, f3 f32, List list) {
        int n8 = M.a[C2.c((String)object).ordinal()];
        if (n8 != 1) {
            if (n8 == 2) {
                C2.f(Z.k0, 1, list);
                return new h(f32.b((s)list.get(0)).d() ^ true);
            }
            if (n8 != 3) {
                return super.a((String)object);
            }
            C2.f(Z.n0, 2, list);
            object = f32.b((s)list.get(0));
            if (!object.d().booleanValue()) return f32.b((s)list.get(1));
            return object;
        }
        C2.f(Z.q, 2, list);
        object = f32.b((s)list.get(0));
        if (!object.d().booleanValue()) return object;
        return f32.b((s)list.get(1));
    }
}

