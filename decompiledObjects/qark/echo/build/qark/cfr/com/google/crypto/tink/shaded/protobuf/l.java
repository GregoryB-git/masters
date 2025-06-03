/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.D;
import com.google.crypto.tink.shaded.protobuf.H;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.k;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.z;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class l
implements r0 {
    public final k a;

    public l(k k8) {
        this.a = k8 = (k)z.b(k8, "output");
        k8.a = this;
    }

    public static l P(k k8) {
        l l8 = k8.a;
        if (l8 != null) {
            return l8;
        }
        return new l(k8);
    }

    @Override
    public void A(int n8, String string2) {
        this.a.C0(n8, string2);
    }

    @Override
    public void B(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.D0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += k.G((Integer)list.get(n8));
                ++n8;
            }
            this.a.F0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.z0((Integer)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.y0(n8, (Integer)list.get(n9));
            }
        }
    }

    @Override
    public void C(int n8, long l8) {
        this.a.G0(n8, l8);
    }

    @Override
    public void D(int n8, int n9) {
        this.a.d0(n8, n9);
    }

    @Override
    public void E(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.D0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += k.w((Long)list.get(n8));
                ++n8;
            }
            this.a.F0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.q0((Long)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.p0(n8, (Long)list.get(n9));
            }
        }
    }

    @Override
    public void F(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.D0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += k.k((Integer)list.get(n8));
                ++n8;
            }
            this.a.F0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.e0((Integer)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.d0(n8, (Integer)list.get(n9));
            }
        }
    }

    @Override
    public void G(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.D0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += k.i((Double)list.get(n8));
                ++n8;
            }
            this.a.F0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.c0((Double)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.b0(n8, (Double)list.get(n9));
            }
        }
    }

    @Override
    public void H(int n8, int n9) {
        this.a.y0(n8, n9);
    }

    @Override
    public void I(int n8, List list) {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            this.a.a0(n8, (h)list.get(i8));
        }
    }

    @Override
    public void J(int n8, List list, e0 e02) {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            this.O(n8, list.get(i8), e02);
        }
    }

    @Override
    public void K(int n8, List list, e0 e02) {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            this.L(n8, list.get(i8), e02);
        }
    }

    @Override
    public void L(int n8, Object object, e0 e02) {
        this.a.r0(n8, (O)object, e02);
    }

    @Override
    public void M(int n8, h h8) {
        this.a.a0(n8, h8);
    }

    @Override
    public void N(int n8, H.a a8, Map map) {
        if (this.a.T()) {
            this.Q(n8, a8, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.a.D0(n8, 2);
            this.a.F0(H.a(a8, entry.getKey(), entry.getValue()));
            H.b(this.a, a8, entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void O(int n8, Object object, e0 e02) {
        this.a.l0(n8, (O)object, e02);
    }

    public final void Q(int n8, H.a arrn, Map map) {
        arrn = .a;
        throw null;
    }

    public final void R(int n8, Object object) {
        if (object instanceof String) {
            this.a.C0(n8, (String)object);
            return;
        }
        this.a.a0(n8, (h)object);
    }

    @Override
    public void a(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.D0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += k.u((Integer)list.get(n8));
                ++n8;
            }
            this.a.F0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.o0((Integer)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.n0(n8, (Integer)list.get(n9));
            }
        }
    }

    @Override
    public void b(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.D0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += k.q(((Float)list.get(n8)).floatValue());
                ++n8;
            }
            this.a.F0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.k0(((Float)list.get(n8)).floatValue());
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.j0(n8, ((Float)list.get(n9)).floatValue());
            }
        }
    }

    @Override
    public void c(int n8, long l8) {
        this.a.p0(n8, l8);
    }

    @Override
    public void d(int n8, boolean bl) {
        this.a.Y(n8, bl);
    }

    @Override
    public void e(int n8, int n9) {
        this.a.E0(n8, n9);
    }

    @Override
    public final void f(int n8, Object object) {
        if (object instanceof h) {
            this.a.t0(n8, (h)object);
            return;
        }
        this.a.s0(n8, (O)object);
    }

    @Override
    public void g(int n8, int n9) {
        this.a.u0(n8, n9);
    }

    @Override
    public void h(int n8) {
        this.a.D0(n8, 3);
    }

    @Override
    public void i(int n8, int n9) {
        this.a.n0(n8, n9);
    }

    @Override
    public void j(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.D0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += k.o((Long)list.get(n8));
                ++n8;
            }
            this.a.F0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.i0((Long)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.h0(n8, (Long)list.get(n9));
            }
        }
    }

    @Override
    public void k(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.D0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += k.C((Integer)list.get(n8));
                ++n8;
            }
            this.a.F0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.v0((Integer)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.u0(n8, (Integer)list.get(n9));
            }
        }
    }

    @Override
    public void l(int n8, int n9) {
        this.a.f0(n8, n9);
    }

    @Override
    public void m(int n8, double d8) {
        this.a.b0(n8, d8);
    }

    @Override
    public void n(int n8, long l8) {
        this.a.w0(n8, l8);
    }

    @Override
    public void o(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.D0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += k.E((Long)list.get(n8));
                ++n8;
            }
            this.a.F0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.x0((Long)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.w0(n8, (Long)list.get(n9));
            }
        }
    }

    @Override
    public void p(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.D0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += k.m((Integer)list.get(n8));
                ++n8;
            }
            this.a.F0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.g0((Integer)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.f0(n8, (Integer)list.get(n9));
            }
        }
    }

    @Override
    public void q(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.D0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += k.P((Long)list.get(n8));
                ++n8;
            }
            this.a.F0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.H0((Long)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.G0(n8, (Long)list.get(n9));
            }
        }
    }

    @Override
    public void r(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.D0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += k.e((Boolean)list.get(n8));
                ++n8;
            }
            this.a.F0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.Z((Boolean)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.Y(n8, (Boolean)list.get(n9));
            }
        }
    }

    @Override
    public void s(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.D0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += k.N((Integer)list.get(n8));
                ++n8;
            }
            this.a.F0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.F0((Integer)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.E0(n8, (Integer)list.get(n9));
            }
        }
    }

    @Override
    public void t(int n8, List list, boolean bl) {
        int n9;
        int n10 = 0;
        if (bl) {
            this.a.D0(n8, 2);
            n9 = n8 = 0;
            while (n8 < list.size()) {
                n9 += k.I((Long)list.get(n8));
                ++n8;
            }
            this.a.F0(n9);
            for (n8 = n10; n8 < list.size(); ++n8) {
                this.a.B0((Long)list.get(n8));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.A0(n8, (Long)list.get(n9));
            }
        }
    }

    @Override
    public void u(int n8, long l8) {
        this.a.h0(n8, l8);
    }

    @Override
    public r0.a v() {
        return r0.a.o;
    }

    @Override
    public void w(int n8, long l8) {
        this.a.A0(n8, l8);
    }

    @Override
    public void x(int n8, float f8) {
        this.a.j0(n8, f8);
    }

    @Override
    public void y(int n8, List list) {
        int n9;
        boolean bl = list instanceof D;
        int n10 = 0;
        if (bl) {
            D d8 = (D)list;
            for (n9 = n10; n9 < list.size(); ++n9) {
                this.R(n8, d8.n(n9));
            }
        } else {
            for (n9 = 0; n9 < list.size(); ++n9) {
                this.a.C0(n8, (String)list.get(n9));
            }
        }
    }

    @Override
    public void z(int n8) {
        this.a.D0(n8, 4);
    }

}

