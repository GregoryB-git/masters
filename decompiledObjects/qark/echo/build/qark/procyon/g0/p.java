// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

import java.util.Arrays;

public final class p
{
    public int a;
    public long[] b;
    
    public p() {
        this(32);
    }
    
    public p(final int n) {
        this.b = new long[n];
    }
    
    public void a(final long n) {
        final int a = this.a;
        final long[] b = this.b;
        if (a == b.length) {
            this.b = Arrays.copyOf(b, a * 2);
        }
        this.b[this.a++] = n;
    }
    
    public long b(final int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(this.a);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    public int c() {
        return this.a;
    }
}
