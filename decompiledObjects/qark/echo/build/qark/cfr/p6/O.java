/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package p6;

import p6.B0;
import p6.N;
import p6.S;
import p6.W;
import u6.G;
import u6.v;

public abstract class O {
    public static final boolean a = G.f("kotlinx.coroutines.main.delay", false);
    public static final S b = O.b();

    public static final S a() {
        return b;
    }

    public static final S b() {
        if (!a) {
            return N.w;
        }
        B0 b02 = W.c();
        if (!v.c(b02) && b02 instanceof S) {
            return (S)((Object)b02);
        }
        return N.w;
    }
}

