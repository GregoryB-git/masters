// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y4;

import java.util.Arrays;

public final class b implements Cloneable
{
    public final int o;
    public final int p;
    public final int q;
    public final int[] r;
    
    public b(final int n) {
        this(n, n);
    }
    
    public b(int n, final int p2) {
        if (n > 0 && p2 > 0) {
            this.o = n;
            this.p = p2;
            n = (n + 31) / 32;
            this.q = n;
            this.r = new int[n * p2];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }
    
    public b(final int o, final int p4, final int q, final int[] r) {
        this.o = o;
        this.p = p4;
        this.q = q;
        this.r = r;
    }
    
    public final String a(final String s, final String s2, final String str) {
        final StringBuilder sb = new StringBuilder(this.p * (this.o + 1));
        for (int i = 0; i < this.p; ++i) {
            for (int j = 0; j < this.o; ++j) {
                String str2;
                if (this.f(j, i)) {
                    str2 = s;
                }
                else {
                    str2 = s2;
                }
                sb.append(str2);
            }
            sb.append(str);
        }
        return sb.toString();
    }
    
    public void b() {
        for (int length = this.r.length, i = 0; i < length; ++i) {
            this.r[i] = 0;
        }
    }
    
    public b d() {
        return new b(this.o, this.p, this.q, this.r.clone());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return this.o == b.o && this.p == b.p && this.q == b.q && Arrays.equals(this.r, b.r);
    }
    
    public boolean f(final int n, final int n2) {
        return (this.r[n2 * this.q + n / 32] >>> (n & 0x1F) & 0x1) != 0x0;
    }
    
    public int g() {
        return this.p;
    }
    
    @Override
    public int hashCode() {
        final int o = this.o;
        return (((o * 31 + o) * 31 + this.p) * 31 + this.q) * 31 + Arrays.hashCode(this.r);
    }
    
    public int j() {
        return this.o;
    }
    
    public void l(final int n, int n2) {
        n2 = n2 * this.q + n / 32;
        final int[] r = this.r;
        r[n2] |= 1 << (n & 0x1F);
    }
    
    public void n(final int n, int i, int j, int n2) {
        if (i < 0 || n < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (n2 <= 0 || j <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        final int n3 = j + n;
        n2 += i;
        if (n2 <= this.p && n3 <= this.o) {
            while (i < n2) {
                final int q = this.q;
                int[] r;
                int n4;
                for (j = n; j < n3; ++j) {
                    r = this.r;
                    n4 = j / 32 + q * i;
                    r[n4] |= 1 << (j & 0x1F);
                }
                ++i;
            }
            return;
        }
        throw new IllegalArgumentException("The region must fit inside the matrix");
    }
    
    public String o(final String s, final String s2) {
        return this.a(s, s2, "\n");
    }
    
    @Override
    public String toString() {
        return this.o("X ", "  ");
    }
}
