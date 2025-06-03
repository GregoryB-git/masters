/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.Callable
 */
package X3;

import V3.k;
import X3.a;
import X3.e;
import X3.f;
import X3.g;
import X3.h;
import X3.i;
import Y3.m;
import c4.c;
import d4.n;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

public class b
implements e {
    public final f a;
    public final i b;
    public final c c;
    public final a d;
    public long e = 0L;

    public b(V3.f f8, f f9, a a8) {
        this(f8, f9, a8, new Y3.b());
    }

    public b(V3.f object, f f8, a a8, Y3.a a9) {
        this.a = f8;
        this.c = object = object.q("Persistence");
        this.b = new i(f8, (c)object, a9);
        this.d = a8;
    }

    @Override
    public void a() {
        this.a.a();
    }

    @Override
    public void b(long l8) {
        this.a.b(l8);
    }

    @Override
    public void c(k k8, V3.b b8, long l8) {
        this.a.c(k8, b8, l8);
    }

    @Override
    public List d() {
        return this.a.d();
    }

    @Override
    public void e(k k8, n n8, long l8) {
        this.a.e(k8, n8, l8);
    }

    @Override
    public void f(k k8, V3.b b8) {
        this.a.o(k8, b8);
        this.q();
    }

    @Override
    public Object g(Callable object) {
        this.a.g();
        try {
            object = object.call();
            this.a.p();
        }
        catch (Throwable throwable) {
            try {
                this.c.c("Caught Throwable.", throwable);
                throw new RuntimeException(throwable);
            }
            catch (Throwable throwable2) {
                this.a.f();
                throw throwable2;
            }
        }
        this.a.f();
        return object;
    }

    @Override
    public void h(k k8, V3.b b8) {
        for (Map.Entry entry : b8) {
            this.n(k8.T((k)entry.getKey()), (n)entry.getValue());
        }
    }

    @Override
    public void i(a4.i i8) {
        this.b.x(i8);
    }

    @Override
    public void j(a4.i i8, n n8) {
        if (i8.g()) {
            this.a.t(i8.e(), n8);
        } else {
            this.a.s(i8.e(), n8);
        }
        this.p(i8);
        this.q();
    }

    @Override
    public a4.a k(a4.i i8) {
        boolean bl;
        Object object;
        if (this.b.n(i8)) {
            object = this.b.i(i8);
            object = !i8.g() && object != null && object.d ? this.a.i(object.a) : null;
            bl = true;
        } else {
            object = this.b.j(i8.e());
            bl = false;
        }
        n n8 = this.a.q(i8.e());
        if (object != null) {
            Comparable comparable = d4.g.W();
            Iterator iterator = object.iterator();
            object = comparable;
            while (iterator.hasNext()) {
                comparable = (d4.b)iterator.next();
                object = object.N((d4.b)comparable, n8.v((d4.b)comparable));
            }
            return new a4.a(d4.i.f((n)object, i8.c()), bl, true);
        }
        return new a4.a(d4.i.f(n8, i8.c()), bl, false);
    }

    @Override
    public void l(a4.i object, Set set, Set set2) {
        boolean bl = object.g();
        boolean bl2 = true;
        m.g(bl ^ true, "We should only track keys for filtered queries.");
        object = this.b.i((a4.i)object);
        if (object == null || !object.e) {
            bl2 = false;
        }
        m.g(bl2, "We only expect tracked keys for currently-active queries.");
        this.a.r(object.a, set, set2);
    }

    @Override
    public void m(a4.i i8) {
        this.b.u(i8);
    }

    @Override
    public void n(k k8, n n8) {
        if (!this.b.l(k8)) {
            this.a.t(k8, n8);
            this.b.g(k8);
        }
    }

    @Override
    public void o(a4.i object, Set set) {
        boolean bl = object.g();
        boolean bl2 = true;
        m.g(bl ^ true, "We should only track keys for filtered queries.");
        object = this.b.i((a4.i)object);
        if (object == null || !object.e) {
            bl2 = false;
        }
        m.g(bl2, "We only expect tracked keys for currently-active queries.");
        this.a.k(object.a, set);
    }

    @Override
    public void p(a4.i i8) {
        if (i8.g()) {
            this.b.t(i8.e());
            return;
        }
        this.b.w(i8);
    }

    public final void q() {
        long l8;
        this.e = l8 = this.e + 1L;
        if (this.d.d(l8)) {
            StringBuilder stringBuilder;
            Object object;
            if (this.c.f()) {
                this.c.b("Reached prune check threshold.", new Object[0]);
            }
            this.e = 0L;
            l8 = this.a.l();
            if (this.c.f()) {
                object = this.c;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Cache size: ");
                stringBuilder.append(l8);
                object.b(stringBuilder.toString(), new Object[0]);
            }
            boolean bl = true;
            while (bl && this.d.a(l8, this.b.f())) {
                boolean bl2;
                object = this.b.p(this.d);
                if (object.e()) {
                    this.a.m(k.Y(), (g)object);
                    bl2 = bl;
                } else {
                    bl2 = false;
                }
                long l9 = this.a.l();
                bl = bl2;
                l8 = l9;
                if (!this.c.f()) continue;
                object = this.c;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Cache size after prune: ");
                stringBuilder.append(l9);
                object.b(stringBuilder.toString(), new Object[0]);
                bl = bl2;
                l8 = l9;
            }
        }
    }
}

