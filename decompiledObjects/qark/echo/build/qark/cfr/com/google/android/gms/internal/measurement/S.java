/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.A;
import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.V;
import com.google.android.gms.internal.measurement.Z;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.u;
import java.util.List;

public final class S
extends A {
    public S() {
        this.a.add((Object)Z.p);
        this.a.add((Object)Z.K);
        this.a.add((Object)Z.h0);
        this.a.add((Object)Z.i0);
        this.a.add((Object)Z.j0);
        this.a.add((Object)Z.p0);
        this.a.add((Object)Z.q0);
        this.a.add((Object)Z.s0);
        this.a.add((Object)Z.t0);
        this.a.add((Object)Z.w0);
    }

    @Override
    public final s b(String object, f3 object2, List list) {
        switch (V.a[C2.c((String)object).ordinal()]) {
            default: {
                return super.a((String)object);
            }
            case 10: {
                C2.f(Z.w0, 2, list);
                object = object2.b((s)list.get(0));
                object2 = new k(object2.b((s)list.get(1)).f() * -1.0);
                return new k(object.f() + object2.f());
            }
            case 8: 
            case 9: {
                C2.g((String)object, 1, list);
                return object2.b((s)list.get(0));
            }
            case 6: 
            case 7: {
                C2.g((String)object, 2, list);
                object = object2.b((s)list.get(0));
                object2.b((s)list.get(1));
                return object;
            }
            case 5: {
                C2.f(Z.j0, 1, list);
                return new k(object2.b((s)list.get(0)).f() * -1.0);
            }
            case 4: {
                C2.f(Z.i0, 2, list);
                return new k(object2.b((s)list.get(0)).f() * object2.b((s)list.get(1)).f());
            }
            case 3: {
                C2.f(Z.h0, 2, list);
                return new k(object2.b((s)list.get(0)).f() % object2.b((s)list.get(1)).f());
            }
            case 2: {
                C2.f(Z.K, 2, list);
                return new k(object2.b((s)list.get(0)).f() / object2.b((s)list.get(1)).f());
            }
            case 1: 
        }
        C2.f(Z.p, 2, list);
        object = object2.b((s)list.get(0));
        object2 = object2.b((s)list.get(1));
        if (!(object instanceof m || object instanceof u || object2 instanceof m || object2 instanceof u)) {
            return new k(object.f() + object2.f());
        }
        object = object.g();
        object2 = object2.g();
        list = new StringBuilder();
        list.append((String)object);
        list.append((String)object2);
        return new u(list.toString());
    }
}

