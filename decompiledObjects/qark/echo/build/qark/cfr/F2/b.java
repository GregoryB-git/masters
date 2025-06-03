/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  java.lang.Object
 *  java.lang.Runnable
 */
package F2;

import android.os.Process;

public final class b
implements Runnable {
    public final Runnable o;

    public b(Runnable runnable, int n8) {
        this.o = runnable;
    }

    public final void run() {
        Process.setThreadPriority((int)0);
        this.o.run();
    }
}

