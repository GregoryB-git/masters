// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

import java.util.NoSuchElementException;

public final class q
{
    public int a;
    public int b;
    public int c;
    public long[] d;
    public int e;
    
    public q() {
        this(16);
    }
    
    public q(int n) {
        g0.a.a(n >= 0 && n <= 1073741824);
        int i = n;
        if (n == 0) {
            i = 1;
        }
        n = i;
        if (Integer.bitCount(i) != 1) {
            n = Integer.highestOneBit(i - 1) << 1;
        }
        this.a = 0;
        this.b = -1;
        this.c = 0;
        final long[] d = new long[n];
        this.d = d;
        this.e = d.length - 1;
    }
    
    public void a() {
        this.a = 0;
        this.b = -1;
        this.c = 0;
    }
    
    public long b() {
        if (this.c != 0) {
            return this.d[this.a];
        }
        throw new NoSuchElementException();
    }
    
    public boolean c() {
        return this.c == 0;
    }
    
    public long d() {
        final int c = this.c;
        if (c != 0) {
            final long[] d = this.d;
            final int a = this.a;
            final long n = d[a];
            this.a = (this.e & a + 1);
            this.c = c - 1;
            return n;
        }
        throw new NoSuchElementException();
    }
}
