// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F;

import android.os.Looper;
import android.os.Handler;

public abstract class b
{
    public static Handler a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
