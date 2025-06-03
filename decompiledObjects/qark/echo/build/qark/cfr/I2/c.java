/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  java.lang.InterruptedException
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.ThreadGroup
 */
package I2;

import android.os.Process;

public final class c
extends Thread {
    public c(ThreadGroup threadGroup, String string2) {
        super(threadGroup, "GmsDynamite");
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
        Process.setThreadPriority((int)19);
        // MONITORENTER : this
        do {
            this.wait();
        } while (true);
        catch (InterruptedException interruptedException) {
            return;
        }
    }
}

