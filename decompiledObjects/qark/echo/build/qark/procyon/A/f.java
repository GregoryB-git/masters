// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A;

import android.graphics.Insets;
import android.graphics.Rect;

public final class f
{
    public static final f e;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    static {
        e = new f(0, 0, 0, 0);
    }
    
    public f(final int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static f a(final f f, final f f2) {
        return b(Math.max(f.a, f2.a), Math.max(f.b, f2.b), Math.max(f.c, f2.c), Math.max(f.d, f2.d));
    }
    
    public static f b(final int n, final int n2, final int n3, final int n4) {
        if (n == 0 && n2 == 0 && n3 == 0 && n4 == 0) {
            return f.e;
        }
        return new f(n, n2, n3, n4);
    }
    
    public static f c(final Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }
    
    public static f d(final Insets insets) {
        return b(b.a(insets), c.a(insets), d.a(insets), A.e.a(insets));
    }
    
    public Insets e() {
        return f.a.a(this.a, this.b, this.c, this.d);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (f.class != o.getClass()) {
            return false;
        }
        final f f = (f)o;
        return this.d == f.d && this.a == f.a && this.c == f.c && this.b == f.b;
    }
    
    @Override
    public int hashCode() {
        return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
    
    public abstract static class a
    {
        public static Insets a(final int n, final int n2, final int n3, final int n4) {
            return Insets.of(n, n2, n3, n4);
        }
    }
}
