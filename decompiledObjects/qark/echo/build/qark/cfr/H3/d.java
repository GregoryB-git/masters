/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  java.lang.Object
 *  java.lang.Runnable
 */
package H3;

import android.os.Process;

public abstract class d
implements Runnable {
    public abstract void a();

    public final void run() {
        Process.setThreadPriority((int)10);
        this.a();
    }
}

