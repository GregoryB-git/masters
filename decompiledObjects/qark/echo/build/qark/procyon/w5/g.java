// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w5;

import T5.a;
import android.os.Looper;
import android.os.Handler;

public class g implements d
{
    public final Handler a;
    
    public g() {
        this.a = T5.a.a(Looper.getMainLooper());
    }
    
    @Override
    public void a(final Runnable runnable) {
        this.a.post(runnable);
    }
}
