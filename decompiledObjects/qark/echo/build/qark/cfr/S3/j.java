/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Comparator
 */
package S3;

import S3.f;
import S3.g;
import S3.h;
import S3.i;
import java.util.Comparator;

public abstract class j
implements h {
    public final Object a;
    public final Object b;
    public h c;
    public final h d;

    public j(Object object, Object object2, h h8, h h9) {
        this.a = object;
        this.b = object2;
        object = h8;
        if (h8 == null) {
            object = g.j();
        }
        this.c = object;
        object = h9;
        if (h9 == null) {
            object = g.j();
        }
        this.d = object;
    }

    public static h.a q(h h8) {
        if (h8.d()) {
            return h.a.p;
        }
        return h.a.o;
    }

    @Override
    public h a() {
        return this.c;
    }

    @Override
    public h b(Object object, Object object2, Comparator comparator) {
        int n8 = comparator.compare(object, this.a);
        object = n8 < 0 ? this.l(null, null, this.c.b(object, object2, comparator), null) : (n8 == 0 ? this.l(object, object2, null, null) : this.l(null, null, null, this.d.b(object, object2, comparator)));
        return object.m();
    }

    @Override
    public void e(h.b b8) {
        this.c.e(b8);
        b8.a(this.a, this.b);
        this.d.e(b8);
    }

    @Override
    public h f() {
        return this.d;
    }

    @Override
    public h g(Object object, Comparator comparator) {
        if (comparator.compare(object, this.a) < 0) {
            j j8 = !this.c.isEmpty() && !this.c.d() && !((j)this.c).c.d() ? this.o() : this;
            object = j8.l(null, null, j8.c.g(object, comparator), null);
        } else {
            h h8 = this.c.d() ? this.t() : this;
            j j9 = h8;
            if (!h8.d.isEmpty()) {
                j9 = h8;
                if (!h8.d.d()) {
                    j9 = h8;
                    if (!((j)h8.d).c.d()) {
                        j9 = h8.p();
                    }
                }
            }
            h8 = j9;
            if (comparator.compare(object, j9.a) == 0) {
                if (j9.d.isEmpty()) {
                    return g.j();
                }
                h8 = j9.d.h();
                h8 = j9.l(h8.getKey(), h8.getValue(), null, ((j)j9.d).r());
            }
            object = h8.l(null, null, null, h8.d.g(object, comparator));
        }
        return object.m();
    }

    @Override
    public Object getKey() {
        return this.a;
    }

    @Override
    public Object getValue() {
        return this.b;
    }

    @Override
    public h h() {
        if (this.c.isEmpty()) {
            return this;
        }
        return this.c.h();
    }

    @Override
    public h i() {
        if (this.d.isEmpty()) {
            return this;
        }
        return this.d.i();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public final j j() {
        h h8 = this.c;
        h8 = h8.c(null, null, j.q(h8), null, null);
        h h9 = this.d;
        h9 = h9.c(null, null, j.q(h9), null, null);
        return this.k(null, null, j.q(this), h8, h9);
    }

    public j k(Object object, Object object2, h.a a8, h h8, h h9) {
        Object object3 = object;
        if (object == null) {
            object3 = this.a;
        }
        object = object2;
        if (object2 == null) {
            object = this.b;
        }
        object2 = h8;
        if (h8 == null) {
            object2 = this.c;
        }
        h8 = h9;
        if (h9 == null) {
            h8 = this.d;
        }
        if (a8 == h.a.o) {
            return new i(object3, object, (h)object2, h8);
        }
        return new f(object3, object, (h)object2, h8);
    }

    public abstract j l(Object var1, Object var2, h var3, h var4);

    public final j m() {
        j j8 = this.d.d() && !this.c.d() ? this.s() : this;
        j j9 = j8;
        if (j8.c.d()) {
            j9 = j8;
            if (((j)j8.c).c.d()) {
                j9 = j8.t();
            }
        }
        j8 = j9;
        if (j9.c.d()) {
            j8 = j9;
            if (j9.d.d()) {
                j8 = j9.j();
            }
        }
        return j8;
    }

    public abstract h.a n();

    public final j o() {
        j j8;
        j j9 = j8 = this.j();
        if (j8.f().a().d()) {
            j9 = j8.l(null, null, null, ((j)j8.f()).t()).s().j();
        }
        return j9;
    }

    public final j p() {
        j j8;
        j j9 = j8 = this.j();
        if (j8.a().a().d()) {
            j9 = j8.t().j();
        }
        return j9;
    }

    public final h r() {
        if (this.c.isEmpty()) {
            return g.j();
        }
        j j8 = !this.a().d() && !this.a().a().d() ? this.o() : this;
        return j8.l(null, null, ((j)j8.c).r(), null).m();
    }

    public final j s() {
        j j8 = this.k(null, null, h.a.o, null, ((j)this.d).c);
        return (j)this.d.c(null, null, this.n(), j8, null);
    }

    public final j t() {
        j j8 = this.k(null, null, h.a.o, ((j)this.c).d, null);
        return (j)this.c.c(null, null, this.n(), null, j8);
    }

    public void u(h h8) {
        this.c = h8;
    }
}

