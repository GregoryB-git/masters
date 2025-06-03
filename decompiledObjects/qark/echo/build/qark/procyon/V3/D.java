// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V3;

import Q3.k;
import a4.e;
import a4.d;
import a4.c;
import a4.i;
import Q3.s;

public class D extends h
{
    public final m d;
    public final s e;
    public final i f;
    
    public D(final m d, final s e, final i f) {
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public h a(final i i) {
        return new D(this.d, this.e, i);
    }
    
    @Override
    public d b(final c c, final i i) {
        return new d(a4.e.a.s, this, k.a(k.c(this.d, i.e()), c.k()), null);
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
        this.e.b(d.e());
    }
    
    @Override
    public i e() {
        return this.f;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof D) {
            final D d = (D)o;
            if (d.e.equals(this.e) && d.d.equals(this.d) && d.f.equals(this.f)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean f(final h h) {
        return h instanceof D && ((D)h).e.equals(this.e);
    }
    
    @Override
    public int hashCode() {
        return (this.e.hashCode() * 31 + this.d.hashCode()) * 31 + this.f.hashCode();
    }
    
    @Override
    public boolean i(final e.a a) {
        return a == a4.e.a.s;
    }
    
    @Override
    public String toString() {
        return "ValueEventRegistration";
    }
}
