/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.lang.Throwable
 */
package R2;

import A2.n;
import R2.G2;
import R2.Y1;
import R2.a2;

public final class J2
implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ G2 b;

    public J2(G2 g22, String string2) {
        this.b = g22;
        n.i(string2);
        this.a = string2;
    }

    public final void uncaughtException(Thread thread, Throwable throwable) {
        synchronized (this) {
            this.b.j().G().b(this.a, (Object)throwable);
            return;
        }
    }
}

