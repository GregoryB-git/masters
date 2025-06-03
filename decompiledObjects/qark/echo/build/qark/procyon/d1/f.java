// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d1;

import java.util.Collections;
import g0.a;
import java.util.List;
import c1.k;

public final class f implements k
{
    public final List o;
    
    public f(final List o) {
        this.o = o;
    }
    
    @Override
    public int c(final long n) {
        if (n < 0L) {
            return 0;
        }
        return -1;
    }
    
    @Override
    public long e(final int n) {
        a.a(n == 0);
        return 0L;
    }
    
    @Override
    public List h(final long n) {
        if (n >= 0L) {
            return this.o;
        }
        return Collections.emptyList();
    }
    
    @Override
    public int j() {
        return 1;
    }
}
