// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z0;

import g0.z;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public abstract class a
{
    public final int a;
    
    public a(final int a) {
        this.a = a;
    }
    
    public static String a(final int n) {
        final StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append((char)(n >> 24 & 0xFF));
        sb.append((char)(n >> 16 & 0xFF));
        sb.append((char)(n >> 8 & 0xFF));
        sb.append((char)(n & 0xFF));
        return sb.toString();
    }
    
    public static int b(final int n) {
        return n & 0xFFFFFF;
    }
    
    public static int c(final int n) {
        return n >> 24 & 0xFF;
    }
    
    @Override
    public String toString() {
        return a(this.a);
    }
    
    public static final class a extends Z0.a
    {
        public final long b;
        public final List c;
        public final List d;
        
        public a(final int n, final long b) {
            super(n);
            this.b = b;
            this.c = new ArrayList();
            this.d = new ArrayList();
        }
        
        public void d(final a a) {
            this.d.add(a);
        }
        
        public void e(final b b) {
            this.c.add(b);
        }
        
        public a f(final int n) {
            for (int size = this.d.size(), i = 0; i < size; ++i) {
                final a a = this.d.get(i);
                if (a.a == n) {
                    return a;
                }
            }
            return null;
        }
        
        public b g(final int n) {
            for (int size = this.c.size(), i = 0; i < size; ++i) {
                final b b = this.c.get(i);
                if (b.a == n) {
                    return b;
                }
            }
            return null;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(Z0.a.a(super.a));
            sb.append(" leaves: ");
            sb.append(Arrays.toString(this.c.toArray()));
            sb.append(" containers: ");
            sb.append(Arrays.toString(this.d.toArray()));
            return sb.toString();
        }
    }
    
    public static final class b extends a
    {
        public final z b;
        
        public b(final int n, final z b) {
            super(n);
            this.b = b;
        }
    }
}
