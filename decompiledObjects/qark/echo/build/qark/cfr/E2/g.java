/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package E2;

import A2.n;
import android.content.Context;
import android.util.Log;

public abstract class g {
    public static final String[] a = new String[]{"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable throwable) {
        try {
            n.i((Object)context);
            n.i((Object)throwable);
        }
        catch (Exception exception) {
            Log.e((String)"CrashUtils", (String)"Error adding exception to DropBox!", (Throwable)exception);
        }
        return false;
    }
}

