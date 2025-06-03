/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ThreadLocal
 */
package p6;

import p6.a0;
import p6.d0;
import u6.F;
import u6.K;

public final class L0 {
    public static final L0 a = new L0();
    public static final ThreadLocal b = K.a(new F("ThreadLocalEventLoop"));

    public final a0 a() {
        return (a0)b.get();
    }

    public final a0 b() {
        a0 a02;
        ThreadLocal threadLocal = b;
        a0 a03 = a02 = (a0)threadLocal.get();
        if (a02 == null) {
            a03 = d0.a();
            threadLocal.set((Object)a03);
        }
        return a03;
    }

    public final void c() {
        b.set((Object)null);
    }

    public final void d(a0 a02) {
        b.set((Object)a02);
    }
}

