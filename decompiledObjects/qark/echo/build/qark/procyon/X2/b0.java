// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.Iterator;
import W2.m;

public final class b0 extends y
{
    public final transient Object q;
    
    public b0(final Object o) {
        this.q = m.j(o);
    }
    
    @Override
    public v a() {
        return v.Z(this.q);
    }
    
    @Override
    public boolean contains(final Object obj) {
        return this.q.equals(obj);
    }
    
    @Override
    public int d(final Object[] array, final int n) {
        array[n] = this.q;
        return n + 1;
    }
    
    @Override
    public final int hashCode() {
        return this.q.hashCode();
    }
    
    @Override
    public boolean k() {
        return false;
    }
    
    @Override
    public g0 q() {
        return C.s(this.q);
    }
    
    @Override
    public int size() {
        return 1;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(this.q.toString());
        sb.append(']');
        return sb.toString();
    }
    
    @Override
    public Object writeReplace() {
        return super.writeReplace();
    }
}
