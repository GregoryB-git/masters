// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R3;

import android.os.Looper;
import android.os.Handler;
import V3.j;

public class h implements j
{
    public final Handler a;
    
    public h() {
        this.a = new Handler(Looper.getMainLooper());
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void b(final Runnable runnable) {
        this.a.post(runnable);
    }
}
