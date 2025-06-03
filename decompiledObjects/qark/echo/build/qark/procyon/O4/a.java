// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O4;

public final class a extends f
{
    public final String a;
    public final String b;
    
    public a(final String a, final String b) {
        if (a == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null version");
    }
    
    @Override
    public String b() {
        return this.a;
    }
    
    @Override
    public String c() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof f) {
            final f f = (f)o;
            return this.a.equals(f.b()) && this.b.equals(f.c());
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
