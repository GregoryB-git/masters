// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

public final class A
{
    public static final A c;
    public static final A d;
    public final int a;
    public final int b;
    
    static {
        c = new A(-1, -1);
        d = new A(0, 0);
    }
    
    public A(final int a, final int b) {
        g0.a.a((a == -1 || a >= 0) && (b == -1 || b >= 0));
        this.a = a;
        this.b = b;
    }
    
    public int a() {
        return this.b;
    }
    
    public int b() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = false;
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        boolean b2 = b;
        if (o instanceof A) {
            final A a = (A)o;
            b2 = b;
            if (this.a == a.a) {
                b2 = b;
                if (this.b == a.b) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        final int b = this.b;
        final int a = this.a;
        return b ^ (a >>> 16 | a << 16);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("x");
        sb.append(this.b);
        return sb.toString();
    }
}
