// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b4;

import java.util.Iterator;
import d4.r;
import d4.g;
import V3.k;
import d4.n;
import d4.i;
import d4.m;
import d4.h;

public class e implements d
{
    public final b a;
    public final h b;
    public final m c;
    public final m d;
    
    public e(final a4.h h) {
        this.a = new b(h.d());
        this.b = h.d();
        this.c = j(h);
        this.d = h(h);
    }
    
    public static m h(final a4.h h) {
        if (h.m()) {
            return h.d().f(h.e(), h.f());
        }
        return h.d().g();
    }
    
    public static m j(final a4.h h) {
        if (h.o()) {
            return h.d().f(h.g(), h.h());
        }
        return h.d().h();
    }
    
    @Override
    public i a(final i i, final n n) {
        return i;
    }
    
    @Override
    public d b() {
        return this.a;
    }
    
    @Override
    public i c(final i i, final d4.b b, final n n, final k k, final a a, final b4.a a2) {
        n w = n;
        if (!this.k(new m(b, n))) {
            w = g.W();
        }
        return this.a.c(i, b, w, k, a, a2);
    }
    
    @Override
    public boolean d() {
        return true;
    }
    
    @Override
    public h e() {
        return this.b;
    }
    
    @Override
    public i f(final i i, i j, final b4.a a) {
        if (j.k().B()) {
            j = i.f(g.W(), this.b);
        }
        else {
            final i m = j.M(r.a());
            final Iterator iterator = j.iterator();
            j = m;
            while (iterator.hasNext()) {
                final m k = iterator.next();
                if (!this.k(k)) {
                    j = j.D(k.c(), g.W());
                }
            }
        }
        return this.a.f(i, j, a);
    }
    
    public m g() {
        return this.d;
    }
    
    public m i() {
        return this.c;
    }
    
    public boolean k(final m m) {
        return this.b.compare(this.i(), m) <= 0 && this.b.compare(m, this.g()) <= 0;
    }
}
