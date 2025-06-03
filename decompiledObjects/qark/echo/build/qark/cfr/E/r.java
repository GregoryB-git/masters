/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.UserManager
 *  java.lang.Class
 *  java.lang.Object
 */
package E;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

public abstract class r {
    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(context);
        }
        return true;
    }

    public static abstract class a {
        public static boolean a(Context context) {
            return ((UserManager)context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

}

