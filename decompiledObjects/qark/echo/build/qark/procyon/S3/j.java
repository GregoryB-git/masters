// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S3;

import java.util.Comparator;

public abstract class j implements h
{
    public final Object a;
    public final Object b;
    public h c;
    public final h d;
    
    public j(final Object a, final Object b, final h h, final h h2) {
        this.a = a;
        this.b = b;
        h j = h;
        if (h == null) {
            j = g.j();
        }
        this.c = j;
        h i;
        if ((i = h2) == null) {
            i = g.j();
        }
        this.d = i;
    }
    
    public static a q(final h h) {
        if (h.d()) {
            return a.p;
        }
        return a.o;
    }
    
    @Override
    public h a() {
        return this.c;
    }
    
    @Override
    public h b(final Object o, final Object o2, final Comparator comparator) {
        final int compare = comparator.compare(o, this.a);
        j j;
        if (compare < 0) {
            j = this.l(null, null, this.c.b(o, o2, comparator), null);
        }
        else if (compare == 0) {
            j = this.l(o, o2, null, null);
        }
        else {
            j = this.l(null, null, null, this.d.b(o, o2, comparator));
        }
        return j.m();
    }
    
    @Override
    public void e(final b b) {
        this.c.e(b);
        b.a(this.a, this.b);
        this.d.e(b);
    }
    
    @Override
    public h f() {
        return this.d;
    }
    
    @Override
    public h g(final Object o, final Comparator comparator) {
        j j;
        if (comparator.compare(o, this.a) < 0) {
            j o2;
            if (!this.c.isEmpty() && !this.c.d() && !((j)this.c).c.d()) {
                o2 = this.o();
            }
            else {
                o2 = this;
            }
            j = o2.l(null, null, o2.c.g(o, comparator), null);
        }
        else {
            j t;
            if (this.c.d()) {
                t = this.t();
            }
            else {
                t = this;
            }
            j p2 = t;
            if (!t.d.isEmpty()) {
                p2 = t;
                if (!t.d.d()) {
                    p2 = t;
                    if (!((j)t.d).c.d()) {
                        p2 = t.p();
                    }
                }
            }
            j l = p2;
            if (comparator.compare(o, p2.a) == 0) {
                if (p2.d.isEmpty()) {
                    return g.j();
                }
                final h h = p2.d.h();
                l = p2.l(h.getKey(), h.getValue(), null, ((j)p2.d).r());
            }
            j = l.l(null, null, null, l.d.g(o, comparator));
        }
        return j.m();
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
        final h c = this.c;
        final h c2 = c.c(null, null, q(c), null, null);
        final h d = this.d;
        return this.k(null, null, q(this), c2, d.c(null, null, q(d), null, null));
    }
    
    public j k(Object b, final Object o, final a a, h d, final h h) {
        Object a2 = b;
        if (b == null) {
            a2 = this.a;
        }
        if ((b = o) == null) {
            b = this.b;
        }
        h c;
        if ((c = d) == null) {
            c = this.c;
        }
        if ((d = h) == null) {
            d = this.d;
        }
        if (a == a.o) {
            return new i(a2, b, c, d);
        }
        return new f(a2, b, c, d);
    }
    
    public abstract j l(final Object p0, final Object p1, final h p2, final h p3);
    
    public final j m() {
        j s;
        if (this.d.d() && !this.c.d()) {
            s = this.s();
        }
        else {
            s = this;
        }
        j t = s;
        if (s.c.d()) {
            t = s;
            if (((j)s.c).c.d()) {
                t = s.t();
            }
        }
        j j = t;
        if (t.c.d()) {
            j = t;
            if (t.d.d()) {
                j = t.j();
            }
        }
        return j;
    }
    
    public abstract a n();
    
    public final j o() {
        j i;
        final j j = i = this.j();
        if (j.f().a().d()) {
            i = j.l(null, null, null, ((j)j.f()).t()).s().j();
        }
        return i;
    }
    
    public final j p() {
        j i;
        final j j = i = this.j();
        if (j.a().a().d()) {
            i = j.t().j();
        }
        return i;
    }
    
    public final h r() {
        if (this.c.isEmpty()) {
            return g.j();
        }
        j o;
        if (!this.a().d() && !this.a().a().d()) {
            o = this.o();
        }
        else {
            o = this;
        }
        return o.l(null, null, ((j)o.c).r(), null).m();
    }
    
    public final j s() {
        return (j)this.d.c(null, null, this.n(), this.k(null, null, h.a.o, null, ((j)this.d).c), null);
    }
    
    public final j t() {
        return (j)this.c.c(null, null, this.n(), null, this.k(null, null, h.a.o, ((j)this.c).d, null));
    }
    
    public void u(final h c) {
        this.c = c;
    }
}
