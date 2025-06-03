/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 */
package K2;

import android.os.Build;

public abstract class h {
    public static final int a;

    static {
        int n8 = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
        a = n8;
    }
}

