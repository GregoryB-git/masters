// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import g0.a;
import d0.q;
import F0.t;
import F0.g;
import g0.z;
import F0.T;
import java.util.List;

public final class F
{
    public final List a;
    public final T[] b;
    
    public F(final List a) {
        this.a = a;
        this.b = new T[a.size()];
    }
    
    public void a(final long n, final z z) {
        g.a(n, z, this.b);
    }
    
    public void b(final t t, final K.d d) {
        for (int i = 0; i < this.b.length; ++i) {
            d.a();
            final T a = t.a(d.c(), 3);
            final q q = this.a.get(i);
            final String n = q.n;
            final boolean b = "application/cea-608".equals(n) || "application/cea-708".equals(n);
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid closed caption MIME type provided: ");
            sb.append(n);
            g0.a.b(b, sb.toString());
            String s = q.a;
            if (s == null) {
                s = d.b();
            }
            a.d(new q.b().a0(s).o0(n).q0(q.e).e0(q.d).L(q.G).b0(q.q).K());
            this.b[i] = a;
        }
    }
}
