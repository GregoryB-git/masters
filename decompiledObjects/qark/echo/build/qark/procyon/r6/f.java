// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package r6;

import g6.l;

public abstract class f
{
    public static final d a(final int n, final a a, final l l) {
        b b;
        if (n != -2) {
            if (n != -1) {
                if (n != 0) {
                    if (n == Integer.MAX_VALUE) {
                        return new b(Integer.MAX_VALUE, l);
                    }
                    if (a == a.o) {
                        return new b(n, l);
                    }
                    return new r6.l(n, a, l);
                }
                else if (a == a.o) {
                    b = new b(0, l);
                }
                else {
                    b = new r6.l(1, a, l);
                }
            }
            else {
                if (a == a.o) {
                    return new r6.l(1, a.p, l);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
        }
        else if (a == a.o) {
            b = new b(d.a.a(), l);
        }
        else {
            b = new r6.l(1, a, l);
        }
        return b;
    }
}
