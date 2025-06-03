// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

public final class F
{
    public final String a;
    
    public F(final String a) {
        this.a = a;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append('<');
        sb.append(this.a);
        sb.append('>');
        return sb.toString();
    }
}
