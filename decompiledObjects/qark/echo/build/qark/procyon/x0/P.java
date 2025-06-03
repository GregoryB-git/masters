// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import F0.S;
import g0.o;
import g0.z;
import j0.i;
import d0.m;
import g0.M;
import k0.v0;
import g0.a;
import g0.g;
import B0.b;
import p0.n;
import p0.v;
import p0.x;
import d0.q;
import F0.T;

public class P implements T
{
    public q A;
    public q B;
    public long C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;
    public final N a;
    public final b b;
    public final W c;
    public final x d;
    public final v.a e;
    public d f;
    public q g;
    public n h;
    public int i;
    public long[] j;
    public long[] k;
    public int[] l;
    public int[] m;
    public long[] n;
    public a[] o;
    public int p;
    public int q;
    public int r;
    public int s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    
    public P(final B0.b b, final x d, final v.a e) {
        this.d = d;
        this.e = e;
        this.a = new N(b);
        this.b = new b();
        this.i = 1000;
        this.j = new long[1000];
        this.k = new long[1000];
        this.n = new long[1000];
        this.m = new int[1000];
        this.l = new int[1000];
        this.o = new a[1000];
        this.c = new W(new O());
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.y = true;
        this.x = true;
        this.D = true;
    }
    
    public static P k(final B0.b b, final x x, final v.a a) {
        return new P(b, (x)a.e(x), (v.a)a.e(a));
    }
    
    public static P l(final B0.b b) {
        return new P(b, null, null);
    }
    
    public final long A() {
        synchronized (this) {
            return this.v;
        }
    }
    
    public final long B() {
        synchronized (this) {
            return Math.max(this.u, this.C(this.s));
        }
    }
    
    public final long C(final int n) {
        long max = Long.MIN_VALUE;
        if (n == 0) {
            return Long.MIN_VALUE;
        }
        int e = this.E(n - 1);
        for (int i = 0; i < n; ++i) {
            max = Math.max(max, this.n[e]);
            if ((this.m[e] & 0x1) != 0x0) {
                return max;
            }
            if (--e == -1) {
                e = this.i - 1;
            }
        }
        return max;
    }
    
    public final int D() {
        return this.q + this.s;
    }
    
    public final int E(int n) {
        n += this.r;
        final int i = this.i;
        if (n < i) {
            return n;
        }
        return n - i;
    }
    
    public final int F(final long n, final boolean b) {
        // monitorenter(this)
        // monitorexit(this)
        // monitorexit(this)
        Label_0108: {
            Label_0104: {
                int n2;
                try {
                    n2 = this.E(this.s);
                    if (!this.I() || n < this.n[n2]) {
                        break Label_0104;
                    }
                    if (n > this.v && b) {
                        n2 = this.p;
                        final int s = this.s;
                        // monitorexit(this)
                        return n2 - s;
                    }
                }
                finally {
                    break Label_0108;
                }
                final int w = this.w(n2, this.p - this.s, n, true);
                if (w == -1) {
                    return 0;
                }
                return w;
            }
            return 0;
        }
    }
    // monitorexit(this)
    
    public final q G() {
        synchronized (this) {
            q b;
            if (this.y) {
                b = null;
            }
            else {
                b = this.B;
            }
            return b;
        }
    }
    
    public final int H() {
        return this.q + this.p;
    }
    
    public final boolean I() {
        return this.s != this.p;
    }
    
    public final void J() {
        this.z = true;
    }
    
    public final boolean K() {
        synchronized (this) {
            return this.w;
        }
    }
    
    public boolean L(final boolean b) {
        // monitorenter(this)
        // monitorexit(this)
        // monitorexit(this)
        Label_0121: {
            Label_0068: {
                boolean i = false;
                Label_0064: {
                    try {
                        i = this.I();
                        final boolean b2 = true;
                        if (i) {
                            break Label_0068;
                        }
                        i = b2;
                        if (b) {
                            break Label_0064;
                        }
                        i = b2;
                        if (this.w) {
                            break Label_0064;
                        }
                        final q b3 = this.B;
                        if (b3 != null && b3 != this.g) {
                            i = b2;
                            break Label_0064;
                        }
                    }
                    finally {
                        break Label_0121;
                    }
                    i = false;
                }
                return i;
            }
            if (((c)this.c.e(this.D())).a != this.g) {
                // monitorexit(this)
                return true;
            }
            return this.N(this.E(this.s));
        }
    }
    // monitorexit(this)
    
    public final boolean N(final int n) {
        final n h = this.h;
        return h == null || h.getState() == 4 || ((this.m[n] & 0x40000000) == 0x0 && this.h.b());
    }
    
    public void O() {
        final n h = this.h;
        if (h == null) {
            return;
        }
        if (h.getState() != 1) {
            return;
        }
        throw (n.a)g0.a.e(this.h.g());
    }
    
    public final void P(final q g, final v0 v0) {
        final q g2 = this.g;
        final boolean b = g2 == null;
        Object r;
        if (g2 == null) {
            r = null;
        }
        else {
            r = g2.r;
        }
        this.g = g;
        final m r2 = g.r;
        final x d = this.d;
        q b2;
        if (d != null) {
            b2 = g.b(d.b(g));
        }
        else {
            b2 = g;
        }
        v0.b = b2;
        v0.a = this.h;
        if (this.d == null) {
            return;
        }
        if (!b && M.c(r, r2)) {
            return;
        }
        final n h = this.h;
        final n c = this.d.c(this.e, g);
        this.h = c;
        v0.a = c;
        if (h != null) {
            h.e(this.e);
        }
    }
    
    public final int Q(final v0 v0, final i i, final boolean b, final boolean b2, final b b3) {
        // monitorenter(this)
        while (true) {
            try {
                i.s = false;
                if (!this.I()) {
                    if (b2 || this.w) {
                        i.w(4);
                        i.t = Long.MIN_VALUE;
                        // monitorexit(this)
                        return -4;
                    }
                    final q b4 = this.B;
                    if (b4 != null && (b || b4 != this.g)) {
                        this.P((q)g0.a.e(b4), v0);
                        // monitorexit(this)
                        return -5;
                    }
                    // monitorexit(this)
                    return -3;
                }
                else {
                    final q a = ((c)this.c.e(this.D())).a;
                    if (b || a != this.g) {
                        this.P(a, v0);
                        // monitorexit(this)
                        return -5;
                    }
                    final int e = this.E(this.s);
                    if (!this.N(e)) {
                        i.s = true;
                        // monitorexit(this)
                        return -3;
                    }
                    i.w(this.m[e]);
                    if (this.s == this.p - 1 && (b2 || this.w)) {
                        i.l(536870912);
                    }
                    i.t = this.n[e];
                    b3.a = this.l[e];
                    b3.b = this.k[e];
                    b3.c = this.o[e];
                    // monitorexit(this)
                    return -4;
                }
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final long R() {
        // monitorenter(this)
        while (true) {
            try {
                final int e = this.E(this.s);
                long c;
                if (this.I()) {
                    c = this.j[e];
                }
                else {
                    c = this.C;
                }
                // monitorexit(this)
                return c;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void S() {
        this.r();
        this.V();
    }
    
    public int T(final v0 v0, final i i, final int n, final boolean b) {
        boolean b2 = false;
        final int q = this.Q(v0, i, (n & 0x2) != 0x0, b, this.b);
        if (q == -4 && !i.p()) {
            if ((n & 0x1) != 0x0) {
                b2 = true;
            }
            if ((n & 0x4) == 0x0) {
                final N a = this.a;
                final b b3 = this.b;
                if (b2) {
                    a.f(i, b3);
                }
                else {
                    a.m(i, b3);
                }
            }
            if (!b2) {
                ++this.s;
            }
        }
        return q;
    }
    
    public void U() {
        this.X(true);
        this.V();
    }
    
    public final void V() {
        final n h = this.h;
        if (h != null) {
            h.e(this.e);
            this.h = null;
            this.g = null;
        }
    }
    
    public final void W() {
        this.X(false);
    }
    
    public void X(final boolean b) {
        this.a.n();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        this.c.b();
        if (b) {
            this.A = null;
            this.B = null;
            this.y = true;
            this.D = true;
        }
    }
    
    public final void Y() {
        synchronized (this) {
            this.s = 0;
            this.a.o();
        }
    }
    
    public final boolean Z(final int n) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0055: {
            try {
                this.Y();
                final int q = this.q;
                if (n >= q) {
                    if (n <= this.p + q) {
                        this.t = Long.MIN_VALUE;
                        this.s = n - q;
                        // monitorexit(this)
                        return true;
                    }
                }
            }
            finally {
                break Label_0055;
            }
            return false;
        }
    }
    // monitorexit(this)
    
    @Override
    public final void a(final z z, final int n, final int n2) {
        this.a.q(z, n);
    }
    
    public final boolean a0(final long t, final boolean b) {
        // monitorenter(this)
        while (true) {
            try {
                this.Y();
                final int e = this.E(this.s);
                if (!this.I() || t < this.n[e] || (t > this.v && !b)) {
                    // monitorexit(this)
                    return false;
                }
                int n;
                if (this.D) {
                    n = this.v(e, this.p - this.s, t, b);
                }
                else {
                    n = this.w(e, this.p - this.s, t, true);
                }
                if (n == -1) {
                    // monitorexit(this)
                    return false;
                }
                this.t = t;
                this.s += n;
                // monitorexit(this)
                return true;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public void b(long n, int n2, final int n3, final int n4, final a a) {
        if (this.z) {
            this.d((q)a.h(this.A));
        }
        final int n5 = n2 & 0x1;
        final boolean b = n5 != 0;
        if (this.x) {
            if (!b) {
                return;
            }
            this.x = false;
        }
        n += this.F;
        if (this.D) {
            if (n < this.t) {
                return;
            }
            if (n5 == 0) {
                if (!this.E) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Overriding unexpected non-sync sample for format: ");
                    sb.append(this.B);
                    g0.o.h("SampleQueue", sb.toString());
                    this.E = true;
                }
                n2 |= 0x1;
            }
        }
        if (this.G) {
            if (!b) {
                return;
            }
            if (!this.h(n)) {
                return;
            }
            this.G = false;
        }
        this.i(n, n2, this.a.e() - n3 - n4, n3, a);
    }
    
    public final void b0(final long f) {
        if (this.F != f) {
            this.F = f;
            this.J();
        }
    }
    
    @Override
    public final int c(final d0.i i, final int n, final boolean b, final int n2) {
        return this.a.p(i, n, b);
    }
    
    public final void c0(final long t) {
        this.t = t;
    }
    
    @Override
    public final void d(final q a) {
        final q x = this.x(a);
        this.z = false;
        this.A = a;
        final boolean d0 = this.d0(x);
        final d f = this.f;
        if (f != null && d0) {
            f.m(x);
        }
    }
    
    public final boolean d0(q b) {
        // monitorenter(this)
        while (true) {
            try {
                this.y = false;
                if (M.c(b, this.B)) {
                    // monitorexit(this)
                    return false;
                }
                q a = b;
                if (!this.c.g()) {
                    a = b;
                    if (((c)this.c.f()).a.equals(b)) {
                        a = ((c)this.c.f()).a;
                    }
                }
                this.B = a;
                final boolean d = this.D;
                b = this.B;
                this.D = (d & d0.z.a(b.n, b.j));
                this.E = false;
                // monitorexit(this)
                return true;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void e0(final d f) {
        this.f = f;
    }
    
    public final void f0(final int n) {
        // monitorenter(this)
        while (true) {
            Label_0049: {
                if (n < 0) {
                    break Label_0049;
                }
                while (true) {
                    try {
                        if (this.s + n <= this.p) {
                            final boolean b = true;
                            g0.a.a(b);
                            this.s += n;
                            // monitorexit(this)
                            return;
                        }
                        break Label_0049;
                        // monitorexit(this)
                        throw;
                    }
                    finally {
                        continue;
                    }
                    break;
                }
            }
            final boolean b = false;
            continue;
        }
    }
    
    public final void g0(final long c) {
        this.C = c;
    }
    
    public final boolean h(final long n) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0078: {
            try {
                final int p = this.p;
                boolean b = false;
                if (p == 0) {
                    if (n > this.u) {
                        b = true;
                    }
                    // monitorexit(this)
                    return b;
                }
            }
            finally {
                break Label_0078;
            }
            if (this.B() >= n) {
                // monitorexit(this)
                return false;
            }
            this.t(this.q + this.j(n));
            return true;
        }
    }
    // monitorexit(this)
    
    public final void h0() {
        this.G = true;
    }
    
    public final void i(final long b, int n, final long n2, int i, final a a) {
        int p5;
        int e;
        x d;
        q q;
        x.b b2;
        boolean w;
        int e2;
        a a2;
        long[] j;
        long[] k;
        long[] n3;
        int[] m;
        int[] l;
        a[] o;
        int r;
        int r2;
        final a a3;
        Label_0220_Outer:Label_0059_Outer:
        while (true) {
            // monitorenter(this)
        Label_0551_Outer:
            while (true) {
                Label_0567: {
                    while (true) {
                        try {
                            p5 = this.p;
                            if (p5 > 0) {
                                e = this.E(p5 - 1);
                                a.a(this.k[e] + this.l[e] <= n2);
                            }
                            break Label_0567;
                            // iftrue(Label_0215:, d == null)
                            // iftrue(Label_0243:, !this.c.g() && (c)this.c.f().a.equals((Object)this.B))
                            // iftrue(Label_0548:, n != i)
                            // monitorexit(this)
                            // monitorexit(this)
                            while (true) {
                            Block_8:
                                while (true) {
                                    Label_0243: {
                                        while (true) {
                                            while (true) {
                                                b2 = d.d(this.e, q);
                                                this.c.a(this.H(), new c(q, b2, null));
                                                break Label_0243;
                                                q = (q)a.e(this.B);
                                                d = this.d;
                                                continue Label_0220_Outer;
                                            }
                                            this.w = w;
                                            this.v = Math.max(this.v, b);
                                            e2 = this.E(this.p);
                                            this.n[e2] = b;
                                            this.k[e2] = n2;
                                            this.l[e2] = i;
                                            this.m[e2] = n;
                                            this.o[e2] = a2;
                                            this.j[e2] = this.C;
                                            continue Label_0059_Outer;
                                        }
                                    }
                                    n = this.p + 1;
                                    this.p = n;
                                    i = this.i;
                                    break Block_8;
                                    return;
                                    Label_0215: {
                                        b2 = p0.x.b.a;
                                    }
                                    continue Label_0059_Outer;
                                }
                                n = i + 1000;
                                j = new long[n];
                                k = new long[n];
                                n3 = new long[n];
                                m = new int[n];
                                l = new int[n];
                                o = new a[n];
                                r = this.r;
                                i -= r;
                                System.arraycopy(this.k, r, k, 0, i);
                                System.arraycopy(this.n, this.r, n3, 0, i);
                                System.arraycopy(this.m, this.r, m, 0, i);
                                System.arraycopy(this.l, this.r, l, 0, i);
                                System.arraycopy(this.o, this.r, o, 0, i);
                                System.arraycopy(this.j, this.r, j, 0, i);
                                r2 = this.r;
                                System.arraycopy(this.k, 0, k, i, r2);
                                System.arraycopy(this.n, 0, n3, i, r2);
                                System.arraycopy(this.m, 0, m, i, r2);
                                System.arraycopy(this.l, 0, l, i, r2);
                                System.arraycopy(this.o, 0, o, i, r2);
                                System.arraycopy(this.j, 0, j, i, r2);
                                this.k = k;
                                this.n = n3;
                                this.m = m;
                                this.l = l;
                                this.o = o;
                                this.j = j;
                                this.r = 0;
                                this.i = n;
                                continue Label_0551_Outer;
                            }
                        }
                        finally {}
                        a2 = a3;
                        continue;
                    }
                }
                w = ((0x20000000 & n) != 0x0);
                continue;
            }
        }
    }
    
    public final int j(final long n) {
        int p = this.p;
        int n2;
        for (int e = this.E(p - 1); p > this.s && this.n[e] >= n; e = this.i - 1, p = n2) {
            n2 = p - 1;
            final int n3 = e - 1;
            p = n2;
            if ((e = n3) == -1) {}
        }
        return p;
    }
    
    public final long m(long p3, final boolean b, final boolean b2) {
        // monitorenter(this)
        while (true) {
            try {
                final int p4 = this.p;
                if (p4 != 0) {
                    final long[] n = this.n;
                    final int r = this.r;
                    if (p3 >= n[r]) {
                        int n2 = p4;
                        if (b2) {
                            final int s = this.s;
                            if (s != (n2 = p4)) {
                                n2 = s + 1;
                            }
                        }
                        final int w = this.w(r, n2, p3, b);
                        if (w == -1) {
                            // monitorexit(this)
                            return -1L;
                        }
                        p3 = this.p(w);
                        // monitorexit(this)
                        return p3;
                    }
                }
                // monitorexit(this)
                return -1L;
            }
            // monitorexit(this)
            finally {}
            continue;
        }
    }
    
    public final long n() {
        synchronized (this) {
            final int p = this.p;
            if (p == 0) {
                return -1L;
            }
            return this.p(p);
        }
    }
    
    public long o() {
        synchronized (this) {
            final int s = this.s;
            if (s == 0) {
                return -1L;
            }
            return this.p(s);
        }
    }
    
    public final long p(int s) {
        this.u = Math.max(this.u, this.C(s));
        this.p -= s;
        final int q = this.q + s;
        this.q = q;
        final int r = this.r + s;
        this.r = r;
        final int i = this.i;
        if (r >= i) {
            this.r = r - i;
        }
        s = this.s - s;
        if ((this.s = s) < 0) {
            this.s = 0;
        }
        this.c.d(q);
        if (this.p == 0) {
            if ((s = this.r) == 0) {
                s = this.i;
            }
            --s;
            return this.k[s] + this.l[s];
        }
        return this.k[this.r];
    }
    
    public final void q(final long n, final boolean b, final boolean b2) {
        this.a.b(this.m(n, b, b2));
    }
    
    public final void r() {
        this.a.b(this.n());
    }
    
    public final void s() {
        this.a.b(this.o());
    }
    
    public final long t(int n) {
        final int n2 = this.H() - n;
        final boolean b = false;
        g0.a.a(n2 >= 0 && n2 <= this.p - this.s);
        final int p = this.p - n2;
        this.p = p;
        this.v = Math.max(this.u, this.C(p));
        boolean w = b;
        if (n2 == 0) {
            w = b;
            if (this.w) {
                w = true;
            }
        }
        this.w = w;
        this.c.c(n);
        n = this.p;
        if (n != 0) {
            n = this.E(n - 1);
            return this.k[n] + this.l[n];
        }
        return 0L;
    }
    
    public final void u(final int n) {
        this.a.c(this.t(n));
    }
    
    public final int v(int n, final int n2, final long n3, final boolean b) {
        for (int i = 0; i < n2; ++i) {
            if (this.n[n] >= n3) {
                return i;
            }
            if (++n == this.i) {
                n = 0;
            }
        }
        if (b) {
            return n2;
        }
        return -1;
    }
    
    public final int w(int i, final int n, final long n2, final boolean b) {
        int n3 = -1;
        final int n4 = 0;
        int n5 = i;
        long n6;
        for (i = n4; i < n; ++i) {
            n6 = this.n[n5];
            if (n6 > n2) {
                break;
            }
            if (!b || (this.m[n5] & 0x1) != 0x0) {
                if (n6 == n2) {
                    return i;
                }
                n3 = i;
            }
            if (++n5 == this.i) {
                n5 = 0;
            }
        }
        return n3;
    }
    
    public q x(final q q) {
        q k = q;
        if (this.F != 0L) {
            k = q;
            if (q.s != Long.MAX_VALUE) {
                k = q.a().s0(q.s + this.F).K();
            }
        }
        return k;
    }
    
    public final int y() {
        return this.q;
    }
    
    public final long z() {
        synchronized (this) {
            long n;
            if (this.p == 0) {
                n = Long.MIN_VALUE;
            }
            else {
                n = this.n[this.r];
            }
            return n;
        }
    }
    
    public static final class b
    {
        public int a;
        public long b;
        public a c;
    }
    
    public static final class c
    {
        public final q a;
        public final x.b b;
        
        public c(final q a, final x.b b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public interface d
    {
        void m(final q p0);
    }
}
