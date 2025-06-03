// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C3;

import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.Executor;

public enum B implements Executor
{
    o("INSTANCE", 0);
    
    public static final Handler p;
    
    static {
        p = new Handler(Looper.getMainLooper());
    }
    
    public B(final String name, final int ordinal) {
    }
    
    @Override
    public void execute(final Runnable runnable) {
        B.p.post(runnable);
    }
}
