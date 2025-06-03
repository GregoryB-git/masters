/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 */
package w2;

import android.os.Build;
import android.util.Log;
import w2.h;

public final class g
extends ClassLoader {
    public final Class loadClass(String string2, boolean bl) {
        if ("com.google.android.gms.iid.MessengerCompat".equals((Object)string2)) {
            if (Log.isLoggable((String)"CloudMessengerCompat", (int)3) || Build.VERSION.SDK_INT == 23 && Log.isLoggable((String)"CloudMessengerCompat", (int)3)) {
                Log.d((String)"CloudMessengerCompat", (String)"Using renamed FirebaseIidMessengerCompat class");
            }
            return h.class;
        }
        return super.loadClass(string2, bl);
    }
}

