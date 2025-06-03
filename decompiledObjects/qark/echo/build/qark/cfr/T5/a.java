/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Object
 */
package T5;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import m.b;

public abstract class a {
    public static Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        return new Handler(looper);
    }
}

