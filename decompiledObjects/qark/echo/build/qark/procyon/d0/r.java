// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import g0.a;

public class r
{
    public final h a;
    public final int b;
    public final int c;
    public final float d;
    public final long e;
    
    public r(final h a, final int n, final int n2, final float d, final long e) {
        final boolean b = true;
        final boolean b2 = n > 0;
        final StringBuilder sb = new StringBuilder();
        sb.append("width must be positive, but is: ");
        sb.append(n);
        g0.a.b(b2, sb.toString());
        final boolean b3 = n2 > 0 && b;
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("height must be positive, but is: ");
        sb2.append(n2);
        g0.a.b(b3, sb2.toString());
        this.a = a;
        this.b = n;
        this.c = n2;
        this.d = d;
        this.e = e;
    }
    
    public static final class b
    {
        public h a;
        public int b;
        public int c;
        public float d;
        public long e;
        
        public b(final h a, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = 1.0f;
        }
        
        public r a() {
            return new r(this.a, this.b, this.c, this.d, this.e, null);
        }
        
        public b b(final float d) {
            this.d = d;
            return this;
        }
    }
}
