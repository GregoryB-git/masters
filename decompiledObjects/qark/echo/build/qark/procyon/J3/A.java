// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

public final class A extends c
{
    public final String a;
    public final String b;
    public final boolean c;
    
    public A(final String a, final String b, final boolean c) {
        if (a == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            this.c = c;
            return;
        }
        throw new NullPointerException("Null osCodeName");
    }
    
    @Override
    public boolean b() {
        return this.c;
    }
    
    @Override
    public String c() {
        return this.b;
    }
    
    @Override
    public String d() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof c) {
            final c c = (c)o;
            return this.a.equals(c.d()) && this.b.equals(c.c()) && this.c == c.b();
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        int n;
        if (this.c) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        return ((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ n;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("OsData{osRelease=");
        sb.append(this.a);
        sb.append(", osCodeName=");
        sb.append(this.b);
        sb.append(", isRooted=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
