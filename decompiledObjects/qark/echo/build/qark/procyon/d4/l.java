// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d4;

import Y3.m;

public class l extends k
{
    public final long q;
    
    public l(final Long n, final n n2) {
        super(n2);
        this.q = n;
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
        sb2.append(m.c((double)this.q));
        return sb2.toString();
    }
    
    @Override
    public b S() {
        return b.q;
    }
    
    public int V(final l l) {
        return m.b(this.q, l.q);
    }
    
    public l W(final n n) {
        return new l(this.q, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof l;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final l l = (l)o;
        boolean b3 = b2;
        if (this.q == l.q) {
            b3 = b2;
            if (super.o.equals(l.o)) {
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
        final long q = this.q;
        return (int)(q ^ q >>> 32) + super.o.hashCode();
    }
}
