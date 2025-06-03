// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

public final class z
{
    public final q a;
    
    public z(final q a) {
        this.a = a;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Removed[");
        sb.append(this.a);
        sb.append(']');
        return sb.toString();
    }
}
