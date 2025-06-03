// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E;

import android.os.UserManager;
import android.os.Build$VERSION;
import android.content.Context;

public abstract class r
{
    public static boolean a(final Context context) {
        return Build$VERSION.SDK_INT < 24 || a.a(context);
    }
    
    public abstract static class a
    {
        public static boolean a(final Context context) {
            return ((UserManager)context.getSystemService((Class)UserManager.class)).isUserUnlocked();
        }
    }
}
