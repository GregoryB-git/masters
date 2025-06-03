// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X4;

import Y4.a;

public abstract class g
{
    public static final g b;
    public final g a;
    
    static {
        b = new e(null, 0, 0);
    }
    
    public g(final g a) {
        this.a = a;
    }
    
    public final g a(final int n, final int n2) {
        return new e(this, n, n2);
    }
    
    public final g b(final int n, final int n2) {
        return new b(this, n, n2);
    }
    
    public abstract void c(final a p0, final byte[] p1);
    
    public final g d() {
        return this.a;
    }
}
