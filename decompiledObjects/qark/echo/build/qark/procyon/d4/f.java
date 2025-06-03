// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d4;

import Y3.m;

public class f extends k
{
    public final Double q;
    
    public f(final Double q, final n n) {
        super(n);
        this.q = q;
    }
    
    @Override
    public String O(final n.b b) {
        final String t = this.T(b);
        final StringBuilder sb = new StringBuilder();
        sb.append(t);
        sb.append("number:");
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(m.c(this.q));
        return sb2.toString();
    }
    
    @Override
    public b S() {
        return b.q;
    }
    
    public int V(final f f) {
        return this.q.compareTo(f.q);
    }
    
    public f W(final n n) {
        m.f(r.b(n));
        return new f(this.q, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof f;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final f f = (f)o;
        boolean b3 = b2;
        if (this.q.equals(f.q)) {
            b3 = b2;
            if (super.o.equals(f.o)) {
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
