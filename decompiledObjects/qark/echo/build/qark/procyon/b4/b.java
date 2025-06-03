// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b4;

import java.util.Iterator;
import a4.c;
import Y3.m;
import V3.k;
import d4.n;
import d4.i;
import d4.h;

public class b implements d
{
    public final h a;
    
    public b(final h a) {
        this.a = a;
    }
    
    @Override
    public i a(final i i, final n n) {
        if (i.k().isEmpty()) {
            return i;
        }
        return i.M(n);
    }
    
    @Override
    public d b() {
        return this;
    }
    
    @Override
    public i c(final i i, final d4.b b, final n n, final k k, final a a, final b4.a a2) {
        m.g(i.s(this.a), "The index must match the filter");
        final n j = i.k();
        final n v = j.v(b);
        if (v.A(k).equals(n.A(k)) && v.isEmpty() == n.isEmpty()) {
            return i;
        }
        Label_0160: {
            if (a2 != null) {
                c c;
                if (n.isEmpty()) {
                    if (!j.Q(b)) {
                        m.g(j.B(), "A child remove without an old child only makes sense on a leaf node");
                        break Label_0160;
                    }
                    c = a4.c.h(b, v);
                }
                else if (v.isEmpty()) {
                    c = a4.c.c(b, n);
                }
                else {
                    c = a4.c.e(b, n, v);
                }
                a2.b(c);
            }
        }
        if (j.B() && n.isEmpty()) {
            return i;
        }
        return i.D(b, n);
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public h e() {
        return this.a;
    }
    
    @Override
    public i f(final i i, final i j, final b4.a a) {
        m.g(j.s(this.a), "Can't use IndexedNode that doesn't have filter's index");
        if (a != null) {
            for (final d4.m m : i.k()) {
                if (!j.k().Q(m.c())) {
                    a.b(c.h(m.c(), m.d()));
                }
            }
            if (!j.k().B()) {
                for (final d4.m k : j.k()) {
                    c c;
                    if (i.k().Q(k.c())) {
                        final n v = i.k().v(k.c());
                        if (v.equals(k.d())) {
                            continue;
                        }
                        c = a4.c.e(k.c(), k.d(), v);
                    }
                    else {
                        c = a4.c.c(k.c(), k.d());
                    }
                    a.b(c);
                }
            }
        }
        return j;
    }
}
