// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y0;

import F0.n;
import g0.o;
import F0.T;
import x0.P;

public final class c implements b
{
    public final int[] a;
    public final P[] b;
    
    public c(final int[] a, final P[] b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public T a(int n, final int i) {
        n = 0;
        while (true) {
            final int[] a = this.a;
            if (n >= a.length) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unmatched track of type: ");
                sb.append(i);
                o.c("BaseMediaChunkOutput", sb.toString());
                return new n();
            }
            if (i == a[n]) {
                return this.b[n];
            }
            ++n;
        }
    }
    
    public int[] b() {
        final int[] array = new int[this.b.length];
        int n = 0;
        while (true) {
            final P[] b = this.b;
            if (n >= b.length) {
                break;
            }
            array[n] = b[n].H();
            ++n;
        }
        return array;
    }
    
    public void c(final long n) {
        final P[] b = this.b;
        for (int length = b.length, i = 0; i < length; ++i) {
            b[i].b0(n);
        }
    }
}
