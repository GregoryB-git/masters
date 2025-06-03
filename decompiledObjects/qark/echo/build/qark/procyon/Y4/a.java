// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y4;

import java.util.Arrays;

public final class a implements Cloneable
{
    public int[] o;
    public int p;
    
    public a() {
        this.p = 0;
        this.o = new int[1];
    }
    
    public a(final int[] o, final int p2) {
        this.o = o;
        this.p = p2;
    }
    
    public static int[] o(final int n) {
        return new int[(n + 31) / 32];
    }
    
    public void a(final boolean b) {
        this.g(this.p + 1);
        if (b) {
            final int[] o = this.o;
            final int p = this.p;
            final int n = p / 32;
            o[n] |= 1 << (p & 0x1F);
        }
        ++this.p;
    }
    
    public void b(final a a) {
        final int p = a.p;
        this.g(this.p + p);
        for (int i = 0; i < p; ++i) {
            this.a(a.j(i));
        }
    }
    
    public void d(final int n, int i) {
        if (i >= 0 && i <= 32) {
            this.g(this.p + i);
            while (i > 0) {
                boolean b = true;
                if ((n >> i - 1 & 0x1) != 0x1) {
                    b = false;
                }
                this.a(b);
                --i;
            }
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return this.p == a.p && Arrays.equals(this.o, a.o);
    }
    
    public a f() {
        return new a(this.o.clone(), this.p);
    }
    
    public final void g(final int n) {
        if (n > this.o.length << 5) {
            final int[] o = o(n);
            final int[] o2 = this.o;
            System.arraycopy(o2, 0, o, 0, o2.length);
            this.o = o;
        }
    }
    
    @Override
    public int hashCode() {
        return this.p * 31 + Arrays.hashCode(this.o);
    }
    
    public boolean j(final int n) {
        return (1 << (n & 0x1F) & this.o[n / 32]) != 0x0;
    }
    
    public int l() {
        return this.p;
    }
    
    public int n() {
        return (this.p + 7) / 8;
    }
    
    public void p(int i, final byte[] array, final int n, final int n2) {
        final int n3 = 0;
        int n4 = i;
        int n5;
        int j;
        int n6;
        for (i = n3; i < n2; ++i) {
            for (j = (n5 = 0); j < 8; ++j, n5 = n6) {
                n6 = n5;
                if (this.j(n4)) {
                    n6 = (n5 | 1 << 7 - j);
                }
                ++n4;
            }
            array[n + i] = (byte)n5;
        }
    }
    
    public void s(final a a) {
        if (this.p == a.p) {
            int n = 0;
            while (true) {
                final int[] o = this.o;
                if (n >= o.length) {
                    break;
                }
                o[n] ^= a.o[n];
                ++n;
            }
            return;
        }
        throw new IllegalArgumentException("Sizes don't match");
    }
    
    @Override
    public String toString() {
        final int p = this.p;
        final StringBuilder sb = new StringBuilder(p + p / 8 + 1);
        for (int i = 0; i < this.p; ++i) {
            if ((i & 0x7) == 0x0) {
                sb.append(' ');
            }
            char c;
            if (this.j(i)) {
                c = 'X';
            }
            else {
                c = '.';
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
