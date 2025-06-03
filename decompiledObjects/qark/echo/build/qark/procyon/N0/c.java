// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N0;

import U0.a;
import java.util.List;

public final class c
{
    public final long a;
    public final List b;
    
    public c(final long a, final List b) {
        this.a = a;
        this.b = b;
    }
    
    public U0.a a(long n) {
        if (this.b.size() < 2) {
            return null;
        }
        int i = this.b.size() - 1;
        final long n2 = n;
        long n3 = n = -1L;
        long n5;
        final long n4 = n5 = n;
        boolean b = false;
        long n6 = n4;
        long n7 = n;
        n = n2;
        while (i >= 0) {
            final a a = this.b.get(i);
            b |= "video/mp4".equals(a.a);
            long n8;
            if (i == 0) {
                n8 = n - a.d;
                n = 0L;
            }
            else {
                final long n9 = n - a.c;
                n8 = n;
                n = n9;
            }
            if (b && n != n8) {
                n5 = n8 - n;
                n6 = n;
                b = false;
            }
            if (i == 0) {
                n3 = n;
                n7 = n8;
            }
            --i;
        }
        if (n6 == -1L || n5 == -1L || n3 == -1L) {
            return null;
        }
        if (n7 == -1L) {
            return null;
        }
        return new U0.a(n3, n7, this.a, n6, n5);
    }
    
    public static final class a
    {
        public final String a;
        public final String b;
        public final long c;
        public final long d;
        
        public a(final String a, final String b, final long c, final long d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
}
