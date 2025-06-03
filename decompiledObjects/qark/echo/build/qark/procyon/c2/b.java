// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c2;

public final class b
{
    public final String a;
    
    public b(final String a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("name is null");
    }
    
    public static b b(final String s) {
        return new b(s);
    }
    
    public String a() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof b && this.a.equals(((b)o).a));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Encoding{name=\"");
        sb.append(this.a);
        sb.append("\"}");
        return sb.toString();
    }
}
