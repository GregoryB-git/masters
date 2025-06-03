// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q3;

import a4.i;
import d4.g;
import d4.t;
import Y3.j;
import d4.n;
import d4.f;
import d4.r;
import d4.b;
import V3.H;
import V3.D;
import d4.u;
import d4.q;
import a4.h;
import V3.k;
import V3.m;

public class p
{
    public final m a;
    public final k b;
    public final h c;
    public final boolean d;
    
    public p(final m a, final k b) {
        this.a = a;
        this.b = b;
        this.c = h.i;
        this.d = false;
    }
    
    public p(final m a, final k b, final h c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        Y3.m.g(c.q(), "Validation of queries failed.");
    }
    
    public p A() {
        this.U();
        final h w = this.c.w(q.j());
        this.V(w);
        return new p(this.a, this.b, w, true);
    }
    
    public p B() {
        this.U();
        return new p(this.a, this.b, this.c.w(u.j()), true);
    }
    
    public void C(final a a) {
        if (a != null) {
            this.E(new V3.a(this.a, a, this.u()));
            return;
        }
        throw new NullPointerException("listener must not be null");
    }
    
    public void D(final s s) {
        if (s != null) {
            this.E(new D(this.a, s, this.u()));
            return;
        }
        throw new NullPointerException("listener must not be null");
    }
    
    public final void E(final V3.h h) {
        H.b().e(h);
        this.a.i0(new Runnable() {
            @Override
            public void run() {
                Q3.p.this.a.b0(h);
            }
        });
    }
    
    public p F(final double n) {
        return this.N(n, d4.b.m().e());
    }
    
    public p G(final double d, final String s) {
        return this.H(new f(d, r.a()), s);
    }
    
    public final p H(final n n, final String s) {
        return this.O(n, j.b(s));
    }
    
    public p I(final String s) {
        if (s != null && this.c.d().equals(d4.j.j())) {
            return this.P(j.b(s));
        }
        return this.Q(s, d4.b.m().e());
    }
    
    public p J(final String s, final String s2) {
        String b = s;
        if (s != null) {
            b = s;
            if (this.c.d().equals(d4.j.j())) {
                b = j.b(s);
            }
        }
        n w;
        if (b != null) {
            w = new t(b, r.a());
        }
        else {
            w = g.W();
        }
        return this.H(w, s2);
    }
    
    public p K(final boolean b) {
        return this.S(b, b.m().e());
    }
    
    public p L(final boolean b, final String s) {
        return this.H(new d4.a(b, r.a()), s);
    }
    
    public p M(final double n) {
        return this.N(n, null);
    }
    
    public p N(final double d, final String s) {
        return this.O(new f(d, r.a()), s);
    }
    
    public final p O(final n n, final String s) {
        Y3.n.g(s);
        if (!n.B() && !n.isEmpty()) {
            throw new IllegalArgumentException("Can only use simple values for startAt() and startAfter()");
        }
        if (!this.c.o()) {
            b b;
            if (s != null) {
                if (s.equals("[MIN_NAME]")) {
                    b = d4.b.n();
                }
                else if (s.equals("[MAX_KEY]")) {
                    b = d4.b.m();
                }
                else {
                    b = d4.b.j(s);
                }
            }
            else {
                b = null;
            }
            final h x = this.c.x(n, b);
            this.T(x);
            this.V(x);
            Y3.m.f(x.q());
            return new p(this.a, this.b, x, this.d);
        }
        throw new IllegalArgumentException("Can't call startAt(), startAfte(), or equalTo() multiple times");
    }
    
    public p P(final String s) {
        return this.Q(s, null);
    }
    
    public p Q(final String s, final String s2) {
        n w;
        if (s != null) {
            w = new t(s, r.a());
        }
        else {
            w = g.W();
        }
        return this.O(w, s2);
    }
    
    public p R(final boolean b) {
        return this.S(b, null);
    }
    
    public p S(final boolean b, final String s) {
        return this.O(new d4.a(b, r.a()), s);
    }
    
    public final void T(final h h) {
        if (!h.o() || !h.m() || !h.n()) {
            return;
        }
        if (h.l()) {
            return;
        }
        throw new IllegalArgumentException("Can't combine startAt(), startAfter(), endAt(), endBefore(), and limit(). Use limitToFirst() or limitToLast() instead");
    }
    
    public final void U() {
        if (!this.d) {
            return;
        }
        throw new IllegalArgumentException("You can't combine multiple orderBy calls!");
    }
    
    public final void V(final h h) {
        if (h.d().equals(d4.j.j())) {
            if (h.o()) {
                final n h2 = h.h();
                if (!A2.m.a(h.g(), d4.b.n()) || !(h2 instanceof t)) {
                    throw new IllegalArgumentException("You must use startAt(String value), startAfter(String value), endAt(String value), endBefore(String value) or equalTo(String value) in combination with orderByKey(). Other type of values or using the version with 2 parameters is not supported");
                }
            }
            if (h.m()) {
                final n f = h.f();
                if (h.e().equals(d4.b.m()) && f instanceof t) {
                    return;
                }
                throw new IllegalArgumentException("You must use startAt(String value), startAfter(String value), endAt(String value), endBefore(String value) or equalTo(String value) in combination with orderByKey(). Other type of values or using the version with 2 parameters is not supported");
            }
        }
        else if (h.d().equals(q.j())) {
            if (!h.o() || r.b(h.h())) {
                if (!h.m()) {
                    return;
                }
                if (r.b(h.f())) {
                    return;
                }
            }
            throw new IllegalArgumentException("When using orderByPriority(), values provided to startAt(), startAfter(), endAt(), endBefore(), or equalTo() must be valid priorities.");
        }
    }
    
    public a a(final a a) {
        this.b(new V3.a(this.a, a, this.u()));
        return a;
    }
    
    public final void b(final V3.h h) {
        H.b().c(h);
        this.a.i0(new Runnable() {
            @Override
            public void run() {
                Q3.p.this.a.D(h);
            }
        });
    }
    
    public s c(final s s) {
        this.b(new D(this.a, s, this.u()));
        return s;
    }
    
    public p d(final double n) {
        return this.e(n, null);
    }
    
    public p e(final double d, final String s) {
        return this.f(new f(d, r.a()), s);
    }
    
    public final p f(final n n, final String s) {
        Y3.n.g(s);
        if (!n.B() && !n.isEmpty()) {
            throw new IllegalArgumentException("Can only use simple values for endAt()");
        }
        b j;
        if (s != null) {
            j = d4.b.j(s);
        }
        else {
            j = null;
        }
        if (!this.c.m()) {
            final h b = this.c.b(n, j);
            this.T(b);
            this.V(b);
            Y3.m.f(b.q());
            return new p(this.a, this.b, b, this.d);
        }
        throw new IllegalArgumentException("Can't call endAt() or equalTo() multiple times");
    }
    
    public p g(final String s) {
        return this.h(s, null);
    }
    
    public p h(final String s, final String s2) {
        n w;
        if (s != null) {
            w = new t(s, r.a());
        }
        else {
            w = g.W();
        }
        return this.f(w, s2);
    }
    
    public p i(final boolean b) {
        return this.j(b, null);
    }
    
    public p j(final boolean b, final String s) {
        return this.f(new d4.a(b, r.a()), s);
    }
    
    public p k(final double n) {
        return this.e(n, d4.b.n().e());
    }
    
    public p l(final double d, final String s) {
        return this.m(new f(d, r.a()), s);
    }
    
    public final p m(final n n, final String s) {
        return this.f(n, j.a(s));
    }
    
    public p n(final String s) {
        if (s != null && this.c.d().equals(d4.j.j())) {
            return this.g(j.a(s));
        }
        return this.h(s, d4.b.n().e());
    }
    
    public p o(final String s, final String s2) {
        String a = s;
        if (s != null) {
            a = s;
            if (this.c.d().equals(d4.j.j())) {
                a = j.a(s);
            }
        }
        n w;
        if (a != null) {
            w = new t(a, r.a());
        }
        else {
            w = g.W();
        }
        return this.m(w, s2);
    }
    
    public p p(final boolean b) {
        return this.j(b, b.n().e());
    }
    
    public p q(final boolean b, final String s) {
        return this.m(new d4.a(b, r.a()), s);
    }
    
    public V2.j r() {
        return this.a.O(this);
    }
    
    public k s() {
        return this.b;
    }
    
    public e t() {
        return new e(this.a, this.s());
    }
    
    public i u() {
        return new i(this.b, this.c);
    }
    
    public void v(final boolean b) {
        if (!this.b.isEmpty() && this.b.Z().equals(b.l())) {
            throw new d("Can't call keepSynced() on .info paths.");
        }
        this.a.i0(new Runnable() {
            @Override
            public void run() {
                final p p = Q3.p.this;
                p.a.Q(p.u(), b);
            }
        });
    }
    
    public p w(final int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Limit must be a positive integer!");
        }
        if (!this.c.n()) {
            return new p(this.a, this.b, this.c.s(n), this.d);
        }
        throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
    }
    
    public p x(final int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Limit must be a positive integer!");
        }
        if (!this.c.n()) {
            return new p(this.a, this.b, this.c.t(n), this.d);
        }
        throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
    }
    
    public p y(final String str) {
        if (str == null) {
            throw new NullPointerException("Key can't be null");
        }
        if (str.equals("$key") || str.equals(".key")) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Can't use '");
            sb.append(str);
            sb.append("' as path, please use orderByKey() instead!");
            throw new IllegalArgumentException(sb.toString());
        }
        if (str.equals("$priority") || str.equals(".priority")) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't use '");
            sb2.append(str);
            sb2.append("' as path, please use orderByPriority() instead!");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (str.equals("$value") || str.equals(".value")) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Can't use '");
            sb3.append(str);
            sb3.append("' as path, please use orderByValue() instead!");
            throw new IllegalArgumentException(sb3.toString());
        }
        Y3.n.h(str);
        this.U();
        final k k = new k(str);
        if (k.size() != 0) {
            return new p(this.a, this.b, this.c.w(new d4.p(k)), true);
        }
        throw new IllegalArgumentException("Can't use empty path, use orderByValue() instead!");
    }
    
    public p z() {
        this.U();
        final h w = this.c.w(d4.j.j());
        this.V(w);
        return new p(this.a, this.b, w, true);
    }
}
