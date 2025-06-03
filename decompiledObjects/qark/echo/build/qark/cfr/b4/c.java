/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 */
package b4;

import V3.k;
import a4.h;
import b4.a;
import b4.d;
import b4.e;
import d4.b;
import d4.g;
import d4.i;
import d4.m;
import d4.n;
import d4.r;
import java.util.Iterator;

public class c
implements d {
    public final e a;
    public final d4.h b;
    public final int c;
    public final boolean d;

    public c(h h8) {
        this.a = new e(h8);
        this.b = h8.d();
        this.c = h8.i();
        this.d = h8.r() ^ true;
    }

    @Override
    public i a(i i8, n n8) {
        return i8;
    }

    @Override
    public d b() {
        return this.a.b();
    }

    @Override
    public i c(i i8, b b8, n n8, k k8, d.a a8, a a9) {
        n n9 = n8;
        if (!this.a.k(new m(b8, n8))) {
            n9 = g.W();
        }
        if (i8.k().v(b8).equals((Object)n9)) {
            return i8;
        }
        if (i8.k().E() < this.c) {
            return this.a.b().c(i8, b8, n9, k8, a8, a9);
        }
        return this.g(i8, b8, n9, a8, a9);
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public d4.h e() {
        return this.b;
    }

    @Override
    public i f(i i8, i i9, a a8) {
        Object object;
        if (!i9.k().B() && !i9.k().isEmpty()) {
            Iterator iterator;
            m m8;
            m m9;
            int n8;
            object = i9.M(r.a());
            if (this.d) {
                iterator = i9.P();
                m9 = this.a.g();
                m8 = this.a.i();
                n8 = -1;
            } else {
                iterator = i9.iterator();
                m9 = this.a.i();
                m8 = this.a.g();
                n8 = 1;
            }
            boolean bl = false;
            int n9 = 0;
            i9 = object;
            do {
                object = i9;
                if (iterator.hasNext()) {
                    object = (m)iterator.next();
                    boolean bl2 = bl;
                    if (!bl) {
                        bl2 = bl;
                        if (this.b.compare((Object)m9, object) * n8 <= 0) {
                            bl2 = true;
                        }
                    }
                    if (bl2 && n9 < this.c && this.b.compare(object, (Object)m8) * n8 <= 0) {
                        ++n9;
                        bl = bl2;
                        continue;
                    }
                    i9 = i9.D(object.c(), g.W());
                    bl = bl2;
                    continue;
                }
                break;
            } while (true);
        } else {
            object = i.f(g.W(), this.b);
        }
        return this.a.b().f(i8, (i)object, a8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final i g(i i8, b object, n n8, d.a a8, a a9) {
        int n9 = i8.k().E();
        int n10 = this.c;
        int n11 = 1;
        boolean bl = n9 == n10;
        Y3.m.f(bl);
        m m8 = new m((b)object, n8);
        m m9 = this.d ? i8.g() : i8.i();
        bl = this.a.k(m8);
        if (i8.k().Q((b)object)) {
            m m10;
            n n12 = i8.k().v((b)object);
            while ((m10 = a8.a(this.b, m9, this.d)) != null) {
                m9 = m10;
                if (m10.c().equals(object)) continue;
                if (!i8.k().Q(m10.c())) break;
                m9 = m10;
            }
            if (m10 != null) {
                n11 = this.b.a(m10, m8, this.d);
            }
            if (bl && !n8.isEmpty() && n11 >= 0) {
                if (a9 == null) return i8.D((b)object, n8);
                a9.b(a4.c.e((b)object, n8, n12));
                return i8.D((b)object, n8);
            }
            if (a9 != null) {
                a9.b(a4.c.h((b)object, n12));
            }
            i8 = i8.D((b)object, g.W());
            object = i8;
            if (m10 == null) return object;
            object = i8;
            if (!this.a.k(m10)) return object;
            if (a9 != null) {
                a9.b(a4.c.c(m10.c(), m10.d()));
            }
            object = m10.c();
            n8 = m10.d();
            do {
                return i8.D((b)object, n8);
                break;
            } while (true);
        }
        if (n8.isEmpty()) {
            return i8;
        }
        if (!bl) return i8;
        if (this.b.a(m9, m8, this.d) < 0) return i8;
        if (a9 != null) {
            a9.b(a4.c.h(m9.c(), m9.d()));
            a9.b(a4.c.c((b)object, n8));
        }
        i8 = i8.D((b)object, n8);
        object = m9.c();
        n8 = g.W();
        return i8.D((b)object, n8);
    }
}

