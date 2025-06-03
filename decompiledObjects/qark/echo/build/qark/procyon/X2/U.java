// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.Iterator;

public final class U extends y
{
    public static final Object[] v;
    public static final U w;
    public final transient Object[] q;
    public final transient int r;
    public final transient Object[] s;
    public final transient int t;
    public final transient int u;
    
    static {
        final Object[] array = v = new Object[0];
        w = new U(array, 0, array, 0, 0);
    }
    
    public U(final Object[] q, final int r, final Object[] s, final int t, final int u) {
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
    }
    
    @Override
    public v V() {
        return X2.v.D(this.q, this.u);
    }
    
    @Override
    public boolean W() {
        return true;
    }
    
    @Override
    public boolean contains(final Object obj) {
        final Object[] s = this.s;
        if (obj == null) {
            return false;
        }
        if (s.length == 0) {
            return false;
        }
        int c = X2.s.c(obj);
        while (true) {
            final int n = c & this.t;
            final Object o = s[n];
            if (o == null) {
                return false;
            }
            if (o.equals(obj)) {
                return true;
            }
            c = n + 1;
        }
    }
    
    @Override
    public int d(final Object[] array, final int n) {
        System.arraycopy(this.q, 0, array, n, this.u);
        return n + this.u;
    }
    
    @Override
    public Object[] f() {
        return this.q;
    }
    
    @Override
    public int g() {
        return this.u;
    }
    
    @Override
    public int hashCode() {
        return this.r;
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
    public g0 q() {
        return this.a().q();
    }
    
    @Override
    public int size() {
        return this.u;
    }
    
    @Override
    public Object writeReplace() {
        return super.writeReplace();
    }
}
