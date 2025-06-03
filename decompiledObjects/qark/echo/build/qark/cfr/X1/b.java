/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.net.URL
 *  java.util.concurrent.locks.Condition
 *  java.util.concurrent.locks.ReentrantLock
 */
package X1;

import X1.c;
import java.net.URL;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.u;

public final class b
implements Runnable {
    public final /* synthetic */ URL o;
    public final /* synthetic */ u p;
    public final /* synthetic */ String q;
    public final /* synthetic */ ReentrantLock r;
    public final /* synthetic */ Condition s;

    public /* synthetic */ b(URL uRL, u u8, String string2, ReentrantLock reentrantLock, Condition condition) {
        this.o = uRL;
        this.p = u8;
        this.q = string2;
        this.r = reentrantLock;
        this.s = condition;
    }

    public final void run() {
        c.a(this.o, this.p, this.q, this.r, this.s);
    }
}

