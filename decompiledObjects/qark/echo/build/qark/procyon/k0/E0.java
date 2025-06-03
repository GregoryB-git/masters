// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import android.util.Pair;
import X2.v;
import x0.x;
import java.util.ArrayList;
import java.util.List;
import g0.k;
import l0.a;
import d0.I;

public final class E0
{
    public final I.b a;
    public final I.c b;
    public final a c;
    public final k d;
    public final B0.a e;
    public long f;
    public int g;
    public boolean h;
    public B0 i;
    public B0 j;
    public B0 k;
    public int l;
    public Object m;
    public long n;
    public w.c o;
    public List p;
    
    public E0(final a c, final k d, final B0.a e, final w.c o) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.o = o;
        this.a = new I.b();
        this.b = new I.c();
        this.p = new ArrayList();
    }
    
    public static boolean C(final I.b b) {
        final int c = b.c();
        boolean b3;
        final boolean b2 = b3 = false;
        if (c != 0) {
            if (c == 1) {
                b3 = b2;
                if (b.q(0)) {
                    return b3;
                }
            }
            b3 = b2;
            if (b.r(b.o())) {
                long n = 0L;
                if (b.e(0L) != -1) {
                    return false;
                }
                if (b.d == 0L) {
                    return true;
                }
                int n2;
                if (b.q(c - 1)) {
                    n2 = 2;
                }
                else {
                    n2 = 1;
                }
                for (int i = 0; i <= c - n2; ++i) {
                    n += b.i(i);
                }
                b3 = b2;
                if (b.d <= n) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    public static x.b K(final I i, Object e, final long n, final long n2, final I.c c, final I.b b) {
        i.h(e, b);
        i.n(b.c, c);
        for (int b2 = i.b(e); C(b) && b2 <= c.o; ++b2) {
            i.g(b2, b, true);
            e = g0.a.e(b.b);
        }
        i.h(e, b);
        final int e2 = b.e(n);
        if (e2 == -1) {
            return new x.b(e, n2, b.d(n));
        }
        return new x.b(e, e2, b.k(e2), n2);
    }
    
    public static boolean d(final long n, final long n2) {
        return n == -9223372036854775807L || n == n2;
    }
    
    public final boolean A(final I i, final x.b b) {
        final boolean y = this.y(b);
        boolean b2 = false;
        if (!y) {
            return false;
        }
        if (i.n(i.h(b.a, this.a).c, this.b).o == i.b(b.a)) {
            b2 = true;
        }
        return b2;
    }
    
    public boolean B(final x0.v v) {
        final B0 k = this.k;
        return k != null && k.a == v;
    }
    
    public final void E() {
        final v.a m = v.M();
        for (B0 b0 = this.i; b0 != null; b0 = b0.k()) {
            m.h(b0.f.a);
        }
        final B0 j = this.j;
        x.b a;
        if (j == null) {
            a = null;
        }
        else {
            a = j.f.a;
        }
        this.d.j(new D0(this, m, a));
    }
    
    public void F(final long n) {
        final B0 k = this.k;
        if (k != null) {
            k.u(n);
        }
    }
    
    public final void G(final List p) {
        for (int i = 0; i < this.p.size(); ++i) {
            ((B0)this.p.get(i)).v();
        }
        this.p = p;
    }
    
    public void H() {
        if (!this.p.isEmpty()) {
            this.G(new ArrayList());
        }
    }
    
    public boolean I(B0 k) {
        g0.a.h(k);
        final boolean equals = k.equals(this.k);
        boolean b = false;
        if (equals) {
            return false;
        }
        this.k = k;
        while (k.k() != null) {
            k = (B0)g0.a.e(k.k());
            if (k == this.j) {
                this.j = this.i;
                b = true;
            }
            k.v();
            --this.l;
        }
        ((B0)g0.a.e(this.k)).y(null);
        this.E();
        return b;
    }
    
    public final B0 J(final C0 c0) {
        for (int i = 0; i < this.p.size(); ++i) {
            if (((B0)this.p.get(i)).d(c0)) {
                return (B0)this.p.remove(i);
            }
        }
        return null;
    }
    
    public x.b L(final I i, Object e, final long n) {
        final long m = this.M(i, e);
        i.h(e, this.a);
        i.n(this.a.c, this.b);
        int b = i.b(e);
        boolean b2 = false;
        Object o;
        while (true) {
            o = e;
            if (b < this.b.n) {
                break;
            }
            final I.b a = this.a;
            boolean b3 = true;
            i.g(b, a, true);
            if (this.a.c() <= 0) {
                b3 = false;
            }
            b2 |= b3;
            final I.b a2 = this.a;
            if (a2.e(a2.d) != -1) {
                e = g0.a.e(this.a.b);
            }
            if (b2) {
                o = e;
                if (!b3) {
                    break;
                }
                if (this.a.d != 0L) {
                    o = e;
                    break;
                }
            }
            --b;
        }
        return K(i, o, n, m, this.b, this.a);
    }
    
    public final long M(final I i, final Object o) {
        final int c = i.h(o, this.a).c;
        final Object m = this.m;
        if (m != null) {
            final int b = i.b(m);
            if (b != -1 && i.f(b, this.a).c == c) {
                return this.n;
            }
        }
        for (B0 b2 = this.i; b2 != null; b2 = b2.k()) {
            if (b2.b.equals(o)) {
                return b2.f.a.d;
            }
        }
        for (B0 b2 = this.i; b2 != null; b2 = b2.k()) {
            final int b3 = i.b(b2.b);
            if (b3 != -1 && i.f(b3, this.a).c == c) {
                return b2.f.a.d;
            }
        }
        final long n = this.N(o);
        if (n != -1L) {
            return n;
        }
        final long f = this.f;
        this.f = 1L + f;
        if (this.i == null) {
            this.m = o;
            this.n = f;
        }
        return f;
    }
    
    public final long N(final Object obj) {
        for (int i = 0; i < this.p.size(); ++i) {
            final B0 b0 = this.p.get(i);
            if (b0.b.equals(obj)) {
                return b0.f.a.d;
            }
        }
        return -1L;
    }
    
    public boolean O() {
        final B0 k = this.k;
        return k == null || (!k.f.i && k.s() && this.k.f.e != -9223372036854775807L && this.l < 100);
    }
    
    public final boolean P(final I i) {
        B0 b0 = this.i;
        if (b0 == null) {
            return true;
        }
        int n = i.b(b0.b);
        while (true) {
            n = i.d(n, this.a, this.b, this.g, this.h);
            while (((B0)g0.a.e(b0)).k() != null && !b0.f.g) {
                b0 = b0.k();
            }
            final B0 k = b0.k();
            if (n == -1) {
                break;
            }
            if (k == null) {
                break;
            }
            if (i.b(k.b) != n) {
                break;
            }
            b0 = k;
        }
        final boolean j = this.I(b0);
        b0.f = this.v(i, b0.f);
        return j ^ true;
    }
    
    public void Q(final I i, final w.c o) {
        this.o = o;
        this.x(i);
    }
    
    public boolean R(final I i, long n, final long n2) {
        B0 j = this.i;
        B0 b0 = null;
        while (j != null) {
            final C0 f = j.f;
            C0 v;
            if (b0 == null) {
                v = this.v(i, f);
            }
            else {
                final C0 k = this.k(i, b0, n);
                if (k == null) {
                    return this.I(b0) ^ true;
                }
                if (!this.e(f, k)) {
                    return this.I(b0) ^ true;
                }
                v = k;
            }
            j.f = v.a(f.c);
            if (!d(f.e, v.e)) {
                j.C();
                n = v.e;
                if (n == -9223372036854775807L) {
                    n = Long.MAX_VALUE;
                }
                else {
                    n = j.B(n);
                }
                final boolean b2 = j == this.j && !j.f.f && (n2 == Long.MIN_VALUE || n2 >= n);
                return !this.I(j) && !b2;
            }
            final B0 l = j.k();
            b0 = j;
            j = l;
        }
        return true;
    }
    
    public boolean S(final I i, final int g) {
        this.g = g;
        return this.P(i);
    }
    
    public boolean T(final I i, final boolean h) {
        this.h = h;
        return this.P(i);
    }
    
    public B0 b() {
        final B0 i = this.i;
        if (i == null) {
            return null;
        }
        if (i == this.j) {
            this.j = i.k();
        }
        this.i.v();
        if (--this.l == 0) {
            this.k = null;
            final B0 j = this.i;
            this.m = j.b;
            this.n = j.f.a.d;
        }
        this.i = this.i.k();
        this.E();
        return this.i;
    }
    
    public B0 c() {
        this.j = ((B0)g0.a.h(this.j)).k();
        this.E();
        return (B0)g0.a.h(this.j);
    }
    
    public final boolean e(final C0 c0, final C0 c2) {
        return c0.b == c2.b && c0.a.equals(c2.a);
    }
    
    public void f() {
        if (this.l == 0) {
            return;
        }
        B0 k = (B0)g0.a.h(this.i);
        this.m = k.b;
        this.n = k.f.a.d;
        while (k != null) {
            k.v();
            k = k.k();
        }
        this.i = null;
        this.k = null;
        this.j = null;
        this.l = 0;
        this.E();
    }
    
    public B0 g(final C0 f) {
        final B0 k = this.k;
        long n;
        if (k == null) {
            n = 1000000000000L;
        }
        else {
            n = k.m() + this.k.f.e - f.b;
        }
        final B0 j = this.J(f);
        B0 a;
        if (j == null) {
            a = this.e.a(f, n);
        }
        else {
            j.f = f;
            j.z(n);
            a = j;
        }
        final B0 i = this.k;
        if (i != null) {
            i.y(a);
        }
        else {
            this.i = a;
            this.j = a;
        }
        this.m = null;
        this.k = a;
        ++this.l;
        this.E();
        return a;
    }
    
    public final Pair h(final I i, final Object o, final long n) {
        final int e = i.e(i.h(o, this.a).c, this.g, this.h);
        if (e != -1) {
            return i.k(this.b, this.a, e, -9223372036854775807L, n);
        }
        return null;
    }
    
    public final C0 i(final U0 u0) {
        return this.n(u0.a, u0.b, u0.c, u0.s);
    }
    
    public final C0 j(final I i, B0 k, long b) {
        final C0 f = k.f;
        final int d = i.d(i.b(f.a.a), this.a, this.b, this.g, this.h);
        if (d == -1) {
            return null;
        }
        final int c = i.g(d, this.a, true).c;
        final Object e = g0.a.e(this.a.b);
        long d2 = f.a.d;
        long n;
        Object o;
        if (i.n(c, this.b).n == d) {
            final Pair j = i.k(this.b, this.a, c, -9223372036854775807L, Math.max(0L, b));
            if (j == null) {
                return null;
            }
            final Object first = j.first;
            n = (long)j.second;
            k = k.k();
            if (k != null && k.b.equals(first)) {
                b = k.f.a.d;
            }
            else if ((b = this.N(first)) == -1L) {
                b = this.f;
                this.f = 1L + b;
            }
            d2 = b;
            b = -9223372036854775807L;
            o = first;
        }
        else {
            b = 0L;
            o = e;
            n = b;
        }
        final x.b l = K(i, o, n, d2, this.b, this.a);
        long c2 = b;
        if (b != -9223372036854775807L) {
            c2 = b;
            if (f.c != -9223372036854775807L) {
                final boolean w = this.w(f.a.a, i);
                if (l.b() && w) {
                    c2 = f.c;
                }
                else {
                    c2 = b;
                    if (w) {
                        n = f.c;
                        return this.n(i, l, b, n);
                    }
                }
            }
        }
        b = c2;
        return this.n(i, l, b, n);
    }
    
    public final C0 k(final I i, final B0 b0, long n) {
        final C0 f = b0.f;
        n = b0.m() + f.e - n;
        if (f.g) {
            return this.j(i, b0, n);
        }
        return this.l(i, b0, n);
    }
    
    public final C0 l(final I i, final B0 b0, long n) {
        final C0 f = b0.f;
        final x.b a = f.a;
        i.h(a.a, this.a);
        if (a.b()) {
            final int b2 = a.b;
            final int a2 = this.a.a(b2);
            if (a2 == -1) {
                return null;
            }
            final int l = this.a.l(b2, a.c);
            if (l < a2) {
                return this.o(i, a.a, b2, l, f.c, a.d);
            }
            long b3;
            if ((b3 = f.c) == -9223372036854775807L) {
                final I.c b4 = this.b;
                final I.b a3 = this.a;
                final Pair k = i.k(b4, a3, a3.c, -9223372036854775807L, Math.max(0L, n));
                if (k == null) {
                    return null;
                }
                b3 = (long)k.second;
            }
            n = this.r(i, a.a, a.b);
            return this.p(i, a.a, Math.max(n, b3), f.c, a.d);
        }
        else {
            final int e = a.e;
            if (e != -1 && this.a.q(e)) {
                return this.j(i, b0, n);
            }
            final int j = this.a.k(a.e);
            final boolean b5 = this.a.r(a.e) && this.a.h(a.e, j) == 3;
            if (j != this.a.a(a.e) && !b5) {
                return this.o(i, a.a, a.e, j, f.e, a.d);
            }
            n = this.r(i, a.a, a.e);
            return this.p(i, a.a, n, f.e, a.d);
        }
    }
    
    public B0 m() {
        return this.k;
    }
    
    public final C0 n(final I i, final x.b b, final long n, final long n2) {
        i.h(b.a, this.a);
        final boolean b2 = b.b();
        final Object a = b.a;
        if (b2) {
            return this.o(i, a, b.b, b.c, n, b.d);
        }
        return this.p(i, a, n2, n, b.d);
    }
    
    public final C0 o(final I i, final Object o, final int n, final int n2, final long n3, long n4) {
        final x.b b = new x.b(o, n, n2, n4);
        final long b2 = i.h(b.a, this.a).b(b.b, b.c);
        if (n2 == this.a.k(n)) {
            n4 = this.a.g();
        }
        else {
            n4 = 0L;
        }
        final boolean r = this.a.r(b.b);
        if (b2 != -9223372036854775807L && n4 >= b2) {
            n4 = Math.max(0L, b2 - 1L);
        }
        return new C0(b, n4, n3, -9223372036854775807L, b2, r, false, false, false);
    }
    
    public final C0 p(final I i, Object o, long n, final long n2, long d) {
        final long n3 = n;
        i.h(o, this.a);
        int d2 = this.a.d(n3);
        final boolean b = false;
        final boolean b2 = d2 != -1 && this.a.q(d2);
        final I.b a = this.a;
        boolean b3 = false;
        Label_0157: {
            if (d2 == -1) {
                if (a.c() > 0) {
                    final I.b a2 = this.a;
                    if (a2.r(a2.o())) {
                        b3 = true;
                        break Label_0157;
                    }
                }
            }
            else if (a.r(d2)) {
                n = this.a.f(d2);
                final I.b a3 = this.a;
                if (n == a3.d && a3.p(d2)) {
                    b3 = true;
                    d2 = -1;
                    break Label_0157;
                }
            }
            b3 = false;
        }
        o = new x.b(o, d, d2);
        final boolean y = this.y((x.b)o);
        final boolean a4 = this.A(i, (x.b)o);
        final boolean z = this.z(i, (x.b)o, y);
        final boolean b4 = d2 != -1 && this.a.r(d2) && !b2;
        if (d2 != -1 && !b2) {
            n = this.a.f(d2);
        }
        else if (b3) {
            n = this.a.d;
        }
        else {
            n = -9223372036854775807L;
        }
        if (n != -9223372036854775807L && n != Long.MIN_VALUE) {
            d = n;
        }
        else {
            d = this.a.d;
        }
        long max = n3;
        if (d != -9223372036854775807L) {
            max = n3;
            if (n3 >= d) {
                boolean b5 = false;
                Label_0347: {
                    if (!z) {
                        b5 = b;
                        if (b3) {
                            break Label_0347;
                        }
                    }
                    b5 = true;
                }
                max = Math.max(0L, d - (long)(b5 ? 1 : 0));
            }
        }
        return new C0((x.b)o, max, n2, n, d, b4, y, a4, z);
    }
    
    public final C0 q(final I i, final Object o, final long n, final long n2) {
        final x.b k = K(i, o, n, n2, this.b, this.a);
        final boolean b = k.b();
        final Object a = k.a;
        if (b) {
            return this.o(i, a, k.b, k.c, n, k.d);
        }
        return this.p(i, a, n, -9223372036854775807L, k.d);
    }
    
    public final long r(final I i, final Object o, final int n) {
        i.h(o, this.a);
        final long f = this.a.f(n);
        if (f == Long.MIN_VALUE) {
            return this.a.d;
        }
        return f + this.a.i(n);
    }
    
    public C0 s(final long n, final U0 u0) {
        final B0 k = this.k;
        if (k == null) {
            return this.i(u0);
        }
        return this.k(u0.a, k, n);
    }
    
    public B0 t() {
        return this.i;
    }
    
    public B0 u() {
        return this.j;
    }
    
    public C0 v(final I i, final C0 c0) {
        final x.b a = c0.a;
        final boolean y = this.y(a);
        final boolean a2 = this.A(i, a);
        final boolean z = this.z(i, a, y);
        i.h(c0.a.a, this.a);
        long f = 0L;
        Label_0090: {
            if (!a.b()) {
                final int e = a.e;
                if (e != -1) {
                    f = this.a.f(e);
                    break Label_0090;
                }
            }
            f = -9223372036854775807L;
        }
        long n;
        if (a.b()) {
            n = this.a.b(a.b, a.c);
        }
        else if (f != -9223372036854775807L && f != Long.MIN_VALUE) {
            n = f;
        }
        else {
            n = this.a.j();
        }
        boolean r;
        if (a.b()) {
            r = this.a.r(a.b);
        }
        else {
            final int e2 = a.e;
            r = (e2 != -1 && this.a.r(e2));
        }
        return new C0(a, c0.b, c0.c, f, n, r, y, a2, z);
    }
    
    public final boolean w(final Object o, final I i) {
        final int c = i.h(o, this.a).c();
        final int o2 = this.a.o();
        if (c > 0 && this.a.r(o2)) {
            final boolean b = true;
            if (c > 1) {
                return b;
            }
            if (this.a.f(o2) != Long.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }
    
    public void x(final I i) {
        if (this.o.a != -9223372036854775807L) {
            final B0 k = this.k;
            if (k != null) {
                final ArrayList<B0> list = new ArrayList<B0>();
                final Pair h = this.h(i, k.f.a.a, 0L);
                if (h != null && !i.n(i.h(h.first, this.a).c, this.b).f()) {
                    long n;
                    if ((n = this.N(h.first)) == -1L) {
                        n = this.f;
                        this.f = 1L + n;
                    }
                    final C0 q = this.q(i, h.first, (long)h.second, n);
                    B0 b0;
                    if ((b0 = this.J(q)) == null) {
                        b0 = this.e.a(q, k.m() + k.f.e - q.b);
                    }
                    list.add(b0);
                }
                this.G(list);
                return;
            }
        }
        this.H();
    }
    
    public final boolean y(final x.b b) {
        return !b.b() && b.e == -1;
    }
    
    public final boolean z(final I i, final x.b b, final boolean b2) {
        final int b3 = i.b(b.a);
        return !i.n(i.f(b3, this.a).c, this.b).i && i.r(b3, this.a, this.b, this.g, this.h) && b2;
    }
}
