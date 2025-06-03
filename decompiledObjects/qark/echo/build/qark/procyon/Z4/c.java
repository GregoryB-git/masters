// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z4;

import java.util.ArrayList;
import java.util.List;

public final class c
{
    public final a a;
    public final List b;
    
    public c(final a a) {
        this.a = a;
        (this.b = new ArrayList()).add(new b(a, new int[] { 1 }));
    }
    
    public final b a(final int n) {
        if (n >= this.b.size()) {
            final List b = this.b;
            b g = b.get(b.size() - 1);
            for (int i = this.b.size(); i <= n; ++i) {
                final a a = this.a;
                g = g.g(new b(a, new int[] { 1, a.c(i - 1 + a.d()) }));
                this.b.add(g);
            }
        }
        return this.b.get(n);
    }
    
    public void b(final int[] array, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        final int n = array.length - i;
        if (n > 0) {
            final b a = this.a(i);
            final int[] array2 = new int[n];
            System.arraycopy(array, 0, array2, 0, n);
            final int[] d = new b(this.a, array2).h(i, 1).b(a)[1].d();
            int n2;
            for (n2 = i - d.length, i = 0; i < n2; ++i) {
                array[n + i] = 0;
            }
            System.arraycopy(d, 0, array, n + n2, d.length);
            return;
        }
        throw new IllegalArgumentException("No data bytes provided");
    }
}
