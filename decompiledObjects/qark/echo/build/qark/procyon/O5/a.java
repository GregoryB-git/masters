// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O5;

import android.util.Log;
import android.content.Context;

public abstract class a
{
    public static Context a;
    
    public static Context a() {
        return O5.a.a;
    }
    
    public static void b(final Context a) {
        Log.d("FLTFireContextHolder", "received application context.");
        a.a = a;
    }
}
