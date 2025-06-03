// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c1;

import F0.L;
import F0.q;
import java.util.List;
import F0.s;
import F0.r;

public class u implements r
{
    public final r a;
    public final t.a b;
    public v c;
    
    public u(final r a, final t.a b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final long n, final long n2) {
        final v c = this.c;
        if (c != null) {
            c.b();
        }
        this.a.a(n, n2);
    }
    
    @Override
    public void b(final F0.t t) {
        final v c = new v(t, this.b);
        this.c = c;
        this.a.b(c);
    }
    
    @Override
    public r d() {
        return this.a;
    }
    
    @Override
    public boolean e(final s s) {
        return this.a.e(s);
    }
    
    @Override
    public int i(final s s, final L l) {
        return this.a.i(s, l);
    }
    
    @Override
    public void release() {
        this.a.release();
    }
}
