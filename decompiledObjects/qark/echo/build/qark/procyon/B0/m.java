// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B0;

import java.io.IOException;
import x0.u;
import x0.r;
import g0.a;

public interface m
{
    void a(final long p0);
    
    b b(final a p0, final c p1);
    
    long c(final c p0);
    
    int d(final int p0);
    
    public static final class a
    {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        
        public a(final int a, final int b, final int c, final int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public boolean a(final int n) {
            if (n == 1) {
                if (this.a - this.b <= 1) {
                    return false;
                }
            }
            else if (this.c - this.d <= 1) {
                return false;
            }
            return true;
        }
    }
    
    public static final class b
    {
        public final int a;
        public final long b;
        
        public b(final int a, final long b) {
            g0.a.a(b >= 0L);
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class c
    {
        public final r a;
        public final u b;
        public final IOException c;
        public final int d;
        
        public c(final r a, final u b, final IOException c, final int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
}
