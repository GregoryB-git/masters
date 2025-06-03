/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.E;
import com.google.android.gms.internal.measurement.X4;
import com.google.android.gms.internal.measurement.X7;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.r2;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.t;
import com.google.android.gms.internal.measurement.v;
import java.util.concurrent.Callable;

public final class F1 {
    public final E a;
    public final f3 b;
    public final f3 c;
    public final X4 d;

    public F1() {
        X4 x42;
        Object object = new E();
        this.a = object;
        this.c = object = new f3(null, (E)object);
        this.b = object.d();
        this.d = x42 = new X4();
        object.h("require", new X7(x42));
        x42.b("internal.platform", d1.o);
        object.h("runtime.counter", new k(0.0));
    }

    public final /* varargs */ s a(f3 f32, r2 ... arrr2) {
        s s8 = s.d;
        int n8 = arrr2.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            s8 = b4.a(arrr2[i8]);
            C2.b(this.c);
            if (!(s8 instanceof v) && !(s8 instanceof t)) continue;
            s8 = this.a.a(f32, s8);
        }
        return s8;
    }

    public final void b(String string2, Callable callable) {
        this.d.b(string2, callable);
    }
}

