// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E2;

import android.util.Log;
import A2.n;
import android.content.Context;

public abstract class g
{
    public static final String[] a;
    
    static {
        a = new String[] { "android.", "com.android.", "dalvik.", "java.", "javax." };
    }
    
    public static boolean a(final Context context, final Throwable t) {
        try {
            n.i(context);
            n.i(t);
        }
        catch (Exception ex) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", (Throwable)ex);
        }
        return false;
    }
}
