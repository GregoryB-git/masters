// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q3;

import java.util.Map;
import d4.r;
import d4.o;
import Z3.a;
import V3.C;
import Y3.g;
import V2.j;
import V3.k;
import V3.m;

public class n
{
    public m a;
    public k b;
    
    public n(final m a, final k b) {
        this.a = a;
        this.b = b;
    }
    
    public static /* synthetic */ k a(final n n) {
        return n.b;
    }
    
    public static /* synthetic */ m b(final n n) {
        return n.a;
    }
    
    public j c() {
        return this.d(null);
    }
    
    public final j d(final e.e e) {
        final g l = Y3.m.l(e);
        this.a.i0(new Runnable() {
            @Override
            public void run() {
                n.b(n.this).T(n.a(n.this), (e.e)l.b());
            }
        });
        return (j)l.a();
    }
    
    public final j e(Object b, final d4.n n, final e.e e) {
        Y3.n.l(this.b);
        C.g(this.b, b);
        b = Z3.a.b(b);
        Y3.n.k(b);
        final d4.n b2 = o.b(b, n);
        final g l = Y3.m.l(e);
        this.a.i0(new Runnable() {
            @Override
            public void run() {
                n.b(n.this).U(n.a(n.this), b2, (e.e)l.b());
            }
        });
        return (j)l.a();
    }
    
    public j f(final Object o) {
        return this.e(o, r.a(), null);
    }
    
    public j g(final Object o, final double d) {
        return this.e(o, r.c(this.b, d), null);
    }
    
    public j h(final Object o, final String s) {
        return this.e(o, r.c(this.b, s), null);
    }
    
    public j i(final Map map) {
        return this.j(map, null);
    }
    
    public final j j(final Map map, final e.e e) {
        final Map e2 = Y3.n.e(this.b, map);
        final g l = Y3.m.l(e);
        this.a.i0(new Runnable() {
            @Override
            public void run() {
                n.b(n.this).V(n.a(n.this), e2, (e.e)l.b(), map);
            }
        });
        return (j)l.a();
    }
}
