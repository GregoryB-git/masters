/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicReference
 */
package R2;

import R2.C3;
import R2.K;
import R2.P1;
import R2.S1;
import R2.g;
import java.util.concurrent.atomic.AtomicReference;

public final class e4
implements Runnable {
    public final /* synthetic */ AtomicReference o;
    public final /* synthetic */ C3 p;

    public e4(C3 c32, AtomicReference atomicReference) {
        this.p = c32;
        this.o = atomicReference;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void run() {
        AtomicReference atomicReference = this.o;
        // MONITORENTER : atomicReference
        this.o.set((Object)this.p.f().u(this.p.p().F(), K.P));
        {
            catch (Throwable throwable) {
                this.o.notify();
                throw throwable;
            }
        }
        this.o.notify();
        // MONITOREXIT : atomicReference
        return;
    }
}

