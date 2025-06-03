// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.List;

public final class k implements s0
{
    public final j a;
    
    public k(j a) {
        a = (j)y.b(a, "output");
        this.a = a;
        a.a = this;
    }
    
    public static k P(final j j) {
        final k a = j.a;
        if (a != null) {
            return a;
        }
        return new k(j);
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
                n2 += androidx.datastore.preferences.protobuf.j.K(list.get(i));
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
                n2 += androidx.datastore.preferences.protobuf.j.x(list.get(i));
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
                n2 += androidx.datastore.preferences.protobuf.j.k(list.get(i));
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
                n2 += androidx.datastore.preferences.protobuf.j.i(list.get(i));
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
    public void J(final int n, final g g) {
        this.a.f0(n, g);
    }
    
    @Override
    public void K(final int n, final Object o, final e0 e0) {
        this.a.z0(n, (O)o, e0);
    }
    
    @Override
    public void L(final int n, final List list, final e0 e0) {
        for (int i = 0; i < list.size(); ++i) {
            this.K(n, list.get(i), e0);
        }
    }
    
    @Override
    public void M(final int n, final List list, final e0 e0) {
        for (int i = 0; i < list.size(); ++i) {
            this.O(n, list.get(i), e0);
        }
    }
    
    @Override
    public void N(final int n, final H.a a, final Map map) {
        if (this.a.Y()) {
            this.T(n, a, map);
            return;
        }
        for (final Map.Entry<Object, V> entry : map.entrySet()) {
            this.a.N0(n, 2);
            this.a.P0(H.b(a, entry.getKey(), entry.getValue()));
            H.e(this.a, a, entry.getKey(), entry.getValue());
        }
    }
    
    @Override
    public void O(final int n, final Object o, final e0 e0) {
        this.a.s0(n, (O)o, e0);
    }
    
    public final void Q(final int n, final boolean b, final Object o, final H.a a) {
        this.a.N0(n, 2);
        this.a.P0(H.b(a, b, o));
        H.e(this.a, a, b, o);
    }
    
    public final void R(final int n, final H.a a, final Map map) {
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
            this.a.P0(H.b(a, j, value));
            H.e(this.a, a, j, value);
        }
    }
    
    public final void S(final int n, final H.a a, final Map map) {
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
            this.a.P0(H.b(a, l, value));
            H.e(this.a, a, l, value);
        }
    }
    
    public final void T(final int n, final H.a a, final Map map) {
        switch (k$a.a[a.a.ordinal()]) {
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
    
    public final void U(final int n, final H.a a, final Map map) {
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
            this.a.P0(H.b(a, s, value));
            H.e(this.a, a, s, value);
        }
    }
    
    public final void V(final int n, final Object o) {
        if (o instanceof String) {
            this.a.L0(n, (String)o);
            return;
        }
        this.a.f0(n, (g)o);
    }
    
    @Override
    public void a(int i, final List list, final boolean b) {
        int j = 0;
        final int n = 0;
        if (b) {
            this.a.N0(i, 2);
            int n2;
            for (i = (n2 = 0); i < list.size(); ++i) {
                n2 += androidx.datastore.preferences.protobuf.j.v(list.get(i));
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
                n2 += androidx.datastore.preferences.protobuf.j.q(list.get(i));
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
        if (o instanceof g) {
            this.a.C0(n, (g)o);
            return;
        }
        this.a.B0(n, (O)o);
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
                n2 += androidx.datastore.preferences.protobuf.j.o(list.get(i));
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
                n2 += androidx.datastore.preferences.protobuf.j.G(list.get(i));
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
                n2 += androidx.datastore.preferences.protobuf.j.I(list.get(i));
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
                n2 += androidx.datastore.preferences.protobuf.j.m(list.get(i));
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
                n2 += androidx.datastore.preferences.protobuf.j.T(list.get(i));
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
                n2 += androidx.datastore.preferences.protobuf.j.d(list.get(i));
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
                n2 += androidx.datastore.preferences.protobuf.j.R(list.get(i));
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
                n2 += androidx.datastore.preferences.protobuf.j.M(list.get(i));
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
        return s0.a.o;
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
        final boolean b = list instanceof D;
        int i = 0;
        final int n2 = 0;
        if (b) {
            final D d = (D)list;
            for (int j = n2; j < list.size(); ++j) {
                this.V(n, d.n(j));
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
