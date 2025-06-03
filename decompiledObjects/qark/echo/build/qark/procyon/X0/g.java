// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X0;

import F0.s;

public final class g
{
    public static final long[] d;
    public final byte[] a;
    public int b;
    public int c;
    
    static {
        d = new long[] { 128L, 64L, 32L, 16L, 8L, 4L, 2L, 1L };
    }
    
    public g() {
        this.a = new byte[8];
    }
    
    public static long a(final byte[] array, final int n, final boolean b) {
        long n3;
        final long n2 = n3 = ((long)array[0] & 0xFFL);
        if (b) {
            n3 = (n2 & g.d[n - 1]);
        }
        for (int i = 1; i < n; ++i) {
            n3 = (n3 << 8 | ((long)array[i] & 0xFFL));
        }
        return n3;
    }
    
    public static int c(final int n) {
        int n2 = 0;
        long n3;
        long n4;
        int n5;
        do {
            final long[] d = g.d;
            if (n2 >= d.length) {
                return -1;
            }
            n3 = d[n2];
            n4 = n;
            n5 = ++n2;
        } while ((n3 & n4) == 0x0L);
        return n5;
    }
    
    public int b() {
        return this.c;
    }
    
    public long d(final s s, final boolean b, final boolean b2, final int n) {
        if (this.b == 0) {
            if (!s.d(this.a, 0, 1, b)) {
                return -1L;
            }
            if ((this.c = c(this.a[0] & 0xFF)) == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.b = 1;
        }
        final int c = this.c;
        if (c > n) {
            this.b = 0;
            return -2L;
        }
        if (c != 1) {
            s.readFully(this.a, 1, c - 1);
        }
        this.b = 0;
        return a(this.a, this.c, b2);
    }
    
    public void e() {
        this.b = 0;
        this.c = 0;
    }
}
