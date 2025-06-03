// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V3;

import a4.e;
import Q3.b;
import Q3.k;
import a4.d;
import a4.c;
import a4.i;

public class a extends h
{
    public final m d;
    public final Q3.a e;
    public final i f;
    
    public a(final m d, final Q3.a e, final i f) {
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public h a(final i i) {
        return new a(this.d, this.e, i);
    }
    
    @Override
    public d b(final c c, final i i) {
        final b a = k.a(k.c(this.d, i.e().U(c.i())), c.k());
        String e;
        if (c.m() != null) {
            e = c.m().e();
        }
        else {
            e = null;
        }
        return new d(c.j(), this, a, e);
    }
    
    @Override
    public void c(final Q3.c c) {
        this.e.a(c);
    }
    
    @Override
    public void d(final d d) {
        if (this.h()) {
            return;
        }
        final int n = a$a.a[d.b().ordinal()];
        if (n == 1) {
            this.e.f(d.e(), d.d());
            return;
        }
        if (n == 2) {
            this.e.e(d.e(), d.d());
            return;
        }
        if (n == 3) {
            this.e.d(d.e(), d.d());
            return;
        }
        if (n != 4) {
            return;
        }
        this.e.c(d.e());
    }
    
    @Override
    public i e() {
        return this.f;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof a) {
            final a a = (a)o;
            if (a.e.equals(this.e) && a.d.equals(this.d) && a.f.equals(this.f)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean f(final h h) {
        return h instanceof a && ((a)h).e.equals(this.e);
    }
    
    @Override
    public int hashCode() {
        return (this.e.hashCode() * 31 + this.d.hashCode()) * 31 + this.f.hashCode();
    }
    
    @Override
    public boolean i(final e.a a) {
        return a != a4.e.a.s;
    }
    
    @Override
    public String toString() {
        return "ChildEventRegistration";
    }
}
