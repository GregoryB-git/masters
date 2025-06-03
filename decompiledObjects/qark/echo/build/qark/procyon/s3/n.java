// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s3;

import android.os.SystemClock;

public abstract class n
{
    public static n a(final long n, final long n2, final long n3) {
        return new a(n, n2, n3);
    }
    
    public static n e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }
    
    public abstract long b();
    
    public abstract long c();
    
    public abstract long d();
}
