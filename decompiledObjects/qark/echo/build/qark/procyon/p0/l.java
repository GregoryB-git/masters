// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p0;

import X2.g0;
import android.net.Uri;
import java.util.Collection;
import a3.f;
import java.util.Map;
import g0.M;
import g0.a;
import B0.m;
import i0.g;
import d0.u;

public final class l implements A
{
    public final Object a;
    public u.f b;
    public x c;
    public g.a d;
    public String e;
    public m f;
    
    public l() {
        this.a = new Object();
    }
    
    @Override
    public x a(u a) {
        a.e(a.b);
        final u.f c = a.b.c;
        if (c == null) {
            return x.a;
        }
        a = (u)this.a;
        // monitorenter(a)
        while (true) {
            try {
                if (!M.c(c, this.b)) {
                    this.b = c;
                    this.c = this.b(c);
                }
                // monitorexit(a)
                return (x)a.e(this.c);
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final x b(final u.f f) {
        g.a a = this.d;
        if (a == null) {
            a = new i0.m.b().e(this.e);
        }
        final Uri c = f.c;
        String string;
        if (c == null) {
            string = null;
        }
        else {
            string = c.toString();
        }
        final O o = new O(string, f.h, a);
        final g0 q = f.e.g().q();
        while (q.hasNext()) {
            final Map.Entry<String, V> entry = q.next();
            o.e(entry.getKey(), (String)entry.getValue());
        }
        final h.b e = new h.b().f(f.a, N.d).c(f.f).d(f.g).e(f.n(f.j));
        final m f2 = this.f;
        if (f2 != null) {
            e.b(f2);
        }
        final h a2 = e.a(o);
        a2.F(0, f.c());
        return a2;
    }
}
