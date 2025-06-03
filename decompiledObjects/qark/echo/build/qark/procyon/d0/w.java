// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import g0.a;
import java.util.List;
import W2.k;
import java.util.Arrays;
import g0.M;
import android.net.Uri;
import android.os.Bundle;

public final class w
{
    public static final w H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public final Integer A;
    public final Integer B;
    public final CharSequence C;
    public final CharSequence D;
    public final CharSequence E;
    public final Integer F;
    public final Bundle G;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final Long h;
    public final byte[] i;
    public final Integer j;
    public final Uri k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Boolean o;
    public final Boolean p;
    public final Integer q;
    public final Integer r;
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final CharSequence x;
    public final CharSequence y;
    public final CharSequence z;
    
    static {
        H = new b().I();
        I = g0.M.w0(0);
        J = g0.M.w0(1);
        K = g0.M.w0(2);
        L = g0.M.w0(3);
        M = g0.M.w0(4);
        N = g0.M.w0(5);
        O = g0.M.w0(6);
        P = g0.M.w0(8);
        Q = g0.M.w0(9);
        R = g0.M.w0(10);
        S = g0.M.w0(11);
        T = g0.M.w0(12);
        U = g0.M.w0(13);
        V = g0.M.w0(14);
        W = g0.M.w0(15);
        X = g0.M.w0(16);
        Y = g0.M.w0(17);
        Z = g0.M.w0(18);
        a0 = g0.M.w0(19);
        b0 = g0.M.w0(20);
        c0 = g0.M.w0(21);
        d0 = g0.M.w0(22);
        e0 = g0.M.w0(23);
        f0 = g0.M.w0(24);
        g0 = g0.M.w0(25);
        h0 = g0.M.w0(26);
        i0 = g0.M.w0(27);
        j0 = g0.M.w0(28);
        k0 = g0.M.w0(29);
        l0 = g0.M.w0(30);
        m0 = g0.M.w0(31);
        n0 = g0.M.w0(32);
        o0 = g0.M.w0(33);
        p0 = g0.M.w0(1000);
    }
    
    public w(final b b) {
        final Boolean a = d0.w.b.a(b);
        final Integer l = d0.w.b.l(b);
        final Integer w = d0.w.b.w(b);
        boolean b2 = false;
        int b3 = 0;
        Integer n = null;
        Boolean value = null;
        Integer value2 = null;
        Label_0201: {
            if (a != null) {
                if (!a) {
                    n = -1;
                    value = a;
                    value2 = w;
                }
                else {
                    if (l != null) {
                        value = a;
                        n = l;
                        value2 = w;
                        if (l != -1) {
                            break Label_0201;
                        }
                    }
                    if (w != null) {
                        b3 = b(w);
                    }
                    n = b3;
                    value = a;
                    value2 = w;
                }
            }
            else {
                value = a;
                n = l;
                value2 = w;
                if (l != null) {
                    if (l != -1) {
                        b2 = true;
                    }
                    final Boolean b4 = value = b2;
                    n = l;
                    value2 = w;
                    if (b2) {
                        value = b4;
                        n = l;
                        if ((value2 = w) == null) {
                            value2 = c(l);
                            n = l;
                            value = b4;
                        }
                    }
                }
            }
        }
        this.a = d0.w.b.C(b);
        this.b = d0.w.b.D(b);
        this.c = d0.w.b.E(b);
        this.d = d0.w.b.F(b);
        this.e = d0.w.b.G(b);
        this.f = d0.w.b.H(b);
        this.g = d0.w.b.b(b);
        this.h = d0.w.b.c(b);
        d0.w.b.d(b);
        d0.w.b.e(b);
        this.i = d0.w.b.f(b);
        this.j = d0.w.b.g(b);
        this.k = d0.w.b.h(b);
        this.l = d0.w.b.i(b);
        this.m = d0.w.b.j(b);
        this.n = n;
        this.o = value;
        this.p = d0.w.b.k(b);
        this.q = d0.w.b.m(b);
        this.r = d0.w.b.m(b);
        this.s = d0.w.b.n(b);
        this.t = d0.w.b.o(b);
        this.u = d0.w.b.p(b);
        this.v = d0.w.b.q(b);
        this.w = d0.w.b.r(b);
        this.x = d0.w.b.s(b);
        this.y = d0.w.b.t(b);
        this.z = d0.w.b.u(b);
        this.A = d0.w.b.v(b);
        this.B = d0.w.b.x(b);
        this.C = d0.w.b.y(b);
        this.D = d0.w.b.z(b);
        this.E = d0.w.b.A(b);
        this.F = value2;
        this.G = d0.w.b.B(b);
    }
    
    public static int b(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 25: {
                return 6;
            }
            case 24: {
                return 5;
            }
            case 23: {
                return 4;
            }
            case 22: {
                return 3;
            }
            case 21: {
                return 2;
            }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35: {
                return 1;
            }
        }
    }
    
    public static int c(final int n) {
        switch (n) {
            default: {
                return 20;
            }
            case 6: {
                return 25;
            }
            case 5: {
                return 24;
            }
            case 4: {
                return 23;
            }
            case 3: {
                return 22;
            }
            case 2: {
                return 21;
            }
            case 1: {
                return 0;
            }
        }
    }
    
    public b a() {
        return new b(this, null);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (w.class != o.getClass()) {
            return false;
        }
        final w w = (w)o;
        return g0.M.c(this.a, w.a) && g0.M.c(this.b, w.b) && g0.M.c(this.c, w.c) && g0.M.c(this.d, w.d) && g0.M.c(this.e, w.e) && g0.M.c(this.f, w.f) && g0.M.c(this.g, w.g) && g0.M.c(this.h, w.h) && g0.M.c(null, null) && g0.M.c(null, null) && Arrays.equals(this.i, w.i) && g0.M.c(this.j, w.j) && g0.M.c(this.k, w.k) && g0.M.c(this.l, w.l) && g0.M.c(this.m, w.m) && g0.M.c(this.n, w.n) && g0.M.c(this.o, w.o) && g0.M.c(this.p, w.p) && g0.M.c(this.r, w.r) && g0.M.c(this.s, w.s) && g0.M.c(this.t, w.t) && g0.M.c(this.u, w.u) && g0.M.c(this.v, w.v) && g0.M.c(this.w, w.w) && g0.M.c(this.x, w.x) && g0.M.c(this.y, w.y) && g0.M.c(this.z, w.z) && g0.M.c(this.A, w.A) && g0.M.c(this.B, w.B) && g0.M.c(this.C, w.C) && g0.M.c(this.D, w.D) && g0.M.c(this.E, w.E) && g0.M.c(this.F, w.F) && this.G == null == (w.G == null);
    }
    
    @Override
    public int hashCode() {
        final CharSequence a = this.a;
        boolean b = false;
        final CharSequence b2 = this.b;
        final CharSequence c = this.c;
        final CharSequence d = this.d;
        final CharSequence e = this.e;
        final CharSequence f = this.f;
        final CharSequence g = this.g;
        final Long h = this.h;
        final int hashCode = Arrays.hashCode(this.i);
        final Integer j = this.j;
        final Uri k = this.k;
        final Integer l = this.l;
        final Integer m = this.m;
        final Integer n = this.n;
        final Boolean o = this.o;
        final Boolean p = this.p;
        final Integer r = this.r;
        final Integer s = this.s;
        final Integer t = this.t;
        final Integer u = this.u;
        final Integer v = this.v;
        final Integer w = this.w;
        final CharSequence x = this.x;
        final CharSequence y = this.y;
        final CharSequence z = this.z;
        final Integer a2 = this.A;
        final Integer b3 = this.B;
        final CharSequence c2 = this.C;
        final CharSequence d2 = this.D;
        final CharSequence e2 = this.E;
        final Integer f2 = this.F;
        if (this.G == null) {
            b = true;
        }
        return W2.k.b(a, b2, c, d, e, f, g, h, null, null, hashCode, j, k, l, m, n, o, p, r, s, t, u, v, w, x, y, z, a2, b3, c2, d2, e2, f2, b);
    }
    
    public static final class b
    {
        public Integer A;
        public CharSequence B;
        public CharSequence C;
        public CharSequence D;
        public Integer E;
        public Bundle F;
        public CharSequence a;
        public CharSequence b;
        public CharSequence c;
        public CharSequence d;
        public CharSequence e;
        public CharSequence f;
        public CharSequence g;
        public Long h;
        public byte[] i;
        public Integer j;
        public Uri k;
        public Integer l;
        public Integer m;
        public Integer n;
        public Boolean o;
        public Boolean p;
        public Integer q;
        public Integer r;
        public Integer s;
        public Integer t;
        public Integer u;
        public Integer v;
        public CharSequence w;
        public CharSequence x;
        public CharSequence y;
        public Integer z;
        
        public b() {
        }
        
        public b(final w w) {
            this.a = w.a;
            this.b = w.b;
            this.c = w.c;
            this.d = w.d;
            this.e = w.e;
            this.f = w.f;
            this.g = w.g;
            this.h = w.h;
            this.i = w.i;
            this.j = w.j;
            this.k = w.k;
            this.l = w.l;
            this.m = w.m;
            this.n = w.n;
            this.o = w.o;
            this.p = w.p;
            this.q = w.r;
            this.r = w.s;
            this.s = w.t;
            this.t = w.u;
            this.u = w.v;
            this.v = w.w;
            this.w = w.x;
            this.x = w.y;
            this.y = w.z;
            this.z = w.A;
            this.A = w.B;
            this.B = w.C;
            this.C = w.D;
            this.D = w.E;
            this.E = w.F;
            this.F = w.G;
        }
        
        public static /* synthetic */ CharSequence A(final b b) {
            return b.D;
        }
        
        public static /* synthetic */ Bundle B(final b b) {
            return b.F;
        }
        
        public static /* synthetic */ CharSequence C(final b b) {
            return b.a;
        }
        
        public static /* synthetic */ CharSequence D(final b b) {
            return b.b;
        }
        
        public static /* synthetic */ CharSequence E(final b b) {
            return b.c;
        }
        
        public static /* synthetic */ CharSequence F(final b b) {
            return b.d;
        }
        
        public static /* synthetic */ CharSequence G(final b b) {
            return b.e;
        }
        
        public static /* synthetic */ CharSequence H(final b b) {
            return b.f;
        }
        
        public static /* synthetic */ Boolean a(final b b) {
            return b.o;
        }
        
        public static /* synthetic */ CharSequence b(final b b) {
            return b.g;
        }
        
        public static /* synthetic */ Long c(final b b) {
            return b.h;
        }
        
        public static /* synthetic */ G d(final b b) {
            b.getClass();
            return null;
        }
        
        public static /* synthetic */ G e(final b b) {
            b.getClass();
            return null;
        }
        
        public static /* synthetic */ byte[] f(final b b) {
            return b.i;
        }
        
        public static /* synthetic */ Integer g(final b b) {
            return b.j;
        }
        
        public static /* synthetic */ Uri h(final b b) {
            return b.k;
        }
        
        public static /* synthetic */ Integer i(final b b) {
            return b.l;
        }
        
        public static /* synthetic */ Integer j(final b b) {
            return b.m;
        }
        
        public static /* synthetic */ Boolean k(final b b) {
            return b.p;
        }
        
        public static /* synthetic */ Integer l(final b b) {
            return b.n;
        }
        
        public static /* synthetic */ Integer m(final b b) {
            return b.q;
        }
        
        public static /* synthetic */ Integer n(final b b) {
            return b.r;
        }
        
        public static /* synthetic */ Integer o(final b b) {
            return b.s;
        }
        
        public static /* synthetic */ Integer p(final b b) {
            return b.t;
        }
        
        public static /* synthetic */ Integer q(final b b) {
            return b.u;
        }
        
        public static /* synthetic */ Integer r(final b b) {
            return b.v;
        }
        
        public static /* synthetic */ CharSequence s(final b b) {
            return b.w;
        }
        
        public static /* synthetic */ CharSequence t(final b b) {
            return b.x;
        }
        
        public static /* synthetic */ CharSequence u(final b b) {
            return b.y;
        }
        
        public static /* synthetic */ Integer v(final b b) {
            return b.z;
        }
        
        public static /* synthetic */ Integer w(final b b) {
            return b.E;
        }
        
        public static /* synthetic */ Integer x(final b b) {
            return b.A;
        }
        
        public static /* synthetic */ CharSequence y(final b b) {
            return b.B;
        }
        
        public static /* synthetic */ CharSequence z(final b b) {
            return b.C;
        }
        
        public w I() {
            return new w(this, null);
        }
        
        public b J(final byte[] array, final int n) {
            if (this.i == null || g0.M.c(n, 3) || !g0.M.c(this.j, 3)) {
                this.i = array.clone();
                this.j = n;
            }
            return this;
        }
        
        public b K(final w w) {
            if (w == null) {
                return this;
            }
            final CharSequence a = w.a;
            if (a != null) {
                this.n0(a);
            }
            final CharSequence b = w.b;
            if (b != null) {
                this.P(b);
            }
            final CharSequence c = w.c;
            if (c != null) {
                this.O(c);
            }
            final CharSequence d = w.d;
            if (d != null) {
                this.N(d);
            }
            final CharSequence e = w.e;
            if (e != null) {
                this.X(e);
            }
            final CharSequence f = w.f;
            if (f != null) {
                this.m0(f);
            }
            final CharSequence g = w.g;
            if (g != null) {
                this.V(g);
            }
            final Long h = w.h;
            if (h != null) {
                this.Y(h);
            }
            final Uri k = w.k;
            if (k != null || w.i != null) {
                this.R(k);
                this.Q(w.i, w.j);
            }
            final Integer l = w.l;
            if (l != null) {
                this.q0(l);
            }
            final Integer m = w.m;
            if (m != null) {
                this.p0(m);
            }
            final Integer n = w.n;
            if (n != null) {
                this.a0(n);
            }
            final Boolean o = w.o;
            if (o != null) {
                this.c0(o);
            }
            final Boolean p = w.p;
            if (p != null) {
                this.d0(p);
            }
            final Integer q = w.q;
            if (q != null) {
                this.h0(q);
            }
            final Integer r = w.r;
            if (r != null) {
                this.h0(r);
            }
            final Integer s = w.s;
            if (s != null) {
                this.g0(s);
            }
            final Integer t = w.t;
            if (t != null) {
                this.f0(t);
            }
            final Integer u = w.u;
            if (u != null) {
                this.k0(u);
            }
            final Integer v = w.v;
            if (v != null) {
                this.j0(v);
            }
            final Integer w2 = w.w;
            if (w2 != null) {
                this.i0(w2);
            }
            final CharSequence x = w.x;
            if (x != null) {
                this.r0(x);
            }
            final CharSequence y = w.y;
            if (y != null) {
                this.T(y);
            }
            final CharSequence z = w.z;
            if (z != null) {
                this.U(z);
            }
            final Integer a2 = w.A;
            if (a2 != null) {
                this.W(a2);
            }
            final Integer b2 = w.B;
            if (b2 != null) {
                this.o0(b2);
            }
            final CharSequence c2 = w.C;
            if (c2 != null) {
                this.b0(c2);
            }
            final CharSequence d2 = w.D;
            if (d2 != null) {
                this.S(d2);
            }
            final CharSequence e2 = w.E;
            if (e2 != null) {
                this.l0(e2);
            }
            final Integer f2 = w.F;
            if (f2 != null) {
                this.e0(f2);
            }
            final Bundle g2 = w.G;
            if (g2 != null) {
                this.Z(g2);
            }
            return this;
        }
        
        public b L(final x x) {
            for (int i = 0; i < x.e(); ++i) {
                x.d(i).D(this);
            }
            return this;
        }
        
        public b M(final List list) {
            for (int i = 0; i < list.size(); ++i) {
                final x x = list.get(i);
                for (int j = 0; j < x.e(); ++j) {
                    x.d(j).D(this);
                }
            }
            return this;
        }
        
        public b N(final CharSequence d) {
            this.d = d;
            return this;
        }
        
        public b O(final CharSequence c) {
            this.c = c;
            return this;
        }
        
        public b P(final CharSequence b) {
            this.b = b;
            return this;
        }
        
        public b Q(byte[] i, final Integer j) {
            if (i == null) {
                i = null;
            }
            else {
                i = i.clone();
            }
            this.i = i;
            this.j = j;
            return this;
        }
        
        public b R(final Uri k) {
            this.k = k;
            return this;
        }
        
        public b S(final CharSequence c) {
            this.C = c;
            return this;
        }
        
        public b T(final CharSequence x) {
            this.x = x;
            return this;
        }
        
        public b U(final CharSequence y) {
            this.y = y;
            return this;
        }
        
        public b V(final CharSequence g) {
            this.g = g;
            return this;
        }
        
        public b W(final Integer z) {
            this.z = z;
            return this;
        }
        
        public b X(final CharSequence e) {
            this.e = e;
            return this;
        }
        
        public b Y(final Long h) {
            g0.a.a(h == null || h >= 0L);
            this.h = h;
            return this;
        }
        
        public b Z(final Bundle f) {
            this.F = f;
            return this;
        }
        
        public b a0(final Integer n) {
            this.n = n;
            return this;
        }
        
        public b b0(final CharSequence b) {
            this.B = b;
            return this;
        }
        
        public b c0(final Boolean o) {
            this.o = o;
            return this;
        }
        
        public b d0(final Boolean p) {
            this.p = p;
            return this;
        }
        
        public b e0(final Integer e) {
            this.E = e;
            return this;
        }
        
        public b f0(final Integer s) {
            this.s = s;
            return this;
        }
        
        public b g0(final Integer r) {
            this.r = r;
            return this;
        }
        
        public b h0(final Integer q) {
            this.q = q;
            return this;
        }
        
        public b i0(final Integer v) {
            this.v = v;
            return this;
        }
        
        public b j0(final Integer u) {
            this.u = u;
            return this;
        }
        
        public b k0(final Integer t) {
            this.t = t;
            return this;
        }
        
        public b l0(final CharSequence d) {
            this.D = d;
            return this;
        }
        
        public b m0(final CharSequence f) {
            this.f = f;
            return this;
        }
        
        public b n0(final CharSequence a) {
            this.a = a;
            return this;
        }
        
        public b o0(final Integer a) {
            this.A = a;
            return this;
        }
        
        public b p0(final Integer m) {
            this.m = m;
            return this;
        }
        
        public b q0(final Integer l) {
            this.l = l;
            return this;
        }
        
        public b r0(final CharSequence w) {
            this.w = w;
            return this;
        }
    }
}
