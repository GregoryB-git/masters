// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s4;

import u4.d;
import V2.k;

public class l implements p
{
    public final q a;
    public final k b;
    
    public l(final q a, final k b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public boolean a(final Exception ex) {
        this.b.d(ex);
        return true;
    }
    
    @Override
    public boolean b(final d d) {
        if (d.k() && !this.a.f(d)) {
            this.b.c(n.a().b(d.b()).d(d.c()).c(d.h()).a());
            return true;
        }
        return false;
    }
}
