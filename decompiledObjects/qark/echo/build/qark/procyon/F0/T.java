// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import java.util.Arrays;
import d0.q;
import d0.i;
import g0.z;

public interface T
{
    void a(final z p0, final int p1, final int p2);
    
    void b(final long p0, final int p1, final int p2, final int p3, final a p4);
    
    int c(final i p0, final int p1, final boolean p2, final int p3);
    
    void d(final q p0);
    
    void e(final z p0, final int p1);
    
    int f(final i p0, final int p1, final boolean p2);
    
    public static final class a
    {
        public final int a;
        public final byte[] b;
        public final int c;
        public final int d;
        
        public a(final int a, final byte[] b, final int c, final int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null) {
                return false;
            }
            if (a.class != o.getClass()) {
                return false;
            }
            final a a = (a)o;
            return this.a == a.a && this.c == a.c && this.d == a.d && Arrays.equals(this.b, a.b);
        }
        
        @Override
        public int hashCode() {
            return ((this.a * 31 + Arrays.hashCode(this.b)) * 31 + this.c) * 31 + this.d;
        }
    }
}
