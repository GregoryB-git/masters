// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W2;

public final class p extends l
{
    private static final long serialVersionUID = 0L;
    public final Object o;
    
    public p(final Object o) {
        this.o = o;
    }
    
    @Override
    public Object b() {
        return this.o;
    }
    
    @Override
    public boolean c() {
        return true;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof p && this.o.equals(((p)o).o);
    }
    
    @Override
    public int hashCode() {
        return this.o.hashCode() + 1502476572;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Optional.of(");
        sb.append(this.o);
        sb.append(")");
        return sb.toString();
    }
}
