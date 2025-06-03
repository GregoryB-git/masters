// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d4;

import Y3.m;

public class t extends k
{
    public final String q;
    
    public t(final String q, final n n) {
        super(n);
        this.q = q;
    }
    
    @Override
    public String O(final n.b obj) {
        final int n = t$a.a[obj.ordinal()];
        String j;
        StringBuilder sb3;
        if (n != 1) {
            if (n != 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid hash version for string node: ");
                sb.append(obj);
                throw new IllegalArgumentException(sb.toString());
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(this.T(obj));
            sb2.append("string:");
            j = m.j(this.q);
            sb3 = sb2;
        }
        else {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(this.T(obj));
            sb4.append("string:");
            final String q = this.q;
            sb3 = sb4;
            j = q;
        }
        sb3.append(j);
        return sb3.toString();
    }
    
    @Override
    public b S() {
        return b.r;
    }
    
    public int V(final t t) {
        return this.q.compareTo(t.q);
    }
    
    public t W(final n n) {
        return new t(this.q, n);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof t;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final t t = (t)o;
        boolean b3 = b2;
        if (this.q.equals(t.q)) {
            b3 = b2;
            if (super.o.equals(t.o)) {
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
