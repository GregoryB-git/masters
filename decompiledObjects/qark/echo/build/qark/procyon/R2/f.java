// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.Looper;
import android.content.Context;

public final class f
{
    public final boolean a;
    
    public f(final Context context) {
        this.a = false;
    }
    
    public static boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
