/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.Callable
 */
package Q4;

import Q4.e;
import com.google.firebase.remoteconfig.internal.b;
import java.util.concurrent.Callable;

public final class c
implements Callable {
    public final /* synthetic */ e o;
    public final /* synthetic */ b p;

    public /* synthetic */ c(e e8, b b8) {
        this.o = e8;
        this.p = b8;
    }

    public final Object call() {
        return e.b(this.o, this.p);
    }
}

