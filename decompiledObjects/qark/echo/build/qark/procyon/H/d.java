// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H;

public class d
{
    public final Object a;
    public final Object b;
    
    public d(final Object a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof d;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final d d = (d)o;
        boolean b3 = b2;
        if (c.a(d.a, this.a)) {
            b3 = b2;
            if (c.a(d.b, this.b)) {
                b3 = true;
            }
        }
        return b3;
    }
    
    @Override
    public int hashCode() {
        final Object a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Object b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 ^ hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Pair{");
        sb.append(this.a);
        sb.append(" ");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
