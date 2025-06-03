/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 */
package O5;

import android.content.Context;
import android.util.Log;

public abstract class a {
    public static Context a;

    public static Context a() {
        return a;
    }

    public static void b(Context context) {
        Log.d((String)"FLTFireContextHolder", (String)"received application context.");
        a = context;
    }
}

