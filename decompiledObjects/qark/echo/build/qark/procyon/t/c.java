// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t;

public final class c
{
    public int[] a;
    public int b;
    public int c;
    public int d;
    
    public c() {
        this(8);
    }
    
    public c(final int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i <= 1073741824) {
            int n = i;
            if (Integer.bitCount(i) != 1) {
                n = Integer.highestOneBit(i - 1) << 1;
            }
            this.d = n - 1;
            this.a = new int[n];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30");
    }
    
    public void a(int c) {
        final int[] a = this.a;
        final int c2 = this.c;
        a[c2] = c;
        c = (this.d & c2 + 1);
        this.c = c;
        if (c == this.b) {
            this.c();
        }
    }
    
    public void b() {
        this.c = this.b;
    }
    
    public final void c() {
        final int[] a = this.a;
        final int length = a.length;
        final int b = this.b;
        final int n = length - b;
        final int n2 = length << 1;
        if (n2 >= 0) {
            final int[] a2 = new int[n2];
            System.arraycopy(a, b, a2, 0, n);
            System.arraycopy(this.a, 0, a2, n, this.b);
            this.a = a2;
            this.b = 0;
            this.c = length;
            this.d = n2 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }
    
    public boolean d() {
        return this.b == this.c;
    }
    
    public int e() {
        final int b = this.b;
        if (b != this.c) {
            final int n = this.a[b];
            this.b = (b + 1 & this.d);
            return n;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
