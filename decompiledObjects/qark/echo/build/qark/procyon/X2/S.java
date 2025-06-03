// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.Objects;
import W2.m;

public class S extends v
{
    public static final v s;
    public final transient Object[] q;
    public final transient int r;
    
    static {
        s = new S(new Object[0], 0);
    }
    
    public S(final Object[] q, final int r) {
        this.q = q;
        this.r = r;
    }
    
    @Override
    public int d(final Object[] array, final int n) {
        System.arraycopy(this.q, 0, array, n, this.r);
        return n + this.r;
    }
    
    @Override
    public Object[] f() {
        return this.q;
    }
    
    @Override
    public int g() {
        return this.r;
    }
    
    @Override
    public Object get(final int n) {
        m.h(n, this.r);
        final Object obj = this.q[n];
        Objects.requireNonNull(obj);
        return obj;
    }
    
    @Override
    public int i() {
        return 0;
    }
    
    @Override
    public boolean k() {
        return false;
    }
    
    @Override
    public int size() {
        return this.r;
    }
    
    @Override
    public Object writeReplace() {
        return super.writeReplace();
    }
}
