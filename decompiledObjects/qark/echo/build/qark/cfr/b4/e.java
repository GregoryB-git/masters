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
import b4.b;
import b4.d;
import d4.g;
import d4.i;
import d4.m;
import d4.n;
import d4.r;
import java.util.Iterator;

public class e
implements d {
    public final b a;
    public final d4.h b;
    public final m c;
    public final m d;

    public e(h h8) {
        this.a = new b(h8.d());
        this.b = h8.d();
        this.c = e.j(h8);
        this.d = e.h(h8);
    }

    public static m h(h h8) {
        if (h8.m()) {
            d4.b b8 = h8.e();
            return h8.d().f(b8, h8.f());
        }
        return h8.d().g();
    }

    public static m j(h h8) {
        if (h8.o()) {
            d4.b b8 = h8.g();
            return h8.d().f(b8, h8.h());
        }
        return h8.d().h();
    }

    @Override
    public i a(i i8, n n8) {
        return i8;
    }

    @Override
    public d b() {
        return this.a;
    }

    @Override
    public i c(i i8, d4.b b8, n n8, k k8, d.a a8, a a9) {
        n n9 = n8;
        if (!this.k(new m(b8, n8))) {
            n9 = g.W();
        }
        return this.a.c(i8, b8, n9, k8, a8, a9);
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
        if (i9.k().B()) {
            i9 = i.f(g.W(), this.b);
        } else {
            Object object = i9.M(r.a());
            Iterator iterator = i9.iterator();
            i9 = object;
            while (iterator.hasNext()) {
                object = (m)iterator.next();
                if (this.k((m)object)) continue;
                i9 = i9.D(object.c(), g.W());
            }
        }
        return this.a.f(i8, i9, a8);
    }

    public m g() {
        return this.d;
    }

    public m i() {
        return this.c;
    }

    public boolean k(m m8) {
        if (this.b.compare((Object)this.i(), (Object)m8) <= 0 && this.b.compare((Object)m8, (Object)this.g()) <= 0) {
            return true;
        }
        return false;
    }
}

