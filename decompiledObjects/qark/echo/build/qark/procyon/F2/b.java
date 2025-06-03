// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F2;

import android.os.Process;

public final class b implements Runnable
{
    public final Runnable o;
    
    public b(final Runnable o, final int n) {
        this.o = o;
    }
    
    @Override
    public final void run() {
        Process.setThreadPriority(0);
        this.o.run();
    }
}
