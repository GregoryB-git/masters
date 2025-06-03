// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A0;

import y0.n;
import java.util.List;
import d0.J;

public final class z extends c
{
    public final int h;
    public final Object i;
    
    public z(final J j, final int n, final int n2) {
        this(j, n, n2, 0, null);
    }
    
    public z(final J j, final int n, final int n2, final int h, final Object i) {
        super(j, new int[] { n }, n2);
        this.h = h;
        this.i = i;
    }
    
    @Override
    public int n() {
        return this.h;
    }
    
    @Override
    public int o() {
        return 0;
    }
    
    @Override
    public Object s() {
        return this.i;
    }
    
    @Override
    public void v(final long n, final long n2, final long n3, final List list, final n[] array) {
    }
}
