/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.A;
import com.google.android.gms.internal.measurement.B;
import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.Z;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.s;
import java.util.List;

public final class y
extends A {
    public y() {
        this.a.add((Object)Z.t);
        this.a.add((Object)Z.u);
        this.a.add((Object)Z.v);
        this.a.add((Object)Z.w);
        this.a.add((Object)Z.x);
        this.a.add((Object)Z.y);
        this.a.add((Object)Z.z);
    }

    @Override
    public final s b(String string2, f3 f32, List list) {
        switch (B.a[C2.c(string2).ordinal()]) {
            default: {
                return super.a(string2);
            }
            case 7: {
                C2.f(Z.z, 2, list);
                return new k((double)(C2.i(f32.b((s)list.get(0)).f()) ^ C2.i(f32.b((s)list.get(1)).f())));
            }
            case 6: {
                C2.f(Z.y, 2, list);
                return new k((double)(C2.m(f32.b((s)list.get(0)).f()) >>> (int)(C2.m(f32.b((s)list.get(1)).f()) & 31L)));
            }
            case 5: {
                C2.f(Z.x, 2, list);
                return new k((double)(C2.i(f32.b((s)list.get(0)).f()) >> (int)(C2.m(f32.b((s)list.get(1)).f()) & 31L)));
            }
            case 4: {
                C2.f(Z.w, 2, list);
                return new k((double)(C2.i(f32.b((s)list.get(0)).f()) | C2.i(f32.b((s)list.get(1)).f())));
            }
            case 3: {
                C2.f(Z.v, 1, list);
                return new k((double)C2.i(f32.b((s)list.get(0)).f()));
            }
            case 2: {
                C2.f(Z.u, 2, list);
                return new k((double)(C2.i(f32.b((s)list.get(0)).f()) << (int)(C2.m(f32.b((s)list.get(1)).f()) & 31L)));
            }
            case 1: 
        }
        C2.f(Z.t, 2, list);
        return new k((double)(C2.i(f32.b((s)list.get(0)).f()) & C2.i(f32.b((s)list.get(1)).f())));
    }
}

