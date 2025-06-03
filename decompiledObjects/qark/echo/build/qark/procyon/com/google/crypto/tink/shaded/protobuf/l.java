// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;
import java.util.List;

public final class l implements r0
{
    public final k a;
    
    public l(k a) {
        a = (k)z.b(a, "output");
        this.a = a;
        a.a = this;
    }
    
    public static l P(final k k) {
        final l a = k.a;
        if (a != null) {
            return a;
        }
        return new l(k);
    }
    
    @Override
    public void A(final int n, final String s) {
        this.a.C0(n, s);
    }
    
    @Override
    public void B(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.D0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += k.G(list.get(i));
            }
            this.a.F0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.z0(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.y0(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void C(final int n, final long n2) {
        this.a.G0(n, n2);
    }
    
    @Override
    public void D(final int n, final int n2) {
        this.a.d0(n, n2);
    }
    
    @Override
    public void E(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.D0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += k.w(list.get(i));
            }
            this.a.F0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.q0(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.p0(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void F(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.D0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += k.k(list.get(i));
            }
            this.a.F0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.e0(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.d0(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void G(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.D0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += k.i(list.get(i));
            }
            this.a.F0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.c0(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.b0(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void H(final int n, final int n2) {
        this.a.y0(n, n2);
    }
    
    @Override
    public void I(final int n, final List list) {
        for (int i = 0; i < list.size(); ++i) {
            this.a.a0(n, list.get(i));
        }
    }
    
    @Override
    public void J(final int n, final List list, final e0 e0) {
        for (int i = 0; i < list.size(); ++i) {
            this.O(n, list.get(i), e0);
        }
    }
    
    @Override
    public void K(final int n, final List list, final e0 e0) {
        for (int i = 0; i < list.size(); ++i) {
            this.L(n, list.get(i), e0);
        }
    }
    
    @Override
    public void L(final int n, final Object o, final e0 e0) {
        this.a.r0(n, (O)o, e0);
    }
    
    @Override
    public void M(final int n, final h h) {
        this.a.a0(n, h);
    }
    
    @Override
    public void N(final int n, final H.a a, final Map map) {
        if (this.a.T()) {
            this.Q(n, a, map);
            return;
        }
        for (final Map.Entry<Object, V> entry : map.entrySet()) {
            this.a.D0(n, 2);
            this.a.F0(H.a(a, entry.getKey(), entry.getValue()));
            H.b(this.a, a, entry.getKey(), entry.getValue());
        }
    }
    
    @Override
    public void O(final int n, final Object o, final e0 e0) {
        this.a.l0(n, (O)o, e0);
    }
    
    public final void Q(final int n, final H.a a, final Map map) {
        final int[] a2 = l$a.a;
        throw null;
    }
    
    public final void R(final int n, final Object o) {
        if (o instanceof String) {
            this.a.C0(n, (String)o);
            return;
        }
        this.a.a0(n, (h)o);
    }
    
    @Override
    public void a(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.D0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += k.u(list.get(i));
            }
            this.a.F0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.o0(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.n0(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void b(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.D0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += k.q(list.get(i));
            }
            this.a.F0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.k0(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.j0(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void c(final int n, final long n2) {
        this.a.p0(n, n2);
    }
    
    @Override
    public void d(final int n, final boolean b) {
        this.a.Y(n, b);
    }
    
    @Override
    public void e(final int n, final int n2) {
        this.a.E0(n, n2);
    }
    
    @Override
    public final void f(final int n, final Object o) {
        if (o instanceof h) {
            this.a.t0(n, (h)o);
            return;
        }
        this.a.s0(n, (O)o);
    }
    
    @Override
    public void g(final int n, final int n2) {
        this.a.u0(n, n2);
    }
    
    @Override
    public void h(final int n) {
        this.a.D0(n, 3);
    }
    
    @Override
    public void i(final int n, final int n2) {
        this.a.n0(n, n2);
    }
    
    @Override
    public void j(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.D0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += k.o(list.get(i));
            }
            this.a.F0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.i0(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.h0(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void k(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.D0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += k.C(list.get(i));
            }
            this.a.F0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.v0(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.u0(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void l(final int n, final int n2) {
        this.a.f0(n, n2);
    }
    
    @Override
    public void m(final int n, final double n2) {
        this.a.b0(n, n2);
    }
    
    @Override
    public void n(final int n, final long n2) {
        this.a.w0(n, n2);
    }
    
    @Override
    public void o(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.D0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += k.E(list.get(i));
            }
            this.a.F0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.x0(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.w0(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void p(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.D0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += k.m(list.get(i));
            }
            this.a.F0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.g0(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.f0(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void q(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.D0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += k.P(list.get(i));
            }
            this.a.F0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.H0(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.G0(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void r(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.D0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += k.e(list.get(i));
            }
            this.a.F0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.Z(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.Y(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void s(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.D0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += k.N(list.get(i));
            }
            this.a.F0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.F0(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.E0(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void t(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.D0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += k.I(list.get(i));
            }
            this.a.F0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.B0(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.A0(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void u(final int n, final long n2) {
        this.a.h0(n, n2);
    }
    
    @Override
    public a v() {
        return r0.a.o;
    }
    
    @Override
    public void w(final int n, final long n2) {
        this.a.A0(n, n2);
    }
    
    @Override
    public void x(final int n, final float n2) {
        this.a.j0(n, n2);
    }
    
    @Override
    public void y(final int n, final List list) {
        final boolean b = list instanceof D;
        int i = 0;
        final int n2 = 0;
        if (b) {
            final D d = (D)list;
            for (int j = n2; j < list.size(); ++j) {
                this.R(n, d.n(j));
            }
        }
        else {
            while (i < list.size()) {
                this.a.C0(n, list.get(i));
                ++i;
            }
        }
    }
    
    @Override
    public void z(final int n) {
        this.a.D0(n, 4);
    }
}
