// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L0;

import d0.A;
import g0.z;
import F0.T;

public abstract class e
{
    public final T a;
    
    public e(final T a) {
        this.a = a;
    }
    
    public final boolean a(final z z, final long n) {
        return this.b(z) && this.c(z, n);
    }
    
    public abstract boolean b(final z p0);
    
    public abstract boolean c(final z p0, final long p1);
    
    public static final class a extends A
    {
        public a(final String s) {
            super(s, null, false, 1);
        }
    }
}
