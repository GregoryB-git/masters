/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 */
package L;

import android.os.Build;

public interface b {
    public static final boolean b;

    static {
        boolean bl = Build.VERSION.SDK_INT >= 27;
        b = bl;
    }
}

