/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.concurrent.Future
 */
package b3;

import java.util.concurrent.Future;

public abstract class g {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object a(Future future) {
        boolean bl = false;
        do {
            Object object;
            block5 : {
                try {
                    object = future.get();
                    if (!bl) break block5;
                }
                catch (Throwable throwable) {
                    if (bl) {
                        Thread.currentThread().interrupt();
                    }
                    throw throwable;
                }
                catch (InterruptedException interruptedException) {}
                Thread.currentThread().interrupt();
            }
            return object;
            bl = true;
        } while (true);
    }
}

