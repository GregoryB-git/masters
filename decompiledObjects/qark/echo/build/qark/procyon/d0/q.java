// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import java.util.Collection;
import java.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import java.util.LinkedHashSet;
import java.util.Iterator;
import android.text.TextUtils;
import java.util.Collections;
import g0.a;
import X2.v;
import g0.M;
import java.util.List;

public final class q
{
    public static final q M;
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
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public final h A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public int L;
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final x k;
    public final Object l;
    public final String m;
    public final String n;
    public final int o;
    public final int p;
    public final List q;
    public final m r;
    public final long s;
    public final int t;
    public final int u;
    public final float v;
    public final int w;
    public final float x;
    public final byte[] y;
    public final int z;
    
    static {
        M = new b().K();
        N = g0.M.w0(0);
        O = g0.M.w0(1);
        P = g0.M.w0(2);
        Q = g0.M.w0(3);
        R = g0.M.w0(4);
        S = g0.M.w0(5);
        T = g0.M.w0(6);
        U = g0.M.w0(7);
        V = g0.M.w0(8);
        W = g0.M.w0(9);
        X = g0.M.w0(10);
        Y = g0.M.w0(11);
        Z = g0.M.w0(12);
        a0 = g0.M.w0(13);
        b0 = g0.M.w0(14);
        c0 = g0.M.w0(15);
        d0 = g0.M.w0(16);
        e0 = g0.M.w0(17);
        f0 = g0.M.w0(18);
        g0 = g0.M.w0(19);
        h0 = g0.M.w0(20);
        i0 = g0.M.w0(21);
        j0 = g0.M.w0(22);
        k0 = g0.M.w0(23);
        l0 = g0.M.w0(24);
        m0 = g0.M.w0(25);
        n0 = g0.M.w0(26);
        o0 = g0.M.w0(27);
        p0 = g0.M.w0(28);
        q0 = g0.M.w0(29);
        r0 = g0.M.w0(30);
        s0 = g0.M.w0(31);
        t0 = g0.M.w0(32);
    }
    
    public q(final b b) {
        this.a = d0.q.b.w(b);
        final String l0 = g0.M.L0(d0.q.b.E(b));
        this.d = l0;
        String b2 = null;
        Label_0076: {
            List c;
            if (d0.q.b.a(b).isEmpty() && d0.q.b.l(b) != null) {
                c = X2.v.Z(new t(l0, d0.q.b.l(b)));
            }
            else {
                if (!d0.q.b.a(b).isEmpty() && d0.q.b.l(b) == null) {
                    this.c = d0.q.b.a(b);
                    b2 = c(d0.q.b.a(b), l0);
                    break Label_0076;
                }
                g0.a.f(f(b));
                c = d0.q.b.a(b);
            }
            this.c = c;
            b2 = d0.q.b.l(b);
        }
        this.b = b2;
        this.e = d0.q.b.F(b);
        this.f = d0.q.b.G(b);
        int h = d0.q.b.H(b);
        this.g = h;
        final int i = d0.q.b.I(b);
        this.h = i;
        if (i != -1) {
            h = i;
        }
        this.i = h;
        this.j = d0.q.b.J(b);
        this.k = d0.q.b.b(b);
        this.l = d0.q.b.c(b);
        this.m = d0.q.b.d(b);
        this.n = d0.q.b.e(b);
        this.o = d0.q.b.f(b);
        this.p = d0.q.b.g(b);
        List<Object> q;
        if (d0.q.b.h(b) == null) {
            q = Collections.emptyList();
        }
        else {
            q = (List<Object>)d0.q.b.h(b);
        }
        this.q = q;
        final m j = d0.q.b.i(b);
        this.r = j;
        this.s = d0.q.b.j(b);
        this.t = d0.q.b.k(b);
        this.u = d0.q.b.m(b);
        this.v = d0.q.b.n(b);
        final int o = d0.q.b.o(b);
        final boolean b3 = false;
        int o2;
        if (o == -1) {
            o2 = 0;
        }
        else {
            o2 = d0.q.b.o(b);
        }
        this.w = o2;
        float p;
        if (d0.q.b.p(b) == -1.0f) {
            p = 1.0f;
        }
        else {
            p = d0.q.b.p(b);
        }
        this.x = p;
        this.y = d0.q.b.q(b);
        this.z = d0.q.b.r(b);
        this.A = d0.q.b.s(b);
        this.B = d0.q.b.t(b);
        this.C = d0.q.b.u(b);
        this.D = d0.q.b.v(b);
        int x;
        if (d0.q.b.x(b) == -1) {
            x = 0;
        }
        else {
            x = d0.q.b.x(b);
        }
        this.E = x;
        int y;
        if (d0.q.b.y(b) == -1) {
            y = (b3 ? 1 : 0);
        }
        else {
            y = d0.q.b.y(b);
        }
        this.F = y;
        this.G = d0.q.b.z(b);
        this.H = d0.q.b.A(b);
        this.I = d0.q.b.B(b);
        this.J = d0.q.b.C(b);
        int d;
        if (d0.q.b.D(b) == 0 && j != null) {
            d = 1;
        }
        else {
            d = d0.q.b.D(b);
        }
        this.K = d;
    }
    
    public static String c(final List list, final String s) {
        for (final t t : list) {
            if (TextUtils.equals((CharSequence)t.a, (CharSequence)s)) {
                return t.b;
            }
        }
        return list.get(0).b;
    }
    
    public static boolean f(final b b) {
        if (q.b.a(b).isEmpty() && q.b.l(b) == null) {
            return true;
        }
        for (int i = 0; i < q.b.a(b).size(); ++i) {
            if (((t)q.b.a(b).get(i)).b.equals(q.b.l(b))) {
                return true;
            }
        }
        return false;
    }
    
    public static String g(final q q) {
        if (q == null) {
            return "null";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(q.a);
        sb.append(", mimeType=");
        sb.append(q.n);
        if (q.m != null) {
            sb.append(", container=");
            sb.append(q.m);
        }
        if (q.i != -1) {
            sb.append(", bitrate=");
            sb.append(q.i);
        }
        if (q.j != null) {
            sb.append(", codecs=");
            sb.append(q.j);
        }
        if (q.r != null) {
            final LinkedHashSet<String> set = new LinkedHashSet<String>();
            int n = 0;
            while (true) {
                final m r = q.r;
                if (n >= r.r) {
                    break;
                }
                final UUID p = r.e(n).p;
                String string;
                if (p.equals(g.b)) {
                    string = "cenc";
                }
                else if (p.equals(g.c)) {
                    string = "clearkey";
                }
                else if (p.equals(g.e)) {
                    string = "playready";
                }
                else if (p.equals(g.d)) {
                    string = "widevine";
                }
                else if (p.equals(g.a)) {
                    string = "universal";
                }
                else {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("unknown (");
                    sb2.append(p);
                    sb2.append(")");
                    string = sb2.toString();
                }
                set.add(string);
                ++n;
            }
            sb.append(", drm=[");
            W2.h.f(',').b(sb, set);
            sb.append(']');
        }
        if (q.t != -1 && q.u != -1) {
            sb.append(", res=");
            sb.append(q.t);
            sb.append("x");
            sb.append(q.u);
        }
        final h a = q.A;
        if (a != null && a.i()) {
            sb.append(", color=");
            sb.append(q.A.m());
        }
        if (q.v != -1.0f) {
            sb.append(", fps=");
            sb.append(q.v);
        }
        if (q.B != -1) {
            sb.append(", channels=");
            sb.append(q.B);
        }
        if (q.C != -1) {
            sb.append(", sample_rate=");
            sb.append(q.C);
        }
        if (q.d != null) {
            sb.append(", language=");
            sb.append(q.d);
        }
        if (!q.c.isEmpty()) {
            sb.append(", labels=[");
            W2.h.f(',').b(sb, q.c);
            sb.append("]");
        }
        if (q.e != 0) {
            sb.append(", selectionFlags=[");
            W2.h.f(',').b(sb, g0.M.j0(q.e));
            sb.append("]");
        }
        if (q.f != 0) {
            sb.append(", roleFlags=[");
            W2.h.f(',').b(sb, g0.M.i0(q.f));
            sb.append("]");
        }
        if (q.l != null) {
            sb.append(", customData=");
            sb.append(q.l);
        }
        return sb.toString();
    }
    
    public b a() {
        return new b(this, null);
    }
    
    public q b(final int n) {
        return this.a().R(n).K();
    }
    
    public int d() {
        final int t = this.t;
        int n = -1;
        if (t != -1) {
            final int u = this.u;
            if (u == -1) {
                return -1;
            }
            n = t * u;
        }
        return n;
    }
    
    public boolean e(final q q) {
        if (this.q.size() != q.q.size()) {
            return false;
        }
        for (int i = 0; i < this.q.size(); ++i) {
            if (!Arrays.equals((byte[])this.q.get(i), (byte[])q.q.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (q.class != o.getClass()) {
            return false;
        }
        final q q = (q)o;
        final int l = this.L;
        if (l != 0) {
            final int i = q.L;
            if (i != 0 && l != i) {
                return false;
            }
        }
        return this.e == q.e && this.f == q.f && this.g == q.g && this.h == q.h && this.o == q.o && this.s == q.s && this.t == q.t && this.u == q.u && this.w == q.w && this.z == q.z && this.B == q.B && this.C == q.C && this.D == q.D && this.E == q.E && this.F == q.F && this.G == q.G && this.I == q.I && this.J == q.J && this.K == q.K && Float.compare(this.v, q.v) == 0 && Float.compare(this.x, q.x) == 0 && Objects.equals(this.a, q.a) && Objects.equals(this.b, q.b) && this.c.equals(q.c) && Objects.equals(this.j, q.j) && Objects.equals(this.m, q.m) && Objects.equals(this.n, q.n) && Objects.equals(this.d, q.d) && Arrays.equals(this.y, q.y) && Objects.equals(this.k, q.k) && Objects.equals(this.A, q.A) && Objects.equals(this.r, q.r) && this.e(q) && Objects.equals(this.l, q.l);
    }
    
    public q h(final q q) {
        if (this == q) {
            return this;
        }
        final int k = d0.z.k(this.n);
        final String a = q.a;
        final int i = q.I;
        final int j = q.J;
        String s = q.b;
        if (s == null) {
            s = this.b;
        }
        List list;
        if (!q.c.isEmpty()) {
            list = q.c;
        }
        else {
            list = this.c;
        }
        final String d = this.d;
        String s2 = null;
        Label_0122: {
            if (k != 3) {
                s2 = d;
                if (k != 1) {
                    break Label_0122;
                }
            }
            final String d2 = q.d;
            s2 = d;
            if (d2 != null) {
                s2 = d2;
            }
        }
        int n;
        if ((n = this.g) == -1) {
            n = q.g;
        }
        int n2;
        if ((n2 = this.h) == -1) {
            n2 = q.h;
        }
        final String l = this.j;
        String s3;
        if ((s3 = l) == null) {
            final String q2 = g0.M.Q(q.j, k);
            s3 = l;
            if (g0.M.d1(q2).length == 1) {
                s3 = q2;
            }
        }
        final x m = this.k;
        x x;
        if (m == null) {
            x = q.k;
        }
        else {
            x = m.b(q.k);
        }
        float n4;
        final float n3 = n4 = this.v;
        if (n3 == -1.0f) {
            n4 = n3;
            if (k == 2) {
                n4 = q.v;
            }
        }
        return this.a().a0(a).c0(s).d0(list).e0(s2).q0(this.e | q.e).m0(this.f | q.f).M(n).j0(n2).O(s3).h0(x).U(d0.m.d(q.r, this.r)).X(n4).t0(i).u0(j).K();
    }
    
    @Override
    public int hashCode() {
        if (this.L == 0) {
            final String a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final String b = this.b;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final int hashCode4 = this.c.hashCode();
            final String d = this.d;
            int hashCode5;
            if (d == null) {
                hashCode5 = 0;
            }
            else {
                hashCode5 = d.hashCode();
            }
            final int e = this.e;
            final int f = this.f;
            final int g = this.g;
            final int h = this.h;
            final String j = this.j;
            int hashCode6;
            if (j == null) {
                hashCode6 = 0;
            }
            else {
                hashCode6 = j.hashCode();
            }
            final x k = this.k;
            int hashCode7;
            if (k == null) {
                hashCode7 = 0;
            }
            else {
                hashCode7 = k.hashCode();
            }
            final Object l = this.l;
            int hashCode8;
            if (l == null) {
                hashCode8 = 0;
            }
            else {
                hashCode8 = l.hashCode();
            }
            final String m = this.m;
            int hashCode9;
            if (m == null) {
                hashCode9 = 0;
            }
            else {
                hashCode9 = m.hashCode();
            }
            final String n = this.n;
            if (n != null) {
                hashCode = n.hashCode();
            }
            this.L = (((((((((((((((((((((((((((((527 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + e) * 31 + f) * 31 + g) * 31 + h) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode) * 31 + this.o) * 31 + (int)this.s) * 31 + this.t) * 31 + this.u) * 31 + Float.floatToIntBits(this.v)) * 31 + this.w) * 31 + Float.floatToIntBits(this.x)) * 31 + this.z) * 31 + this.B) * 31 + this.C) * 31 + this.D) * 31 + this.E) * 31 + this.F) * 31 + this.G) * 31 + this.I) * 31 + this.J) * 31 + this.K;
        }
        return this.L;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.i);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.t);
        sb.append(", ");
        sb.append(this.u);
        sb.append(", ");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.A);
        sb.append("], [");
        sb.append(this.B);
        sb.append(", ");
        sb.append(this.C);
        sb.append("])");
        return sb.toString();
    }
    
    public static final class b
    {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public String a;
        public String b;
        public List c;
        public String d;
        public int e;
        public int f;
        public int g;
        public int h;
        public String i;
        public x j;
        public Object k;
        public String l;
        public String m;
        public int n;
        public int o;
        public List p;
        public m q;
        public long r;
        public int s;
        public int t;
        public float u;
        public int v;
        public float w;
        public byte[] x;
        public int y;
        public h z;
        
        public b() {
            this.c = v.Y();
            this.g = -1;
            this.h = -1;
            this.n = -1;
            this.o = -1;
            this.r = Long.MAX_VALUE;
            this.s = -1;
            this.t = -1;
            this.u = -1.0f;
            this.w = 1.0f;
            this.y = -1;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.F = -1;
            this.G = 1;
            this.H = -1;
            this.I = -1;
            this.J = 0;
        }
        
        public b(final q q) {
            this.a = q.a;
            this.b = q.b;
            this.c = q.c;
            this.d = q.d;
            this.e = q.e;
            this.f = q.f;
            this.g = q.g;
            this.h = q.h;
            this.i = q.j;
            this.j = q.k;
            this.k = q.l;
            this.l = q.m;
            this.m = q.n;
            this.n = q.o;
            this.o = q.p;
            this.p = q.q;
            this.q = q.r;
            this.r = q.s;
            this.s = q.t;
            this.t = q.u;
            this.u = q.v;
            this.v = q.w;
            this.w = q.x;
            this.x = q.y;
            this.y = q.z;
            this.z = q.A;
            this.A = q.B;
            this.B = q.C;
            this.C = q.D;
            this.D = q.E;
            this.E = q.F;
            this.F = q.G;
            this.G = q.H;
            this.H = q.I;
            this.I = q.J;
            this.J = q.K;
        }
        
        public static /* synthetic */ int A(final b b) {
            return b.G;
        }
        
        public static /* synthetic */ int B(final b b) {
            return b.H;
        }
        
        public static /* synthetic */ int C(final b b) {
            return b.I;
        }
        
        public static /* synthetic */ int D(final b b) {
            return b.J;
        }
        
        public static /* synthetic */ String E(final b b) {
            return b.d;
        }
        
        public static /* synthetic */ int F(final b b) {
            return b.e;
        }
        
        public static /* synthetic */ int G(final b b) {
            return b.f;
        }
        
        public static /* synthetic */ int H(final b b) {
            return b.g;
        }
        
        public static /* synthetic */ int I(final b b) {
            return b.h;
        }
        
        public static /* synthetic */ String J(final b b) {
            return b.i;
        }
        
        public static /* synthetic */ List a(final b b) {
            return b.c;
        }
        
        public static /* synthetic */ x b(final b b) {
            return b.j;
        }
        
        public static /* synthetic */ Object c(final b b) {
            return b.k;
        }
        
        public static /* synthetic */ String d(final b b) {
            return b.l;
        }
        
        public static /* synthetic */ String e(final b b) {
            return b.m;
        }
        
        public static /* synthetic */ int f(final b b) {
            return b.n;
        }
        
        public static /* synthetic */ int g(final b b) {
            return b.o;
        }
        
        public static /* synthetic */ List h(final b b) {
            return b.p;
        }
        
        public static /* synthetic */ m i(final b b) {
            return b.q;
        }
        
        public static /* synthetic */ long j(final b b) {
            return b.r;
        }
        
        public static /* synthetic */ int k(final b b) {
            return b.s;
        }
        
        public static /* synthetic */ String l(final b b) {
            return b.b;
        }
        
        public static /* synthetic */ int m(final b b) {
            return b.t;
        }
        
        public static /* synthetic */ float n(final b b) {
            return b.u;
        }
        
        public static /* synthetic */ int o(final b b) {
            return b.v;
        }
        
        public static /* synthetic */ float p(final b b) {
            return b.w;
        }
        
        public static /* synthetic */ byte[] q(final b b) {
            return b.x;
        }
        
        public static /* synthetic */ int r(final b b) {
            return b.y;
        }
        
        public static /* synthetic */ h s(final b b) {
            return b.z;
        }
        
        public static /* synthetic */ int t(final b b) {
            return b.A;
        }
        
        public static /* synthetic */ int u(final b b) {
            return b.B;
        }
        
        public static /* synthetic */ int v(final b b) {
            return b.C;
        }
        
        public static /* synthetic */ String w(final b b) {
            return b.a;
        }
        
        public static /* synthetic */ int x(final b b) {
            return b.D;
        }
        
        public static /* synthetic */ int y(final b b) {
            return b.E;
        }
        
        public static /* synthetic */ int z(final b b) {
            return b.F;
        }
        
        public q K() {
            return new q(this, null);
        }
        
        public b L(final int f) {
            this.F = f;
            return this;
        }
        
        public b M(final int g) {
            this.g = g;
            return this;
        }
        
        public b N(final int a) {
            this.A = a;
            return this;
        }
        
        public b O(final String i) {
            this.i = i;
            return this;
        }
        
        public b P(final h z) {
            this.z = z;
            return this;
        }
        
        public b Q(final String s) {
            this.l = d0.z.t(s);
            return this;
        }
        
        public b R(final int j) {
            this.J = j;
            return this;
        }
        
        public b S(final int g) {
            this.G = g;
            return this;
        }
        
        public b T(final Object k) {
            this.k = k;
            return this;
        }
        
        public b U(final m q) {
            this.q = q;
            return this;
        }
        
        public b V(final int d) {
            this.D = d;
            return this;
        }
        
        public b W(final int e) {
            this.E = e;
            return this;
        }
        
        public b X(final float u) {
            this.u = u;
            return this;
        }
        
        public b Y(final int t) {
            this.t = t;
            return this;
        }
        
        public b Z(final int i) {
            this.a = Integer.toString(i);
            return this;
        }
        
        public b a0(final String a) {
            this.a = a;
            return this;
        }
        
        public b b0(final List p) {
            this.p = p;
            return this;
        }
        
        public b c0(final String b) {
            this.b = b;
            return this;
        }
        
        public b d0(final List list) {
            this.c = X2.v.U(list);
            return this;
        }
        
        public b e0(final String d) {
            this.d = d;
            return this;
        }
        
        public b f0(final int n) {
            this.n = n;
            return this;
        }
        
        public b g0(final int o) {
            this.o = o;
            return this;
        }
        
        public b h0(final x j) {
            this.j = j;
            return this;
        }
        
        public b i0(final int c) {
            this.C = c;
            return this;
        }
        
        public b j0(final int h) {
            this.h = h;
            return this;
        }
        
        public b k0(final float w) {
            this.w = w;
            return this;
        }
        
        public b l0(final byte[] x) {
            this.x = x;
            return this;
        }
        
        public b m0(final int f) {
            this.f = f;
            return this;
        }
        
        public b n0(final int v) {
            this.v = v;
            return this;
        }
        
        public b o0(final String s) {
            this.m = d0.z.t(s);
            return this;
        }
        
        public b p0(final int b) {
            this.B = b;
            return this;
        }
        
        public b q0(final int e) {
            this.e = e;
            return this;
        }
        
        public b r0(final int y) {
            this.y = y;
            return this;
        }
        
        public b s0(final long r) {
            this.r = r;
            return this;
        }
        
        public b t0(final int h) {
            this.H = h;
            return this;
        }
        
        public b u0(final int i) {
            this.I = i;
            return this;
        }
        
        public b v0(final int s) {
            this.s = s;
            return this;
        }
    }
}
