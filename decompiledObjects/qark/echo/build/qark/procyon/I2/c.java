// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I2;

import android.os.Process;

public final class c extends Thread
{
    public c(final ThreadGroup group, final String s) {
        super(group, "GmsDynamite");
    }
    
    @Override
    public final void run() {
        Process.setThreadPriority(19);
        // monitorenter(this)
        while (true) {
            try {
                try {
                    while (true) {
                        this.wait();
                    }
                }
                finally {
                    // monitorexit(this)
                    // monitorexit(this)
                    return;
                }
            }
            catch (InterruptedException ex) {}
            continue;
        }
    }
}
