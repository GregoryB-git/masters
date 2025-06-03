/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Thread
 *  java.util.concurrent.locks.LockSupport
 */
package p6;

import java.util.concurrent.locks.LockSupport;
import p6.a0;
import p6.c;

public abstract class c0
extends a0 {
    public abstract Thread T();

    public final void U() {
        Thread thread = this.T();
        if (Thread.currentThread() != thread) {
            c.a();
            LockSupport.unpark((Thread)thread);
        }
    }
}

