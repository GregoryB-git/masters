/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.Callable
 */
package o4;

import java.util.concurrent.Callable;
import o4.f;

public final class e
implements Callable {
    public final /* synthetic */ f o;

    public /* synthetic */ e(f f8) {
        this.o = f8;
    }

    public final Object call() {
        return f.f(this.o);
    }
}

