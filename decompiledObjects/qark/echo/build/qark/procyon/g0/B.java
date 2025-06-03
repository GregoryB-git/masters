// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

import android.os.Handler;
import android.os.Handler$Callback;
import android.os.Looper;
import android.os.SystemClock;

public class B implements c
{
    @Override
    public long a() {
        return System.currentTimeMillis();
    }
    
    @Override
    public long b() {
        return SystemClock.elapsedRealtime();
    }
    
    @Override
    public long c() {
        return System.nanoTime();
    }
    
    @Override
    public long d() {
        return SystemClock.uptimeMillis();
    }
    
    @Override
    public k e(final Looper looper, final Handler$Callback handler$Callback) {
        return new C(new Handler(looper, handler$Callback));
    }
    
    @Override
    public void f() {
    }
}
