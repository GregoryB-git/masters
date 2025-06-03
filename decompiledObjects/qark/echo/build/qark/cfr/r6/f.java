/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package r6;

import r6.a;
import r6.b;
import r6.d;
import r6.l;

public abstract class f {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final d a(int n8, a object, g6.l l8) {
        if (n8 != -2) {
            if (n8 != -1) {
                if (n8 != 0) {
                    if (n8 == Integer.MAX_VALUE) return new b(Integer.MAX_VALUE, l8);
                    if (object != a.o) return new l(n8, (a)((Object)object), l8);
                    return new b(n8, l8);
                }
                if (object != a.o) return new l(1, (a)((Object)object), l8);
                return new b(0, l8);
            }
            if (object != a.o) throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            return new l(1, a.p, l8);
        }
        if (object != a.o) return new l(1, (a)((Object)object), l8);
        return new b(d.a.a(), l8);
    }

    public static /* synthetic */ d b(int n8, a a8, g6.l l8, int n9, Object object) {
        if ((n9 & 1) != 0) {
            n8 = 0;
        }
        if ((n9 & 2) != 0) {
            a8 = a.o;
        }
        if ((n9 & 4) != 0) {
            l8 = null;
        }
        return f.a(n8, a8, l8);
    }
}

