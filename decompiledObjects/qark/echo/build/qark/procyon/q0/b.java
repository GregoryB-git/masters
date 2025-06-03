// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q0;

import g0.a;
import l1.J;
import F0.s;
import Y0.f;
import l1.e;
import l1.h;
import c1.t;
import g0.E;
import d0.q;
import F0.r;
import F0.L;

public final class b implements k
{
    public static final L f;
    public final r a;
    public final q b;
    public final E c;
    public final t.a d;
    public final boolean e;
    
    static {
        f = new L();
    }
    
    public b(final r a, final q b, final E c, final t.a d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public boolean a() {
        final r d = this.a.d();
        return d instanceof h || d instanceof l1.b || d instanceof e || d instanceof f;
    }
    
    @Override
    public void b(final F0.t t) {
        this.a.b(t);
    }
    
    @Override
    public boolean c(final s s) {
        return this.a.i(s, q0.b.f) == 0;
    }
    
    @Override
    public void d() {
        this.a.a(0L, 0L);
    }
    
    @Override
    public boolean e() {
        final r d = this.a.d();
        return d instanceof J || d instanceof Z0.h;
    }
    
    @Override
    public k f() {
        final boolean e = this.e();
        boolean b = true;
        g0.a.f(e ^ true);
        if (this.a.d() != this.a) {
            b = false;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Can't recreate wrapped extractors. Outer type: ");
        sb.append(this.a.getClass());
        g0.a.g(b, sb.toString());
        final r a = this.a;
        r r;
        if (a instanceof w) {
            r = new w(this.b.d, this.c, this.d, this.e);
        }
        else if (a instanceof h) {
            r = new h();
        }
        else if (a instanceof l1.b) {
            r = new l1.b();
        }
        else if (a instanceof e) {
            r = new e();
        }
        else {
            if (!(a instanceof f)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected extractor type for recreation: ");
                sb2.append(this.a.getClass().getSimpleName());
                throw new IllegalStateException(sb2.toString());
            }
            r = new f();
        }
        return new b(r, this.b, this.c, this.d, this.e);
    }
}
