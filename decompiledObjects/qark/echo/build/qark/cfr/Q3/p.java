/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package Q3;

import Q3.a;
import Q3.d;
import Q3.e;
import Q3.s;
import V3.D;
import V3.H;
import V3.k;
import V3.m;
import a4.i;
import d4.b;
import d4.f;
import d4.g;
import d4.h;
import d4.j;
import d4.n;
import d4.q;
import d4.r;
import d4.t;
import d4.u;

public class p {
    public final m a;
    public final k b;
    public final a4.h c;
    public final boolean d;

    public p(m m8, k k8) {
        this.a = m8;
        this.b = k8;
        this.c = a4.h.i;
        this.d = false;
    }

    public p(m m8, k k8, a4.h h8, boolean bl) {
        this.a = m8;
        this.b = k8;
        this.c = h8;
        this.d = bl;
        Y3.m.g(h8.q(), "Validation of queries failed.");
    }

    public p A() {
        this.U();
        a4.h h8 = this.c.w(q.j());
        this.V(h8);
        return new p(this.a, this.b, h8, true);
    }

    public p B() {
        this.U();
        return new p(this.a, this.b, this.c.w(u.j()), true);
    }

    public void C(a a8) {
        if (a8 != null) {
            this.E(new V3.a(this.a, a8, this.u()));
            return;
        }
        throw new NullPointerException("listener must not be null");
    }

    public void D(s s8) {
        if (s8 != null) {
            this.E(new D(this.a, s8, this.u()));
            return;
        }
        throw new NullPointerException("listener must not be null");
    }

    public final void E(final V3.h h8) {
        H.b().e(h8);
        this.a.i0(new Runnable(){

            public void run() {
                p.this.a.b0(h8);
            }
        });
    }

    public p F(double d8) {
        return this.N(d8, b.m().e());
    }

    public p G(double d8, String string2) {
        return this.H(new f(d8, r.a()), string2);
    }

    public final p H(n n8, String string2) {
        return this.O(n8, Y3.j.b(string2));
    }

    public p I(String string2) {
        if (string2 != null && this.c.d().equals((Object)j.j())) {
            return this.P(Y3.j.b(string2));
        }
        return this.Q(string2, b.m().e());
    }

    public p J(String object, String string2) {
        String string3 = object;
        if (object != null) {
            string3 = object;
            if (this.c.d().equals((Object)j.j())) {
                string3 = Y3.j.b((String)object);
            }
        }
        object = string3 != null ? new t(string3, r.a()) : g.W();
        return this.H((n)object, string2);
    }

    public p K(boolean bl) {
        return this.S(bl, b.m().e());
    }

    public p L(boolean bl, String string2) {
        return this.H(new d4.a(bl, r.a()), string2);
    }

    public p M(double d8) {
        return this.N(d8, null);
    }

    public p N(double d8, String string2) {
        return this.O(new f(d8, r.a()), string2);
    }

    public final p O(n object, String object2) {
        Y3.n.g((String)object2);
        if (!object.B() && !object.isEmpty()) {
            throw new IllegalArgumentException("Can only use simple values for startAt() and startAfter()");
        }
        if (!this.c.o()) {
            object2 = object2 != null ? (object2.equals((Object)"[MIN_NAME]") ? b.n() : (object2.equals((Object)"[MAX_KEY]") ? b.m() : b.j((String)object2))) : null;
            object = this.c.x((n)object, (b)object2);
            this.T((a4.h)object);
            this.V((a4.h)object);
            Y3.m.f(object.q());
            return new p(this.a, this.b, (a4.h)object, this.d);
        }
        throw new IllegalArgumentException("Can't call startAt(), startAfte(), or equalTo() multiple times");
    }

    public p P(String string2) {
        return this.Q(string2, null);
    }

    public p Q(String object, String string2) {
        object = object != null ? new t((String)object, r.a()) : g.W();
        return this.O((n)object, string2);
    }

    public p R(boolean bl) {
        return this.S(bl, null);
    }

    public p S(boolean bl, String string2) {
        return this.O(new d4.a(bl, r.a()), string2);
    }

    public final void T(a4.h h8) {
        if (h8.o() && h8.m() && h8.n()) {
            if (h8.l()) {
                return;
            }
            throw new IllegalArgumentException("Can't combine startAt(), startAfter(), endAt(), endBefore(), and limit(). Use limitToFirst() or limitToLast() instead");
        }
    }

    public final void U() {
        if (!this.d) {
            return;
        }
        throw new IllegalArgumentException("You can't combine multiple orderBy calls!");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void V(a4.h h8) {
        if (h8.d().equals((Object)j.j())) {
            n n8;
            if (h8.o()) {
                n8 = h8.h();
                if (!A2.m.a(h8.g(), b.n()) || !(n8 instanceof t)) {
                    throw new IllegalArgumentException("You must use startAt(String value), startAfter(String value), endAt(String value), endBefore(String value) or equalTo(String value) in combination with orderByKey(). Other type of values or using the version with 2 parameters is not supported");
                }
            }
            if (!h8.m()) return;
            n8 = h8.f();
            if (!h8.e().equals(b.m()) || !(n8 instanceof t)) throw new IllegalArgumentException("You must use startAt(String value), startAfter(String value), endAt(String value), endBefore(String value) or equalTo(String value) in combination with orderByKey(). Other type of values or using the version with 2 parameters is not supported");
            return;
        }
        if (!h8.d().equals((Object)q.j())) return;
        if (h8.o() && !r.b(h8.h())) throw new IllegalArgumentException("When using orderByPriority(), values provided to startAt(), startAfter(), endAt(), endBefore(), or equalTo() must be valid priorities.");
        if (!h8.m()) return;
        if (!r.b(h8.f())) throw new IllegalArgumentException("When using orderByPriority(), values provided to startAt(), startAfter(), endAt(), endBefore(), or equalTo() must be valid priorities.");
    }

    public a a(a a8) {
        this.b(new V3.a(this.a, a8, this.u()));
        return a8;
    }

    public final void b(final V3.h h8) {
        H.b().c(h8);
        this.a.i0(new Runnable(){

            public void run() {
                p.this.a.D(h8);
            }
        });
    }

    public s c(s s8) {
        this.b(new D(this.a, s8, this.u()));
        return s8;
    }

    public p d(double d8) {
        return this.e(d8, null);
    }

    public p e(double d8, String string2) {
        return this.f(new f(d8, r.a()), string2);
    }

    public final p f(n object, String object2) {
        Y3.n.g((String)object2);
        if (!object.B() && !object.isEmpty()) {
            throw new IllegalArgumentException("Can only use simple values for endAt()");
        }
        object2 = object2 != null ? b.j((String)object2) : null;
        if (!this.c.m()) {
            object = this.c.b((n)object, (b)object2);
            this.T((a4.h)object);
            this.V((a4.h)object);
            Y3.m.f(object.q());
            return new p(this.a, this.b, (a4.h)object, this.d);
        }
        throw new IllegalArgumentException("Can't call endAt() or equalTo() multiple times");
    }

    public p g(String string2) {
        return this.h(string2, null);
    }

    public p h(String object, String string2) {
        object = object != null ? new t((String)object, r.a()) : g.W();
        return this.f((n)object, string2);
    }

    public p i(boolean bl) {
        return this.j(bl, null);
    }

    public p j(boolean bl, String string2) {
        return this.f(new d4.a(bl, r.a()), string2);
    }

    public p k(double d8) {
        return this.e(d8, b.n().e());
    }

    public p l(double d8, String string2) {
        return this.m(new f(d8, r.a()), string2);
    }

    public final p m(n n8, String string2) {
        return this.f(n8, Y3.j.a(string2));
    }

    public p n(String string2) {
        if (string2 != null && this.c.d().equals((Object)j.j())) {
            return this.g(Y3.j.a(string2));
        }
        return this.h(string2, b.n().e());
    }

    public p o(String object, String string2) {
        String string3 = object;
        if (object != null) {
            string3 = object;
            if (this.c.d().equals((Object)j.j())) {
                string3 = Y3.j.a((String)object);
            }
        }
        object = string3 != null ? new t(string3, r.a()) : g.W();
        return this.m((n)object, string2);
    }

    public p p(boolean bl) {
        return this.j(bl, b.n().e());
    }

    public p q(boolean bl, String string2) {
        return this.m(new d4.a(bl, r.a()), string2);
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

    public void v(final boolean bl) {
        if (!this.b.isEmpty() && this.b.Z().equals(b.l())) {
            throw new d("Can't call keepSynced() on .info paths.");
        }
        this.a.i0(new Runnable(){

            public void run() {
                p p8 = p.this;
                p8.a.Q(p8.u(), bl);
            }
        });
    }

    public p w(int n8) {
        if (n8 > 0) {
            if (!this.c.n()) {
                return new p(this.a, this.b, this.c.s(n8), this.d);
            }
            throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
        }
        throw new IllegalArgumentException("Limit must be a positive integer!");
    }

    public p x(int n8) {
        if (n8 > 0) {
            if (!this.c.n()) {
                return new p(this.a, this.b, this.c.t(n8), this.d);
            }
            throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
        }
        throw new IllegalArgumentException("Limit must be a positive integer!");
    }

    public p y(String object) {
        if (object != null) {
            if (!object.equals((Object)"$key") && !object.equals((Object)".key")) {
                if (!object.equals((Object)"$priority") && !object.equals((Object)".priority")) {
                    if (!object.equals((Object)"$value") && !object.equals((Object)".value")) {
                        Y3.n.h((String)object);
                        this.U();
                        object = new k((String)object);
                        if (object.size() != 0) {
                            object = new d4.p((k)object);
                            return new p(this.a, this.b, this.c.w((h)object), true);
                        }
                        throw new IllegalArgumentException("Can't use empty path, use orderByValue() instead!");
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Can't use '");
                    stringBuilder.append((String)object);
                    stringBuilder.append("' as path, please use orderByValue() instead!");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Can't use '");
                stringBuilder.append((String)object);
                stringBuilder.append("' as path, please use orderByPriority() instead!");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can't use '");
            stringBuilder.append((String)object);
            stringBuilder.append("' as path, please use orderByKey() instead!");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new NullPointerException("Key can't be null");
    }

    public p z() {
        this.U();
        a4.h h8 = this.c.w(j.j());
        this.V(h8);
        return new p(this.a, this.b, h8, true);
    }

}

