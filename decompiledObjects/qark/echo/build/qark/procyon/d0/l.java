// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import g0.a;
import g0.M;

public final class l
{
    public static final l e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    
    static {
        e = new b(0).e();
        f = M.w0(0);
        g = M.w0(1);
        h = M.w0(2);
        i = M.w0(3);
    }
    
    public l(final b b) {
        this.a = l.b.a(b);
        this.b = l.b.b(b);
        this.c = l.b.c(b);
        this.d = l.b.d(b);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof l)) {
            return false;
        }
        final l l = (l)o;
        return this.a == l.a && this.b == l.b && this.c == l.c && M.c(this.d, l.d);
    }
    
    @Override
    public int hashCode() {
        final int a = this.a;
        final int b = this.b;
        final int c = this.c;
        final String d = this.d;
        int hashCode;
        if (d == null) {
            hashCode = 0;
        }
        else {
            hashCode = d.hashCode();
        }
        return (((527 + a) * 31 + b) * 31 + c) * 31 + hashCode;
    }
    
    public static final class b
    {
        public final int a;
        public int b;
        public int c;
        public String d;
        
        public b(final int a) {
            this.a = a;
        }
        
        public static /* synthetic */ int a(final b b) {
            return b.a;
        }
        
        public static /* synthetic */ int b(final b b) {
            return b.b;
        }
        
        public static /* synthetic */ int c(final b b) {
            return b.c;
        }
        
        public static /* synthetic */ String d(final b b) {
            return b.d;
        }
        
        public l e() {
            g0.a.a(this.b <= this.c);
            return new l(this, null);
        }
        
        public b f(final int c) {
            this.c = c;
            return this;
        }
        
        public b g(final int b) {
            this.b = b;
            return this;
        }
    }
}
