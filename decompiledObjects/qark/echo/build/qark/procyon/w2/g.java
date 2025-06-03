// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w2;

import android.os.Build$VERSION;
import android.util.Log;

public final class g extends ClassLoader
{
    public final Class loadClass(final String s, final boolean resolve) {
        if ("com.google.android.gms.iid.MessengerCompat".equals(s)) {
            if (Log.isLoggable("CloudMessengerCompat", 3) || (Build$VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3))) {
                Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
            }
            return h.class;
        }
        return super.loadClass(s, resolve);
    }
}
