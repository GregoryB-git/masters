/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.Callable
 */
package P4;

import P4.m;
import P4.s;
import java.util.concurrent.Callable;

public final class h
implements Callable {
    public final /* synthetic */ m o;
    public final /* synthetic */ s p;

    public /* synthetic */ h(m m8, s s8) {
        this.o = m8;
        this.p = s8;
    }

    public final Object call() {
        return m.a(this.o, this.p);
    }
}

