// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c1;

import java.util.List;
import g0.g;

public abstract class i
{
    public static int a(final k k, final long n) {
        if (n == -9223372036854775807L) {
            return 0;
        }
        int n2;
        if ((n2 = k.c(n)) == -1) {
            n2 = k.j();
        }
        int n3;
        if ((n3 = n2) > 0) {
            n3 = n2;
            if (k.e(n2 - 1) == n) {
                n3 = n2 - 1;
            }
        }
        return n3;
    }
    
    public static void b(final k k, final int n, final g g) {
        final long e = k.e(n);
        final List h = k.h(e);
        if (h.isEmpty()) {
            return;
        }
        if (n != k.j() - 1) {
            final long n2 = k.e(n + 1) - k.e(n);
            if (n2 > 0L) {
                g.accept(new e(h, e, n2));
            }
            return;
        }
        throw new IllegalStateException();
    }
    
    public static void c(final k k, final t.b b, final g g) {
        final int a = a(k, b.a);
        final long a2 = b.a;
        final boolean b2 = false;
        boolean b3 = false;
        Label_0113: {
            if (a2 != -9223372036854775807L && a < k.j()) {
                final List h = k.h(b.a);
                final long e = k.e(a);
                if (!h.isEmpty()) {
                    final long a3 = b.a;
                    if (a3 < e) {
                        g.accept(new e(h, a3, e - a3));
                        b3 = true;
                        break Label_0113;
                    }
                }
            }
            b3 = false;
        }
        for (int i = a; i < k.j(); ++i) {
            b(k, i, g);
        }
        if (b.b) {
            int n = a;
            int j = b2 ? 1 : 0;
            if (b3) {
                n = a - 1;
                j = (b2 ? 1 : 0);
            }
            while (j < n) {
                b(k, j, g);
                ++j;
            }
            if (b3) {
                g.accept(new e(k.h(b.a), k.e(n), b.a - k.e(n)));
            }
        }
    }
}
