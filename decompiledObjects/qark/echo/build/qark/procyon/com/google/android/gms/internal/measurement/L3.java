// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.List;

public final class L3 implements T5
{
    public final J3 a;
    
    public L3(J3 a) {
        a = (J3)a4.f(a, "output");
        this.a = a;
        a.a = this;
    }
    
    public static L3 P(final J3 j3) {
        final L3 a = j3.a;
        if (a != null) {
            return a;
        }
        return new L3(j3);
    }
    
    @Override
    public final void A(final int n, final long n2) {
        this.a.q0(n, n2);
    }
    
    @Override
    public final void B(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.V(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += J3.c(list.get(i));
            }
            this.a.U(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.F(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.I(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void C(final int n, final Object o, final Z4 z4) {
        final J3 a = this.a;
        final I4 i4 = (I4)o;
        a.V(n, 3);
        z4.i(i4, a.a);
        a.V(n, 4);
    }
    
    @Override
    public final void D(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.V(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += J3.d(list.get(i));
            }
            this.a.U(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.G(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.J(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void E(final int n, final String s) {
        this.a.q(n, s);
    }
    
    @Override
    public final void F(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.V(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += J3.f0(list.get(i));
            }
            this.a.U(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.s(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.m(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void G(final int n, final int n2) {
        this.a.y0(n, n2);
    }
    
    @Override
    public final void H(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.V(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += J3.o0(list.get(i));
            }
            this.a.U(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.x0(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.y0(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void I(final int n, final long n2) {
        this.a.L(n, n2);
    }
    
    @Override
    public final void J(final int n, final List list) {
        for (int i = 0; i < list.size(); ++i) {
            this.a.n(n, list.get(i));
        }
    }
    
    @Override
    public final void K(final int n, final int n2) {
        this.a.K(n, n2);
    }
    
    @Override
    public final void L(final int n, final List list, final Z4 z4) {
        for (int i = 0; i < list.size(); ++i) {
            this.C(n, list.get(i), z4);
        }
    }
    
    @Override
    public final void M(final int n, final long n2) {
        this.a.m(n, n2);
    }
    
    @Override
    public final void N(final int n, final double n2) {
        this.a.I(n, n2);
    }
    
    @Override
    public final void O(final int n, final float n2) {
        this.a.J(n, n2);
    }
    
    @Override
    public final int a() {
        return W5.a;
    }
    
    @Override
    public final void b(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.V(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += J3.S(list.get(i));
            }
            this.a.U(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.s(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.m(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void c(final int n, final boolean b) {
        this.a.r(n, b);
    }
    
    @Override
    public final void d(final int n, final Object o, final Z4 z4) {
        this.a.p(n, (I4)o, z4);
    }
    
    @Override
    public final void e(final int n) {
        this.a.V(n, 4);
    }
    
    @Override
    public final void f(final int n, final q3 q3) {
        this.a.n(n, q3);
    }
    
    @Override
    public final void g(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.V(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += J3.k0(list.get(i));
            }
            this.a.U(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.k(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.l(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void h(final int n, final int n2) {
        this.a.b0(n, n2);
    }
    
    @Override
    public final void i(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.V(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += J3.n0(list.get(i));
            }
            this.a.U(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.N(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.L(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void j(final int n, final long n2) {
        this.a.L(n, n2);
    }
    
    @Override
    public final void k(final int n, final int n2) {
        this.a.l(n, n2);
    }
    
    @Override
    public final void l(final int n) {
        this.a.V(n, 3);
    }
    
    @Override
    public final void m(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.V(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += J3.h(list.get(i));
            }
            this.a.U(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.O(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.r(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void n(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.V(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += J3.c0(list.get(i));
            }
            this.a.U(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.k(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.l(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void o(final int n, final D4 d4, final Map map) {
        for (final Map.Entry<Object, V> entry : map.entrySet()) {
            this.a.V(n, 2);
            this.a.U(A4.a(d4, entry.getKey(), entry.getValue()));
            A4.b(this.a, d4, entry.getKey(), entry.getValue());
        }
    }
    
    @Override
    public final void p(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.V(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += J3.a0(list.get(i));
            }
            this.a.U(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.N(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.L(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void q(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.V(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += J3.v0(list.get(i));
            }
            this.a.U(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.U(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.b0(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void r(final int n, final int n2) {
        this.a.K(n, n2);
    }
    
    @Override
    public final void s(final int n, final long n2) {
        this.a.m(n, n2);
    }
    
    @Override
    public final void t(final int n, final Object o) {
        if (o instanceof q3) {
            this.a.M(n, (q3)o);
            return;
        }
        this.a.o(n, (I4)o);
    }
    
    @Override
    public final void u(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.V(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += J3.X(list.get(i));
            }
            this.a.U(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.H(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.K(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void v(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.V(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += J3.g0(list.get(i));
            }
            this.a.U(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.H(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.K(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void w(final int n, final List list) {
        final boolean b = list instanceof n4;
        int i = 0;
        final int n2 = 0;
        if (b) {
            final n4 n3 = (n4)list;
            for (int j = n2; j < list.size(); ++j) {
                final Object l = n3.l(j);
                if (l instanceof String) {
                    this.a.q(n, (String)l);
                }
                else {
                    this.a.n(n, (q3)l);
                }
            }
            return;
        }
        while (i < list.size()) {
            this.a.q(n, list.get(i));
            ++i;
        }
    }
    
    @Override
    public final void x(final int n, final int n2) {
        this.a.l(n, n2);
    }
    
    @Override
    public final void y(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.V(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += J3.j0(list.get(i));
            }
            this.a.U(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.r0(list.get(i));
            }
            return;
        }
        while (j < list.size()) {
            this.a.q0(i, list.get(j));
            ++j;
        }
    }
    
    @Override
    public final void z(final int n, final List list, final Z4 z4) {
        for (int i = 0; i < list.size(); ++i) {
            this.d(n, list.get(i), z4);
        }
    }
}
