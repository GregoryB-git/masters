// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package K0;

import F0.f;
import F0.s;
import F0.y;
import java.util.Objects;
import F0.B;
import F0.e;

public final class b extends e
{
    public b(final B obj, final int n, final long n2, final long n3) {
        Objects.requireNonNull(obj);
        super((d)new K0.a(obj), (f)new b(obj, n, null), obj.f(), 0L, obj.j, n2, n3, obj.d(), Math.max(6, obj.c));
    }
    
    public static final class b implements f
    {
        public final B a;
        public final int b;
        public final y.a c;
        
        public b(final B a, final int b) {
            this.a = a;
            this.b = b;
            this.c = new y.a();
        }
        
        @Override
        public e a(final s s, final long n) {
            final long p2 = s.p();
            final long c = this.c(s);
            final long m = s.m();
            s.o(Math.max(6, this.a.c));
            final long c2 = this.c(s);
            final long i = s.m();
            if (c <= n && c2 > n) {
                return e.e(m);
            }
            if (c2 <= n) {
                return e.f(c2, i);
            }
            return e.d(c, p2);
        }
        
        public final long c(final s s) {
            while (s.m() < s.a() - 6L && !y.h(s, this.a, this.b, this.c)) {
                s.o(1);
            }
            if (s.m() >= s.a() - 6L) {
                s.o((int)(s.a() - s.m()));
                return this.a.j;
            }
            return this.c.a;
        }
    }
}
