// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import g0.a;
import W2.k;

public final class y0
{
    public final long a;
    public final float b;
    public final long c;
    
    public y0(final b b) {
        this.a = y0.b.a(b);
        this.b = y0.b.b(b);
        this.c = y0.b.c(b);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof y0)) {
            return false;
        }
        final y0 y0 = (y0)o;
        return this.a == y0.a && this.b == y0.b && this.c == y0.c;
    }
    
    @Override
    public int hashCode() {
        return k.b(this.a, this.b, this.c);
    }
    
    public static final class b
    {
        public long a;
        public float b;
        public long c;
        
        public b() {
            this.a = -9223372036854775807L;
            this.b = -3.4028235E38f;
            this.c = -9223372036854775807L;
        }
        
        public static /* synthetic */ long a(final b b) {
            return b.a;
        }
        
        public static /* synthetic */ float b(final b b) {
            return b.b;
        }
        
        public static /* synthetic */ long c(final b b) {
            return b.c;
        }
        
        public y0 d() {
            return new y0(this, null);
        }
        
        public b e(final long c) {
            g0.a.a(c >= 0L || c == -9223372036854775807L);
            this.c = c;
            return this;
        }
        
        public b f(final long a) {
            this.a = a;
            return this;
        }
        
        public b g(final float b) {
            g0.a.a(b > 0.0f || b == -3.4028235E38f);
            this.b = b;
            return this;
        }
    }
}
