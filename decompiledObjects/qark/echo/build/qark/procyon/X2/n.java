// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import a3.a;
import java.util.Comparator;
import a3.h;
import a3.f;

public abstract class n
{
    public static final n a;
    public static final n b;
    public static final n c;
    
    static {
        a = new n() {
            @Override
            public n d(final int n, final int n2) {
                return this.k(f.e(n, n2));
            }
            
            @Override
            public n e(final long n, final long n2) {
                return this.k(h.a(n, n2));
            }
            
            @Override
            public n f(final Object o, final Object o2, final Comparator comparator) {
                return this.k(comparator.compare(o, o2));
            }
            
            @Override
            public n g(final boolean b, final boolean b2) {
                return this.k(a3.a.a(b, b2));
            }
            
            @Override
            public n h(final boolean b, final boolean b2) {
                return this.k(a3.a.a(b2, b));
            }
            
            @Override
            public int i() {
                return 0;
            }
            
            public n k(final int n) {
                if (n < 0) {
                    return n.a();
                }
                if (n > 0) {
                    return n.b();
                }
                return n.c();
            }
        };
        b = new b(-1);
        c = new b(1);
    }
    
    public static /* synthetic */ n a() {
        return n.b;
    }
    
    public static /* synthetic */ n b() {
        return n.c;
    }
    
    public static /* synthetic */ n c() {
        return n.a;
    }
    
    public static n j() {
        return n.a;
    }
    
    public abstract n d(final int p0, final int p1);
    
    public abstract n e(final long p0, final long p1);
    
    public abstract n f(final Object p0, final Object p1, final Comparator p2);
    
    public abstract n g(final boolean p0, final boolean p1);
    
    public abstract n h(final boolean p0, final boolean p1);
    
    public abstract int i();
    
    public static final class b extends n
    {
        public final int d;
        
        public b(final int d) {
            super(null);
            this.d = d;
        }
        
        @Override
        public n d(final int n, final int n2) {
            return this;
        }
        
        @Override
        public n e(final long n, final long n2) {
            return this;
        }
        
        @Override
        public n f(final Object o, final Object o2, final Comparator comparator) {
            return this;
        }
        
        @Override
        public n g(final boolean b, final boolean b2) {
            return this;
        }
        
        @Override
        public n h(final boolean b, final boolean b2) {
            return this;
        }
        
        @Override
        public int i() {
            return this.d;
        }
    }
}
