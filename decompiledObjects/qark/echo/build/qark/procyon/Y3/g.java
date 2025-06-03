// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y3;

public final class g
{
    public final Object a;
    public final Object b;
    
    public g(final Object a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    public Object a() {
        return this.a;
    }
    
    public Object b() {
        return this.b;
    }
    
    @Override
    public boolean equals(Object b) {
        if (this == b) {
            return true;
        }
        if (b == null) {
            return false;
        }
        if (g.class != b.getClass()) {
            return false;
        }
        final g g = (g)b;
        final Object a = this.a;
        if (a != null) {
            if (!a.equals(g.a)) {
                return false;
            }
        }
        else if (g.a != null) {
            return false;
        }
        final Object b2 = this.b;
        b = g.b;
        if (b2 != null) {
            if (!b2.equals(b)) {
                return false;
            }
        }
        else if (b != null) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final Object a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final Object b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Pair(");
        sb.append(this.a);
        sb.append(",");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
