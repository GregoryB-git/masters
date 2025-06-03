// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import java.util.concurrent.locks.LockSupport;

public abstract class c0 extends a0
{
    public abstract Thread T();
    
    public final void U() {
        final Thread t = this.T();
        if (Thread.currentThread() != t) {
            c.a();
            LockSupport.unpark(t);
        }
    }
}
