/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.A4;
import com.google.android.gms.internal.measurement.D4;
import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.J3;
import com.google.android.gms.internal.measurement.T5;
import com.google.android.gms.internal.measurement.W5;
import com.google.android.gms.internal.measurement.Z4;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.n4;
import com.google.android.gms.internal.measurement.q3;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class L3
implements T5 {
    public final J3 a;

    public L3(J3 j32) {
        this.a = j32 = (J3)a4.f(j32, "output");
        j32.a = this;
    }

    public static L3 P(J3 j32) {
        L3 l32 = j32.a;
        if (l32 != null) {
            return l32;
        }
        return new L3(j32);
    }

    @Override
    public final void A(int n8, long l8) {
        this.a.q0(n8, l8);
    }

    @Override
    public final void B(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.V(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += J3.c((Double)list.get(n8));
                ++n8;
            }
            this.a.U(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.F((Double)list.get(n8));
            }
            return;
        }
        for (n9 = 0; n9 < list.size(); ++n9) {
            this.a.I(n8, (Double)list.get(n9));
        }
    }

    @Override
    public final void C(int n8, Object object, Z4 z42) {
        J3 j32 = this.a;
        object = (I4)object;
        j32.V(n8, 3);
        z42.i(object, j32.a);
        j32.V(n8, 4);
    }

    @Override
    public final void D(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.V(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += J3.d(((Float)list.get(n8)).floatValue());
                ++n8;
            }
            this.a.U(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.G(((Float)list.get(n8)).floatValue());
            }
            return;
        }
        for (n9 = 0; n9 < list.size(); ++n9) {
            this.a.J(n8, ((Float)list.get(n9)).floatValue());
        }
    }

    @Override
    public final void E(int n8, String string2) {
        this.a.q(n8, string2);
    }

    @Override
    public final void F(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.V(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += J3.f0((Long)list.get(n8));
                ++n8;
            }
            this.a.U(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.s((Long)list.get(n8));
            }
            return;
        }
        for (n9 = 0; n9 < list.size(); ++n9) {
            this.a.m(n8, (Long)list.get(n9));
        }
    }

    @Override
    public final void G(int n8, int n9) {
        this.a.y0(n8, n9);
    }

    @Override
    public final void H(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.V(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += J3.o0((Integer)list.get(n8));
                ++n8;
            }
            this.a.U(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.x0((Integer)list.get(n8));
            }
            return;
        }
        for (n9 = 0; n9 < list.size(); ++n9) {
            this.a.y0(n8, (Integer)list.get(n9));
        }
    }

    @Override
    public final void I(int n8, long l8) {
        this.a.L(n8, l8);
    }

    @Override
    public final void J(int n8, List list) {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            this.a.n(n8, (q3)list.get(i8));
        }
    }

    @Override
    public final void K(int n8, int n9) {
        this.a.K(n8, n9);
    }

    @Override
    public final void L(int n8, List list, Z4 z42) {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            this.C(n8, list.get(i8), z42);
        }
    }

    @Override
    public final void M(int n8, long l8) {
        this.a.m(n8, l8);
    }

    @Override
    public final void N(int n8, double d8) {
        this.a.I(n8, d8);
    }

    @Override
    public final void O(int n8, float f8) {
        this.a.J(n8, f8);
    }

    @Override
    public final int a() {
        return W5.a;
    }

    @Override
    public final void b(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.V(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += J3.S((Long)list.get(n8));
                ++n8;
            }
            this.a.U(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.s((Long)list.get(n8));
            }
            return;
        }
        for (n9 = 0; n9 < list.size(); ++n9) {
            this.a.m(n8, (Long)list.get(n9));
        }
    }

    @Override
    public final void c(int n8, boolean bl) {
        this.a.r(n8, bl);
    }

    @Override
    public final void d(int n8, Object object, Z4 z42) {
        this.a.p(n8, (I4)object, z42);
    }

    @Override
    public final void e(int n8) {
        this.a.V(n8, 4);
    }

    @Override
    public final void f(int n8, q3 q32) {
        this.a.n(n8, q32);
    }

    @Override
    public final void g(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.V(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += J3.k0((Integer)list.get(n8));
                ++n8;
            }
            this.a.U(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.k((Integer)list.get(n8));
            }
            return;
        }
        for (n9 = 0; n9 < list.size(); ++n9) {
            this.a.l(n8, (Integer)list.get(n9));
        }
    }

    @Override
    public final void h(int n8, int n9) {
        this.a.b0(n8, n9);
    }

    @Override
    public final void i(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.V(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += J3.n0((Long)list.get(n8));
                ++n8;
            }
            this.a.U(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.N((Long)list.get(n8));
            }
            return;
        }
        for (n9 = 0; n9 < list.size(); ++n9) {
            this.a.L(n8, (Long)list.get(n9));
        }
    }

    @Override
    public final void j(int n8, long l8) {
        this.a.L(n8, l8);
    }

    @Override
    public final void k(int n8, int n9) {
        this.a.l(n8, n9);
    }

    @Override
    public final void l(int n8) {
        this.a.V(n8, 3);
    }

    @Override
    public final void m(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.V(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += J3.h((Boolean)list.get(n8));
                ++n8;
            }
            this.a.U(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.O((Boolean)list.get(n8));
            }
            return;
        }
        for (n9 = 0; n9 < list.size(); ++n9) {
            this.a.r(n8, (Boolean)list.get(n9));
        }
    }

    @Override
    public final void n(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.V(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += J3.c0((Integer)list.get(n8));
                ++n8;
            }
            this.a.U(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.k((Integer)list.get(n8));
            }
            return;
        }
        for (n9 = 0; n9 < list.size(); ++n9) {
            this.a.l(n8, (Integer)list.get(n9));
        }
    }

    @Override
    public final void o(int n8, D4 d42, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.a.V(n8, 2);
            this.a.U(A4.a(d42, entry.getKey(), entry.getValue()));
            A4.b(this.a, d42, entry.getKey(), entry.getValue());
        }
    }

    @Override
    public final void p(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.V(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += J3.a0((Long)list.get(n8));
                ++n8;
            }
            this.a.U(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.N((Long)list.get(n8));
            }
            return;
        }
        for (n9 = 0; n9 < list.size(); ++n9) {
            this.a.L(n8, (Long)list.get(n9));
        }
    }

    @Override
    public final void q(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.V(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += J3.v0((Integer)list.get(n8));
                ++n8;
            }
            this.a.U(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.U((Integer)list.get(n8));
            }
            return;
        }
        for (n9 = 0; n9 < list.size(); ++n9) {
            this.a.b0(n8, (Integer)list.get(n9));
        }
    }

    @Override
    public final void r(int n8, int n9) {
        this.a.K(n8, n9);
    }

    @Override
    public final void s(int n8, long l8) {
        this.a.m(n8, l8);
    }

    @Override
    public final void t(int n8, Object object) {
        if (object instanceof q3) {
            this.a.M(n8, (q3)object);
            return;
        }
        this.a.o(n8, (I4)object);
    }

    @Override
    public final void u(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.V(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += J3.X((Integer)list.get(n8));
                ++n8;
            }
            this.a.U(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.H((Integer)list.get(n8));
            }
            return;
        }
        for (n9 = 0; n9 < list.size(); ++n9) {
            this.a.K(n8, (Integer)list.get(n9));
        }
    }

    @Override
    public final void v(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.V(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += J3.g0((Integer)list.get(n8));
                ++n8;
            }
            this.a.U(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.H((Integer)list.get(n8));
            }
            return;
        }
        for (n9 = 0; n9 < list.size(); ++n9) {
            this.a.K(n8, (Integer)list.get(n9));
        }
    }

    @Override
    public final void w(int n8, List list) {
        int n9;
        boolean bl = list instanceof n4;
        int n10 = 0;
        if (bl) {
            n4 n42 = (n4)list;
            for (n9 = n10; n9 < list.size(); ++n9) {
                Object object = n42.l(n9);
                if (object instanceof String) {
                    this.a.q(n8, (String)object);
                    continue;
                }
                this.a.n(n8, (q3)object);
            }
            return;
        }
        for (n9 = 0; n9 < list.size(); ++n9) {
            this.a.q(n8, (String)list.get(n9));
        }
    }

    @Override
    public final void x(int n8, int n9) {
        this.a.l(n8, n9);
    }

    @Override
    public final void y(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.V(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += J3.j0((Long)list.get(n8));
                ++n8;
            }
            this.a.U(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.r0((Long)list.get(n8));
            }
            return;
        }
        for (n9 = 0; n9 < list.size(); ++n9) {
            this.a.q0(n8, (Long)list.get(n9));
        }
    }

    @Override
    public final void z(int n8, List list, Z4 z42) {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            this.d(n8, list.get(i8), z42);
        }
    }
}

