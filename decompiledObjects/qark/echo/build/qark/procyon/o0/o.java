// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package o0;

public final class o
{
    public final String a;
    public final String b;
    
    public o(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        return sb.toString();
    }
}
