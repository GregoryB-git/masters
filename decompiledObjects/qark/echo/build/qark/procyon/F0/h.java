// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import java.util.Arrays;

public final class h implements M
{
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;
    
    public h(final int[] b, final long[] c, final long[] d, final long[] e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        final int length = b.length;
        this.a = length;
        if (length > 0) {
            this.f = d[length - 1] + e[length - 1];
            return;
        }
        this.f = 0L;
    }
    
    public int a(final long n) {
        return g0.M.h(this.e, n, true, true);
    }
    
    @Override
    public boolean h() {
        return true;
    }
    
    @Override
    public a j(final long n) {
        final int a = this.a(n);
        final N n2 = new N(this.e[a], this.c[a]);
        if (n2.a < n && a != this.a - 1) {
            final long[] e = this.e;
            final int n3 = a + 1;
            return new a(n2, new N(e[n3], this.c[n3]));
        }
        return new a(n2);
    }
    
    @Override
    public long l() {
        return this.f;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ChunkIndex(length=");
        sb.append(this.a);
        sb.append(", sizes=");
        sb.append(Arrays.toString(this.b));
        sb.append(", offsets=");
        sb.append(Arrays.toString(this.c));
        sb.append(", timeUs=");
        sb.append(Arrays.toString(this.e));
        sb.append(", durationsUs=");
        sb.append(Arrays.toString(this.d));
        sb.append(")");
        return sb.toString();
    }
}
