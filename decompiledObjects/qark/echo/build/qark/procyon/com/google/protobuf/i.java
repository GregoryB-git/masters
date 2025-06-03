// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.List;

public final class i implements n0
{
    public final h a;
    
    public i(h a) {
        a = (h)t.b(a, "output");
        this.a = a;
        a.a = this;
    }
    
    public static i P(final h h) {
        final i a = h.a;
        if (a != null) {
            return a;
        }
        return new i(h);
    }
    
    @Override
    public void A(final int n, final String s) {
        this.a.L0(n, s);
    }
    
    @Override
    public void B(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.N0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += h.J(list.get(i));
            }
            this.a.P0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.I0(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.H0(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void C(final int n, final long n2) {
        this.a.Q0(n, n2);
    }
    
    @Override
    public void D(final int n, final int n2) {
        this.a.j0(n, n2);
    }
    
    @Override
    public void E(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.N0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += h.y(list.get(i));
            }
            this.a.P0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.y0(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.x0(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void F(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.N0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += h.l(list.get(i));
            }
            this.a.P0(n2);
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
    public void G(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.N0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += h.j(list.get(i));
            }
            this.a.P0(n2);
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
    public void H(final int n, final int n2) {
        this.a.H0(n, n2);
    }
    
    @Override
    public void I(final int n, final List list) {
        for (int i = 0; i < list.size(); ++i) {
            this.a.f0(n, list.get(i));
        }
    }
    
    @Override
    public void J(final int n, final List list, final Z z) {
        for (int i = 0; i < list.size(); ++i) {
            this.N(n, list.get(i), z);
        }
    }
    
    @Override
    public void K(final int n, final List list, final Z z) {
        for (int i = 0; i < list.size(); ++i) {
            this.L(n, list.get(i), z);
        }
    }
    
    @Override
    public void L(final int n, final Object o, final Z z) {
        this.a.s0(n, (K)o, z);
    }
    
    @Override
    public void M(final int n, final f f) {
        this.a.f0(n, f);
    }
    
    @Override
    public void N(final int n, final Object o, final Z z) {
        this.a.z0(n, (K)o, z);
    }
    
    @Override
    public void O(final int n, final D.a a, final Map map) {
        if (this.a.W()) {
            this.T(n, a, map);
            return;
        }
        for (final Map.Entry<Object, V> entry : map.entrySet()) {
            this.a.N0(n, 2);
            this.a.P0(D.b(a, entry.getKey(), entry.getValue()));
            D.e(this.a, a, entry.getKey(), entry.getValue());
        }
    }
    
    public final void Q(final int n, final boolean b, final Object o, final D.a a) {
        this.a.N0(n, 2);
        this.a.P0(D.b(a, b, o));
        D.e(this.a, a, b, o);
    }
    
    public final void R(final int n, final D.a a, final Map map) {
        final int size = map.size();
        final int[] a2 = new int[size];
        final Iterator<Integer> iterator = map.keySet().iterator();
        final int n2 = 0;
        int n3 = 0;
        while (iterator.hasNext()) {
            a2[n3] = iterator.next();
            ++n3;
        }
        Arrays.sort(a2);
        for (int i = n2; i < size; ++i) {
            final int j = a2[i];
            final V value = map.get(j);
            this.a.N0(n, 2);
            this.a.P0(D.b(a, j, value));
            D.e(this.a, a, j, value);
        }
    }
    
    public final void S(final int n, final D.a a, final Map map) {
        final int size = map.size();
        final long[] a2 = new long[size];
        final Iterator<Long> iterator = map.keySet().iterator();
        final int n2 = 0;
        int n3 = 0;
        while (iterator.hasNext()) {
            a2[n3] = iterator.next();
            ++n3;
        }
        Arrays.sort(a2);
        for (int i = n2; i < size; ++i) {
            final long l = a2[i];
            final V value = map.get(l);
            this.a.N0(n, 2);
            this.a.P0(D.b(a, l, value));
            D.e(this.a, a, l, value);
        }
    }
    
    public final void T(final int n, final D.a a, final Map map) {
        switch (i$a.a[a.a.ordinal()]) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("does not support key type: ");
                sb.append(a.a);
                throw new IllegalArgumentException(sb.toString());
            }
            case 12: {
                this.U(n, a, map);
            }
            case 7:
            case 8:
            case 9:
            case 10:
            case 11: {
                this.S(n, a, map);
            }
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: {
                this.R(n, a, map);
            }
            case 1: {
                final Object value = map.get(Boolean.FALSE);
                if (value != null) {
                    this.Q(n, false, value, a);
                }
                final Object value2 = map.get(Boolean.TRUE);
                if (value2 != null) {
                    this.Q(n, true, value2, a);
                }
            }
        }
    }
    
    public final void U(final int n, final D.a a, final Map map) {
        final int size = map.size();
        final String[] a2 = new String[size];
        final Iterator<String> iterator = map.keySet().iterator();
        final int n2 = 0;
        int n3 = 0;
        while (iterator.hasNext()) {
            a2[n3] = iterator.next();
            ++n3;
        }
        Arrays.sort(a2);
        for (int i = n2; i < size; ++i) {
            final String s = a2[i];
            final V value = map.get(s);
            this.a.N0(n, 2);
            this.a.P0(D.b(a, s, value));
            D.e(this.a, a, s, value);
        }
    }
    
    public final void V(final int n, final Object o) {
        if (o instanceof String) {
            this.a.L0(n, (String)o);
            return;
        }
        this.a.f0(n, (f)o);
    }
    
    @Override
    public void a(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.N0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += h.w(list.get(i));
            }
            this.a.P0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.w0(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.v0(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void b(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.N0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += h.r(list.get(i));
            }
            this.a.P0(n2);
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
    public void c(final int n, final long n2) {
        this.a.x0(n, n2);
    }
    
    @Override
    public void d(final int n, final boolean b) {
        this.a.b0(n, b);
    }
    
    @Override
    public void e(final int n, final int n2) {
        this.a.O0(n, n2);
    }
    
    @Override
    public final void f(final int n, final Object o) {
        if (o instanceof f) {
            this.a.C0(n, (f)o);
            return;
        }
        this.a.B0(n, (K)o);
    }
    
    @Override
    public void g(final int n, final int n2) {
        this.a.D0(n, n2);
    }
    
    @Override
    public void h(final int n) {
        this.a.N0(n, 3);
    }
    
    @Override
    public void i(final int n, final int n2) {
        this.a.v0(n, n2);
    }
    
    @Override
    public void j(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.N0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += h.p(list.get(i));
            }
            this.a.P0(n2);
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
    public void k(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.N0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += h.F(list.get(i));
            }
            this.a.P0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.E0(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.D0(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void l(final int n, final int n2) {
        this.a.l0(n, n2);
    }
    
    @Override
    public void m(final int n, final double n2) {
        this.a.h0(n, n2);
    }
    
    @Override
    public void n(final int n, final long n2) {
        this.a.F0(n, n2);
    }
    
    @Override
    public void o(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.N0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += h.H(list.get(i));
            }
            this.a.P0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.G0(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.F0(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void p(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.N0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += h.n(list.get(i));
            }
            this.a.P0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.m0(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.l0(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void q(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.N0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += h.S(list.get(i));
            }
            this.a.P0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.R0(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.Q0(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void r(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.N0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += h.e(list.get(i));
            }
            this.a.P0(n2);
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
    public void s(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.N0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += h.Q(list.get(i));
            }
            this.a.P0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.P0(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.O0(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void t(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.N0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += h.L(list.get(i));
            }
            this.a.P0(n2);
            for (i = n; i < list.size(); ++i) {
                this.a.K0(list.get(i));
            }
        }
        else {
            while (j < list.size()) {
                this.a.J0(i, list.get(j));
                ++j;
            }
        }
    }
    
    @Override
    public void u(final int n, final long n2) {
        this.a.n0(n, n2);
    }
    
    @Override
    public a v() {
        return n0.a.o;
    }
    
    @Override
    public void w(final int n, final long n2) {
        this.a.J0(n, n2);
    }
    
    @Override
    public void x(final int n, final float n2) {
        this.a.p0(n, n2);
    }
    
    @Override
    public void y(final int n, final List list) {
        final boolean b = list instanceof z;
        int i = 0;
        final int n2 = 0;
        if (b) {
            final z z = (z)list;
            for (int j = n2; j < list.size(); ++j) {
                this.V(n, z.n(j));
            }
        }
        else {
            while (i < list.size()) {
                this.a.L0(n, list.get(i));
                ++i;
            }
        }
    }
    
    @Override
    public void z(final int n) {
        this.a.N0(n, 4);
    }
}
