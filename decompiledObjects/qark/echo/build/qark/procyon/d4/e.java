// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d4;

import Y3.m;
import java.util.Map;

public class e extends k
{
    public Map q;
    
    public e(final Map q, final n n) {
        super(n);
        this.q = q;
    }
    
    @Override
    public String O(final n.b b) {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.T(b));
        sb.append("deferredValue:");
        sb.append(this.q);
        return sb.toString();
    }
    
    @Override
    public b S() {
        return b.o;
    }
    
    public int V(final e e) {
        return 0;
    }
    
    public e W(final n n) {
        m.f(r.b(n));
        return new e(this.q, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof e;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final e e = (e)o;
        boolean b3 = b2;
        if (this.q.equals(e.q)) {
            b3 = b2;
            if (super.o.equals(e.o)) {
                b3 = true;
            }
        }
        return b3;
    }
    
    @Override
    public Object getValue() {
        return this.q;
    }
    
    @Override
    public int hashCode() {
        return this.q.hashCode() + super.o.hashCode();
    }
}
