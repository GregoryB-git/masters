// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import android.os.Handler;
import d0.I;
import l0.y1;
import i0.y;
import B0.b;
import d0.u;

public interface x
{
    u a();
    
    void c(final E p0);
    
    void d(final c p0);
    
    void e(final v p0);
    
    v f(final b p0, final B0.b p1, final long p2);
    
    void g(final c p0, final y p1, final y1 p2);
    
    void h();
    
    boolean i();
    
    I j();
    
    void k(final Handler p0, final p0.v p1);
    
    void l(final u p0);
    
    void m(final c p0);
    
    void n(final c p0);
    
    void o(final p0.v p0);
    
    void p(final Handler p0, final E p1);
    
    public interface a
    {
    }
    
    public static final class b
    {
        public final Object a;
        public final int b;
        public final int c;
        public final long d;
        public final int e;
        
        public b(final Object o) {
            this(o, -1L);
        }
        
        public b(final Object o, final int n, final int n2, final long n3) {
            this(o, n, n2, n3, -1);
        }
        
        public b(final Object a, final int b, final int c, final long d, final int e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
        
        public b(final Object o, final long n) {
            this(o, -1, -1, n, -1);
        }
        
        public b(final Object o, final long n, final int n2) {
            this(o, -1, -1, n, n2);
        }
        
        public b a(final Object obj) {
            if (this.a.equals(obj)) {
                return this;
            }
            return new b(obj, this.b, this.c, this.d, this.e);
        }
        
        public boolean b() {
            return this.b != -1;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return this.a.equals(b.a) && this.b == b.b && this.c == b.c && this.d == b.d && this.e == b.e;
        }
        
        @Override
        public int hashCode() {
            return ((((527 + this.a.hashCode()) * 31 + this.b) * 31 + this.c) * 31 + (int)this.d) * 31 + this.e;
        }
    }
    
    public interface c
    {
        void a(final x p0, final I p1);
    }
}
