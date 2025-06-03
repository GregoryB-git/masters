/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.T5;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.v5;
import com.google.android.gms.internal.measurement.x5;

public final class z5
extends x5 {
    public static void m(Object object, v5 v52) {
        ((Y3)object).zzb = v52;
    }

    @Override
    public final /* synthetic */ int a(Object object) {
        return ((v5)object).a();
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        object = (v5)object;
        object2 = (v5)object2;
        if (v5.k().equals(object2)) {
            return object;
        }
        if (v5.k().equals(object)) {
            return v5.c((v5)object, (v5)object2);
        }
        return object.b((v5)object2);
    }

    @Override
    public final /* synthetic */ void c(Object object, int n8, q3 q32) {
        ((v5)object).e(n8 << 3 | 2, q32);
    }

    @Override
    public final /* synthetic */ void d(Object object, T5 t52) {
        ((v5)object).g(t52);
    }

    @Override
    public final /* synthetic */ int e(Object object) {
        return ((v5)object).i();
    }

    @Override
    public final /* synthetic */ void f(Object object, int n8, long l8) {
        ((v5)object).e(n8 << 3, l8);
    }

    @Override
    public final /* synthetic */ void g(Object object, T5 t52) {
        ((v5)object).j(t52);
    }

    @Override
    public final /* synthetic */ void h(Object object, Object object2) {
        z5.m(object, (v5)object2);
    }

    @Override
    public final /* synthetic */ Object i(Object object) {
        v5 v52;
        v5 v53 = v52 = ((Y3)object).zzb;
        if (v52 == v5.k()) {
            v53 = v5.l();
            z5.m(object, v53);
        }
        return v53;
    }

    @Override
    public final /* synthetic */ void j(Object object, Object object2) {
        z5.m(object, (v5)object2);
    }

    @Override
    public final /* synthetic */ Object k(Object object) {
        return ((Y3)object).zzb;
    }

    @Override
    public final void l(Object object) {
        ((Y3)object).zzb.m();
    }
}

