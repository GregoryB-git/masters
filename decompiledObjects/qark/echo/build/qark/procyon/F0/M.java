// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import g0.a;

public interface M
{
    boolean h();
    
    a j(final long p0);
    
    long l();
    
    public static final class a
    {
        public final N a;
        public final N b;
        
        public a(final N n) {
            this(n, n);
        }
        
        public a(final N n, final N n2) {
            this.a = (N)g0.a.e(n);
            this.b = (N)g0.a.e(n2);
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
            return this.a.equals(a.a) && this.b.equals(a.b);
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode() * 31 + this.b.hashCode();
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.a);
            String string;
            if (this.a.equals(this.b)) {
                string = "";
            }
            else {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(", ");
                sb2.append(this.b);
                string = sb2.toString();
            }
            sb.append(string);
            sb.append("]");
            return sb.toString();
        }
    }
    
    public static class b implements M
    {
        public final long a;
        public final a b;
        
        public b(final long n) {
            this(n, 0L);
        }
        
        public b(final long a, final long n) {
            this.a = a;
            N c;
            if (n == 0L) {
                c = N.c;
            }
            else {
                c = new N(0L, n);
            }
            this.b = new a(c);
        }
        
        @Override
        public boolean h() {
            return false;
        }
        
        @Override
        public a j(final long n) {
            return this.b;
        }
        
        @Override
        public long l() {
            return this.a;
        }
    }
}
