/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package y6;

import u6.F;
import u6.G;
import y6.f;

public abstract class e {
    public static final int a = G.g("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
    public static final F b = new F("PERMIT");
    public static final F c = new F("TAKEN");
    public static final F d = new F("BROKEN");
    public static final F e = new F("CANCELLED");
    public static final int f = G.g("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    public static final /* synthetic */ f a(long l8, f f8) {
        return e.h(l8, f8);
    }

    public static final /* synthetic */ F b() {
        return d;
    }

    public static final /* synthetic */ F c() {
        return e;
    }

    public static final /* synthetic */ int d() {
        return a;
    }

    public static final /* synthetic */ F e() {
        return b;
    }

    public static final /* synthetic */ int f() {
        return f;
    }

    public static final /* synthetic */ F g() {
        return c;
    }

    public static final f h(long l8, f f8) {
        return new f(l8, f8, 0);
    }
}

