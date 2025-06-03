// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y3;

import java.util.Iterator;
import d4.c;
import d4.n;
import d4.t;
import d4.a;
import d4.l;
import d4.f;
import d4.k;

public abstract class e
{
    public static long a(final k k) {
        final boolean b = k instanceof f;
        long n = 8L;
        if (!b) {
            if (!(k instanceof l)) {
                if (k instanceof a) {
                    n = 4L;
                }
                else {
                    if (!(k instanceof t)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unknown leaf node type: ");
                        sb.append(k.getClass());
                        throw new IllegalArgumentException(sb.toString());
                    }
                    n = ((String)k.getValue()).length() + 2L;
                }
            }
        }
        if (k.t().isEmpty()) {
            return n;
        }
        return n + 24L + a((k)k.t());
    }
    
    public static long b(final n n) {
        if (n.isEmpty()) {
            return 4L;
        }
        if (n.B()) {
            return a((k)n);
        }
        final boolean b = n instanceof c;
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected node type: ");
        sb.append(n.getClass());
        m.g(b, sb.toString());
        final Iterator<d4.m> iterator = (Iterator<d4.m>)n.iterator();
        long n2 = 1L;
        while (iterator.hasNext()) {
            final d4.m m = iterator.next();
            n2 = n2 + m.c().e().length() + 4L + b(m.d());
        }
        long n3 = n2;
        if (!n.t().isEmpty()) {
            n3 = n2 + 12L + a((k)n.t());
        }
        return n3;
    }
    
    public static int c(final n n) {
        final boolean empty = n.isEmpty();
        int n2 = 0;
        if (empty) {
            return 0;
        }
        if (n.B()) {
            return 1;
        }
        final boolean b = n instanceof c;
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected node type: ");
        sb.append(n.getClass());
        m.g(b, sb.toString());
        final Iterator<d4.m> iterator = (Iterator<d4.m>)n.iterator();
        while (iterator.hasNext()) {
            n2 += c(iterator.next().d());
        }
        return n2;
    }
}
