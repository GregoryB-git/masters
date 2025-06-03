/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.Executor
 */
package w6;

import X5.g;
import X5.h;
import java.util.concurrent.Executor;
import l6.d;
import p6.F;
import p6.g0;
import u6.G;
import w6.m;

public final class b
extends g0
implements Executor {
    public static final b r = new b();
    public static final F s = m.q.G(G.g("kotlinx.coroutines.io.parallelism", d.a(64, G.a()), 0, 0, 12, null));

    @Override
    public void E(g g8, Runnable runnable) {
        s.E(g8, runnable);
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public void execute(Runnable runnable) {
        this.E(h.o, runnable);
    }

    @Override
    public String toString() {
        return "Dispatchers.IO";
    }
}

