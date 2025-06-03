// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

import O2.a;
import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.Executor;

public final class J implements Executor
{
    public final Handler o;
    
    public J() {
        this.o = new a(Looper.getMainLooper());
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.o.post(runnable);
    }
}
